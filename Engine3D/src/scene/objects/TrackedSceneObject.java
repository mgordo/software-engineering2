package scene.objects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import loadpackage.Object3D;

import org.lwjgl.Sys;
import org.lwjgl.util.vector.Quaternion;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import scene.components.BoundingBoxComponent;
import scene.components.ColliderComponent;
import scene.components.RenderComponent;
import scene.components.TransformComponent;
import scene.components.TriggerComponent;
import scene.components.WaitComponent;
import animations.Animation;
import animations.Appear;
import animations.Move;
import animations.Trigger;
import core.Engine3D;
import core.Helper;
import core.Model3D;
import core.TexturedVertex;
import engine3DInterfaces.IItem;
import geometry.Coordinates;
import geometry.Line;

/**
 * Drawable and moveable object. Contains origin and target vectors to meassure
 * the distance to the target point. With the speed value its possible to
 * calculate how long the movement will take. Can be casted to IItem and passed
 * to the PNSim component.
 * 
 * @author Simon, Mikkel
 * 
 */
public class TrackedSceneObject extends DefaultSceneObject implements IItem {
	// FIXME made public for prototype to access waypoints from engine3d to
	// delete all points
	// and add new one of pnsim calls setGeo;
	private LinkedList<Vector3f> waypoints = new LinkedList<Vector3f>();

	// private TransformComponent origin;
	private Vector3f target;
	private float speed = 1.0f;

	private Animation currentActivity;

	private String shape;

	private String geometry;

	private boolean ready;

	private boolean reachedTargetPosition = true;

	/**
	 * Used for collision detection or appear animation to wait. Set by the
	 * engine.
	 */
	private TriggerComponent triggerComponent;

	public TrackedSceneObject(Engine3D engine3dInstance,
			Map<String, List<URI>> list, String shape) {
		super(engine3dInstance, list, shape);
		BoundingBoxComponent bbComp = (BoundingBoxComponent)getComponent(BoundingBoxComponent.class);
		ColliderComponent collider = new ColliderComponent(this, bbComp);
		addComponent(collider);
		triggerComponent = new TriggerComponent(this);
		addComponent(triggerComponent);
	}

	/**
	 * updates the position according to the way points.
	 */
	@Override
	public void update() {
		// if(!getReady()){
		//		((TransformComponent) getComponent(TransformComponent.class)).setForward(forward);
		if (!isWaiting()) {
			if (currentActivity != null) {
				if (currentActivity instanceof Move) {
					move();
				} else if (currentActivity instanceof Trigger) {
					trigger();
				} else if (currentActivity instanceof Appear) {
					appear();
				}
			}
			// }
		}
		super.update();
	}

	private void appear() {

	}

	private void trigger() {
		triggerComponent.waitForTrigger(true);
	}

	/**
	 * Move method.
	 */
	private void move() {

		ColliderComponent collider = ((ColliderComponent) getComponent(ColliderComponent.class));

		if (!collider.currentlyColliding()) {

			if (!reachedTargetPosition) {

				// move to the target
				TransformComponent originTrans = ((TransformComponent) getComponent(TransformComponent.class));

				// is there a target
				if (target != null) {
					// are we at the target

					Vector3f toTarget = new Vector3f();
					Vector3f.sub(target,
							originTrans.getTranslation(), toTarget);

					if (toTarget.length() < speed * engine3D.getDeltaTime()) {
						if(waypoints.size() == 0){
							reachedTargetPosition = true;
						}
						originTrans.setTranslation(target);
						target = null;
					} else {
						// cant reach the target yet
						// we move
						Vector3f travelVector = new Vector3f(toTarget);
						travelVector.normalise().scale(
								speed * engine3D.getDeltaTime());
						originTrans.translate(travelVector);

						Vector3f rotationAxis = Vector3f.cross(travelVector, originTrans.getForward(), null);
						// Due to computational imprecision there needs to be a threshold here.
						if (rotationAxis.length() > 0.001f) {
							rotationAxis.normalise();

							float rotationAngle = Vector3f.angle(travelVector, originTrans.getForward());
							//Vector4f quaternionVector = new Vector4f(rotationAxis.x, rotationAxis.y, rotationAxis.z, rotationAngle);

							//directionRotation.setFromAxisAngle(quaternionVector);

							//Quaternion q = new Quaternion(0.0f, 1.0f, 0.0f, 90f * engine3D.getDeltaTime());

							Vector3f v = new Vector3f(0f, Helper.radiansToDegrees(rotationAngle), 0f);

							originTrans.rotate(v);
						}
					}

				} else {
					// we have anim but no target
					if (waypoints.size() == 0) {
						System.out.println(geometry);
						Line line = engine3D.getLineContainer(geometry);
						if (line != null) {
							// TODO Bezier curves goes here

							// Remember since we set origin it is possible to jump.
							// Other solution: set origin in the beginning once
							// and than assume we never have to jump and forget
							// about
							// origin

							waypoints.addAll(createWaypointTransforms(line));
							System.out.println("Getting waypoints " + waypoints.size());
							((TransformComponent) getComponent(TransformComponent.class))
							.setTranslation(waypoints.poll());
						}
					}

					// do we have waypoints
					if (waypoints.size() > 0) {
						target = waypoints.poll();
						System.out.println("polled waypoint. Remaining " + waypoints.size());
					}
					else{System.out.println("no waypoints");}
				}

			}
		}

	}

	/**
	 * Creates the waypoints from the given line.
	 * 
	 * @param line
	 * @return
	 */
	private ArrayList<Vector3f> createWaypointTransforms(Line line) {
		ArrayList<Vector3f> transforms = new ArrayList<Vector3f>();

			// here we add the origin
			Vector3f trans = new Vector3f(line.getSource().getX(), 0f, line
					.getSource().getY());
			transforms.add(trans);
	
			// // here we add all beziers
			 for(Coordinates point : line.getLineDim()){
			 trans = new Vector3f(point.getX(), 0f , point.getY());
			 transforms.add(trans);
			 }
	
			trans = new Vector3f(line.getTarget().getX(), 0f, line.getTarget()
					.getY());
			transforms.add(trans);
		
		return transforms;
	}

	/**
	 * sets the speed of the object.
	 * 
	 * @param speed
	 *            the value of the speed.
	 */
	private void setSpeed(float speed) {
		this.speed = speed / 10;
	}

	/**
	 * Set ready = true set by Engine3D to signal ready to change in PNSim
	 * 
	 * set ready = false set by PNSim to signal ready for Engine3D to handle
	 */
	@Override
	public void setReady(boolean bool) {
		ready = bool;
	}

	@Override
	public boolean getReady() {
		return ready;
	}

	@Override
	public Animation getActivity() {
		return currentActivity;
	}

	/**
	 * This method is called by the petri net sim to move the default scene
	 * object. Used for the first prototype.
	 */
	@Override
	public void setActivity(Animation activity) {
		currentActivity = activity;
		if (currentActivity instanceof Move) {
			// System.out.println("set animation move");
			Move move = (Move) currentActivity;
			setSpeed(move.getSpeed());
			reachedTargetPosition = false;
			// engine3D.setGeo(this, geometry);
			/* \TODO get the speed of the activity and set it up */
		}
		if (currentActivity instanceof Trigger) {
			/* \TODO IMPLEMENT */
			System.out.println("trigger");
		}
		if (currentActivity instanceof Appear) {
			/*
			 * \TODO IMPLEMENT. get the time of Appear (0 means an insane amount
			 * of time) and wait such time
			 */
			System.out.println("appear");
			Appear appear = (Appear) currentActivity;
			triggerComponent.waitForTrigger(false);
			triggerComponent.setWaitingTime(appear.getTime());
			//			triggerComponent.wait(true);
		}
	}

	/**
	 * This method is called by the petri net sim to move the default scene
	 * object. Used for the first prototype. Check geometry and put object to
	 * the position
	 */

	@Override
	public String getShape() {
		return shape;
	}

	/**
	 * Changes shape if???
	 */
	@Override
	public void setShape(String shape) {
		System.out.println(shape);
		// FIXME could happen that there is no valid
		// render anymore.
//		if(render != null){
////			render.dispose();
//			setRender(null);
//			((RenderComponent)getComponent(RenderComponent.class)).
//		}
		// find the render components
		try {
			String texturePath=null;
			for(URI busc:dataPaths.get(shape)){
				if(busc.getPath().endsWith(".png")){
					texturePath = busc.getPath();
				}
			}
			
			
			//TODO: This should not be done every time an object is created, 
			//only once should the shaders be found (config) and loaded (some factory perhaps?).
			HashMap<String, String> relativeShaderPaths = new HashMap<String, String>();
			for(List<URI> paths : dataPaths.values()){
				for(URI path : paths){
					String currentPath = path.getPath();
					if(currentPath.endsWith("testTextured120.vert")){
						relativeShaderPaths.put(
								"vert120", currentPath);
					}
					else if(currentPath.endsWith("testTextured120.frag")){
						relativeShaderPaths.put(
								"frag120", currentPath);
					}
					else if(currentPath.endsWith("testTextured330.vert")){
						relativeShaderPaths.put(
								"vert330", currentPath);
					}
					else if(currentPath.endsWith("testTextured330.frag")){
						relativeShaderPaths.put(
								"frag330", currentPath);
					}
				}
			}
			
			
			
			List<URI> calabaza = dataPaths.get(shape);
			URI encontrado=null;
			for(URI u : calabaza){
				if(u.toString().endsWith(".obj")) encontrado = u;
			}
			FileReader fr = new FileReader(encontrado.getPath());
			BufferedReader br = new BufferedReader(fr);
			Object3D cal = new Object3D(br,true);
			int i=0;
			ArrayList<float[]> textures = (ArrayList<float[]> )cal.vertexsetstexs;
			ArrayList<TexturedVertex> arrayvertex = new ArrayList<TexturedVertex>();
			for(Object v :cal.vertexsets){
				float[] totot = (float[]) v;
				TexturedVertex vv = new TexturedVertex();
				vv.setXYZ(totot[0], totot[1], totot[2]);
				vv.setRGB(1, 1, 1);
				
				
				vv.setST(textures.get(i)[0], textures.get(i)[1]);
				i++;
				arrayvertex.add(vv);
			}
			
			TexturedVertex[] arr = arrayvertex.toArray(new TexturedVertex[arrayvertex.size()]);
			ArrayList<int[]> mumble = (ArrayList<int[]>)cal.faces;//TODO magic
			
			
			int[] indicescal = new int[mumble.size()*3];

			i=0;
			for(int [] element: mumble){//TODO magic
				
				indicescal[i*3] = element[0];
				indicescal[i*3+1] = element[1];
				indicescal[i*3+2] = element[2];
				i++;
			}

			Model3D newModel3D = new Model3D(arr, indicescal,
					relativeShaderPaths, getEngine3DInstance().getMajor(), getEngine3DInstance().getMinor(), texturePath);
			
			((RenderComponent)getRender()).setModel3D(newModel3D);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		this.shape = shape;
	}

	@Override
	public String getGeometry() {
		return geometry;
	}

	public float getSpeed() {
		return speed;
	}

	/**
	 * Addded due to prototype1 Used to implement functionality of taking lines
	 * from the geometry file.
	 * 
	 * FIXME: get the coordinates from the geo and set it as destination.
	 */
	@Override
	public void setGeometry(String geo) {
		this.geometry = geo;
	}

	public boolean movedToTarget() {
		return reachedTargetPosition;
	}

	public Vector3f getOriginVector() {
		return ((TransformComponent) getComponent(TransformComponent.class))
				.getTranslation();
	}

	public boolean isWaiting() {
		return triggerComponent.waiting();
	}

	public void setWait(boolean b) {
		triggerComponent.waitForTrigger(b);
	}
}
