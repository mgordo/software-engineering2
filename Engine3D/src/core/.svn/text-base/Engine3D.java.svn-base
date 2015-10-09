// Inspired by https://github.com/mattdesl/lwjgl-basics/wiki/Display#wiki-Source
// and http://lwjgl.org/wiki/index.php?title=The_Quad_with_DrawElements

package core;

import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.glBlendFunc;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glViewport;

import java.net.URI;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import pnsim.PNSim;
import pnsimInterfaces.IPNSim;
import pnsimInterfaces.NotSuchGeometryException;
import pnsimInterfaces.PNSimNotInitializedCorrectlyException;
import scene.components.AttachComponent;
import scene.components.CameraComponent;
import scene.components.ColliderComponent;
import scene.components.RenderComponent;
import scene.components.TransformComponent;
import scene.components.TriggerComponent;
import scene.components.WaitComponent;
import scene.objects.DefaultCameraObject;
import scene.objects.PlaneSceneObject;
import scene.objects.SceneObject;
import scene.objects.TrackedSceneObject;
import utils.GLVersion;
import utils.ItemFactory;
import utils.JavaClassPathLoader;
import animations.Animation;
import engine3DInterfaces.IEngine3D;
import engine3DInterfaces.IItem;
import geometry.Geometry;
import geometry.Line;

/**
 * This is the 3DEngine that visualizes the Petri net.
 * 
 * @author Simon, Mikkel
 * 
 */
public class Engine3D implements IEngine3D {

	// Time keeping
	private long currTime = 0;
	private long prevTime = 0;
	private float deltaTime = 0;

	private boolean focus = false;

	// Texture related variables
	private int textureSelector = 0;

	private static final boolean VSYNC = true;
	private static final int MAX_FPS = 60;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final boolean FULLSCREEN = false;
	private boolean running = false;


	private FloatBuffer matrix44Buffer = null;

	private ArrayList<SceneObject> sceneObjects = new ArrayList<SceneObject>();

	// Camera	
	private int currCamIndex = 0;
	private ArrayList<SceneObject> cameras = new ArrayList<SceneObject>();

	private IPNSim pnSim;
	
	// OpenGL version
	private int versionMajor;
	private int versionMinor;
	private boolean mouse0Down = false;

	public Engine3D() {
	}

	/**
	 * Creates a window for rendering the OpenGL context in. Sets up everything
	 * to be able to display the objects. After this call, the engine3d is ready
	 * to enter the main loop.
	 */
	// Start the engine
	private void init() {
		try {
			// Setup
			setupOpenGL();
			setupMatrices();
			setupSceneObjects();
			setupInput();

		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initializes the item factory
	 * @param geo
	 * @param dataPaths
	 */
	private void initFactory(Geometry geo, Map<String, List<URI>> dataPaths) {
		ItemFactory.init(geo, this, dataPaths);
	}

	/**
	 * Updates all scene objects. Handles input. Later, the NYI collision
	 * detection algorithm will be called in here.
	 */
	private void update() {
		// Because time taken to update and render a scene might differ
		// from frame to frame, we need to keep track of this delta time.
		currTime = Helper.getTime();
		deltaTime = (float) (currTime - prevTime) / 1000;
		prevTime = currTime;
		colliderComps.clear();
		colliderComps = new ArrayList<ColliderComponent>();
		for (SceneObject so : sceneObjects){
			so.update();
			if(so instanceof TrackedSceneObject){
				ColliderComponent currentColComp = (ColliderComponent) ((TrackedSceneObject)so).getComponent(ColliderComponent.class);
				if(currentColComp != null)
				colliderComps.add(currentColComp);
			}
		}		
		
		// Update collider states
		for (ColliderComponent collider : colliderComps)
			collider.updateCollisionState(colliderComps);

		// If the game is resized, we need to update our projection
		if (Display.wasResized())
			resize();

		handleInput();
		cameras.get(currCamIndex).update();

		
		for(SceneObject so : sceneObjects){
			if(so instanceof TrackedSceneObject){
				TrackedSceneObject tmp = (TrackedSceneObject)so;
				if (tmp.movedToTarget()) {
					// item reached its target.
					
						if(!tmp.isWaiting() && !tmp.getReady()){
//							System.out.println("PNSim update called by");
	
							tmp.setReady(true);
							pnSim.update((IItem) tmp); // only send the interface of the item.
						}
					}
			}
		}


		render();
		Display.update();
		Display.sync(MAX_FPS);
	}

	/**
	 * Adjusts some OpenGL settings that are needed for the project's purposes.
	 * @throws LWJGLException 
	 */
	private void setupOpenGL() throws LWJGLException {		
		// Set up the display
		Display.setTitle("Engine 3D");
		Display.setResizable(true);

		Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));

		Display.setVSyncEnabled(VSYNC);
		Display.setFullscreen(FULLSCREEN);

		// Create and show the display
		Display.create();

		// Call resize so to set the initial size
		resize();
		glEnable(GL11.GL_DEPTH_TEST); // We will be needing depth testing
		GL11.glDepthFunc(GL11.GL_LEQUAL);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		glClearColor(0f, 0f, 0f, 0f);
		
		
		GLVersion version = new GLVersion(GL11.glGetString(GL11.GL_VERSION));
	    versionMajor = version.getMajor();
	    versionMinor = version.getMinor();
	    System.out.println("Major: " + versionMajor + " Minor: " + versionMinor);
		
	}

	/**
	 * Sets up a float buffer that will store matrix information before it is
	 * send to the shader program running on the graphics card.
	 */
	private void setupMatrices() {

		// Create a FloatBuffer with the proper size to store our matrices later
		matrix44Buffer = BufferUtils.createFloatBuffer(16);
	}

	/**
	 * Adjusts some input settings and displays information about the user
	 * input.
	 */
	private void setupInput() {
		Keyboard.enableRepeatEvents(true);
		System.out
				.println("Press M to start the test animation. Press Q to quit. Use arrows to move the camera and hold right mouse button while dragging the mouse to rotate the camera(little bugged)");
	}

	/**
	 * Initializes the scene objects, giving them components.
	 */
	private void setupSceneObjects() {
		setupAttachedCamera(null);
	}
	
	/**
	 * sets up the camera
	 * @param comp
	 */
	private void setupAttachedCamera(TrackedSceneObject tso1){
		// We need a camera to render the scene, so we use a simple SceneObject
		SceneObject mainCam = new DefaultCameraObject(this);
		
		if(tso1 != null){
			// set tso1 as attach component.
			AttachComponent comp = new AttachComponent(tso1);
			// add attach component to the cam
			mainCam.addComponent(comp);
			// set start position of camera
			Vector3f startPos = new Vector3f();
			startPos.x = tso1.getOriginVector().getX();
			startPos.y =  tso1.getOriginVector().getY() + 1f;
			startPos.z = tso1.getOriginVector().getZ();
			((TransformComponent) mainCam.getComponent(TransformComponent.class)).setTranslation(startPos);
		}

		cameras.add(mainCam);
	}

	/**
	 * Resizes the window. TODO: The aspect ratio (or how to call it) of the
	 * objects (height and width) don't fit if you change the window.
	 */
	private void resize() {
		glViewport(0, 0, Display.getWidth(), Display.getHeight());
	}
	
	
	/**
	 * Handles the user input such as mouse and keyboard. This should be called
	 * every frame.
	 */
	private void handleInput() {
		// The input will manipulate the camera object
		TransformComponent camTrans = (TransformComponent) cameras.get(currCamIndex)
				.getComponent(TransformComponent.class);

		if (Mouse.isButtonDown(0) && !mouse0Down) {
			pickColliderWithMouse();
			mouse0Down = true;
		} else if (!Mouse.isButtonDown(0) && mouse0Down) {
			mouse0Down = false;
		}
		if (Mouse.isButtonDown(1)) {
			int mouseDX = Mouse.getDX();
			int mouseDY = Mouse.getDY();
			Vector3f mouseRotation = new Vector3f(mouseDY * deltaTime * -5f, -mouseDX	* deltaTime * 5f, 0);
			camTrans.rotate(mouseRotation);
		}
		while (Keyboard.next()) {
			// Only listen to events where the key was pressed (down event)
			if (!Keyboard.getEventKeyState())
				continue;

			switch (Keyboard.getEventKey()) {
			case Keyboard.KEY_C:
				currCamIndex++;
				currCamIndex %= cameras.size();
				break;
			case Keyboard.KEY_F:
				if (!Keyboard.isRepeatEvent())
					focus = !focus;
				break;
			case Keyboard.KEY_Q:
				exit();
				break;
			case Keyboard.KEY_M:
				// tso1.setActivity("move(100, train)");
				break;
			case Keyboard.KEY_UP:
				camTrans.translate((Vector3f) new Vector3f(camTrans.getForward().x, camTrans.getForward().y, camTrans.getForward().z).scale(50 * deltaTime));
				break;
			case Keyboard.KEY_DOWN:
				camTrans.translate((Vector3f) new Vector3f(camTrans.getForward().x, camTrans.getForward().y, camTrans.getForward().z).scale(-50 * deltaTime));
				break;
			case Keyboard.KEY_LEFT:
				camTrans.translate((Vector3f) new Vector3f(camTrans.getRight().x, camTrans.getRight().y, camTrans.getRight().z).scale(-50 * deltaTime));
				break;
			case Keyboard.KEY_RIGHT:
				camTrans.translate((Vector3f) new Vector3f(camTrans.getRight().x, camTrans.getRight().y, camTrans.getRight().z).scale(50 * deltaTime));
				break;
			}
		}
	}

	private boolean pickColliderWithMouse() {
		// Camera references
		TransformComponent camTrans = (TransformComponent) cameras.get(currCamIndex)
				.getComponent(TransformComponent.class);
		CameraComponent cam =  (CameraComponent) cameras.get(currCamIndex)
				.getComponent(CameraComponent.class);
		
		mouse0Down = true;
		Vector3f[] mouseRay = getMouseRay(cam);
		SceneObject tracer = new SceneObject(this);
		TransformComponent tracerTransform = new TransformComponent(mouseRay[0],new Vector3f(0,0,0), new Vector3f(1,1,1));
		tracer.addComponent(tracerTransform);
//		System.out.println("CamForward: " + camTrans.getForward() + " Direction: " + mouseRay[1] + "  -- " + "RayOrigin: " + mouseRay[0]);
		int stepCount = 0;
		while (Vector3f.sub(tracerTransform.getTranslation(), mouseRay[0], null).length() < cam.getFarPlane())
		{
			stepCount += 1;
			Vector3f stepVector = new Vector3f(mouseRay[1]);
			tracerTransform.translate((Vector3f) stepVector.scale(0.01f));
			//System.out.println("stepVector length: " + stepVector.length());
			//System.out.println("tracerTransform vector: " + tracerTransform.getTranslation());
			for (SceneObject sceneObject : sceneObjects)
			{
				TriggerComponent trigger = (TriggerComponent)sceneObject.getComponent(TriggerComponent.class);
				if(trigger != null){
					if (trigger.checkCollision(tracerTransform.getTranslation()))
					{
						if(trigger.waiting()){
							if(!trigger.hasToWait()){
								trigger.waitForTrigger(false);
							}
							else{
								System.err.println("Can not trigger, because component has to wait");
							}
						}
//						System.out.println("*Mouse ray COLLISION*! with " + trigger.getSceneObjectClass().toString());
						if(trigger.getSceneObjectClass() == PlaneSceneObject.class){
							onTrackClick(((PlaneSceneObject)sceneObject).getGeometry());
						}
						return true;
					}
				}
				ColliderComponent collider = (ColliderComponent)sceneObject.getComponent(ColliderComponent.class);
				if(collider != null){
					if (collider.checkCollision(tracerTransform.getTranslation()))
					{
//						System.out.println("*Mouse ray COLLISION*! with " + collider.getSceneObjectClass().toString());
						return true;
					}
				}
			}
			
			//System.out.println(tracerTransform.getTranslation());
		}
		//System.out.println("StepCount: " + stepCount);
		sceneObjects.remove(tracer);
		return false;
	}

	private Vector3f[] getMouseRay(CameraComponent cam) {		
		double screenSpaceX = (((float) Mouse.getX() / (getWidth() / 2) - 1.0f) * cam.getAspectRatio());
		double screenSpaceY = (1.0f - (float) Mouse.getY() / (getHeight() / 2));
		
		double viewRatio = Math.tan(Helper.degreesToRadians(cam.getFieldOfView() / 2.00f));
		
		screenSpaceX = screenSpaceX * viewRatio;
		screenSpaceY = screenSpaceY * viewRatio;
		
		//Find the near and far camera spaces
		Vector4f cameraSpaceNear = new Vector4f((float) (screenSpaceX * cam.getNearPlane()), (float) (screenSpaceY *cam.getNearPlane()), (float) (-cam.getNearPlane()), 1);
		Vector4f cameraSpaceFar = new Vector4f((float) (screenSpaceX * cam.getFarPlane()), (float) (-screenSpaceY * cam.getFarPlane()), (float) (-cam.getFarPlane()), 1);
		
		Matrix4f tmpView = cam.getViewMatrix();
		Matrix4f invView = (Matrix4f) tmpView.invert();
		Vector4f worldSpaceNear = new Vector4f();
		Matrix4f.transform(invView, cameraSpaceNear, worldSpaceNear);
		
		Vector4f worldSpaceFar = new Vector4f();

		Matrix4f.transform(invView, cameraSpaceFar, worldSpaceFar);
		
		//calculate the ray position and direction
		Vector3f rayPosition = new Vector3f(worldSpaceNear.x, worldSpaceNear.y, worldSpaceNear.z);
		Vector3f rayDirection = new Vector3f(worldSpaceFar.x - worldSpaceNear.x, worldSpaceFar.y - worldSpaceNear.y, worldSpaceFar.z - worldSpaceNear.z);

		rayDirection.normalise();
		
		Vector3f[] ray = new Vector3f[] {rayPosition, rayDirection};
		
		return ray;
	}
	ArrayList<ColliderComponent> colliderComps = new ArrayList<ColliderComponent>();

	/**
	 * The main render method. Here all renderable scene objects are drawn.
	 */
	private void render() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		// Store, flip and upload camera matrices (projection and view)
		CameraComponent mainCamComp = (CameraComponent) cameras.get(currCamIndex)
				.getComponent(CameraComponent.class);

		// FOREACH MODEL BEGIN
		for (SceneObject so : sceneObjects) {
			// Component and 3D model references for less method calls further
			// down
			RenderComponent soRender = (RenderComponent) so
					.getComponent(RenderComponent.class);
			
			TransformComponent soTransform = (TransformComponent) so
					.getComponent(TransformComponent.class);
			
			Model3D soModel3D = soRender.getModel3D();

			// OpenGL (LWJGL) stuff starts here
			GL20.glUseProgram(soModel3D.getSpId());

			// Upload matrices to the uniform variables
			mainCamComp.getProjectionMatrix().store(matrix44Buffer);
			matrix44Buffer.flip();
			GL20.glUniformMatrix4(soModel3D.getProjectionLocation(), false,
					matrix44Buffer);
			mainCamComp.getViewMatrix().store(matrix44Buffer);
			matrix44Buffer.flip();
			GL20.glUniformMatrix4(soModel3D.getViewLocation(), false,
					matrix44Buffer);
			soTransform.getModelMatrix().store(matrix44Buffer);
			matrix44Buffer.flip();
			GL20.glUniformMatrix4(soModel3D.getModelLocation(), false,
					matrix44Buffer);
			
			GL13.glActiveTexture(GL13.GL_TEXTURE0);
			
			// TEXTURE
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, soModel3D.getTextures().get(textureSelector).getTextureID());
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL11.GL_REPEAT);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL11.GL_REPEAT);
			
			// Bind to the VAO that has all the information about the vertices
			// GL30.glBindVertexArray(soModel3D.getVaoId());
			
			// Buffer VBO
			GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, soModel3D.getVboId());
			GL15.glBufferData(GL15.GL_ARRAY_BUFFER, soModel3D.getVbo(), GL15.GL_STATIC_DRAW);
			
			// Position data in attribute 0,
			// Color data in attribute 1,
			// Texture data in attribute 2
			GL20.glVertexAttribPointer(0, TexturedVertex.positionElementCount, GL11.GL_FLOAT, false, TexturedVertex.getStride(), TexturedVertex.positionByteOffset);
			GL20.glVertexAttribPointer(1, TexturedVertex.colorElementCount, GL11.GL_FLOAT, false, TexturedVertex.getStride(), TexturedVertex.colorByteOffset);
			GL20.glVertexAttribPointer(2, TexturedVertex.textureElementCount, GL11.GL_FLOAT, false, TexturedVertex.getStride(), TexturedVertex.textureByteOffset);

			GL20.glEnableVertexAttribArray(0);
			GL20.glEnableVertexAttribArray(1);
			GL20.glEnableVertexAttribArray(2);
			// Bind to the index VBO that has all the information about the
			// order of the vertices
			GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER,
					soModel3D.getIboId());
			// Draw the vertices
			GL11.glDrawElements(GL11.GL_TRIANGLES, soModel3D.getIndexCount(),
					GL11.GL_UNSIGNED_INT, 0);
			
			
			
			
			// Put everything back to default (deselect)
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
			GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
			GL20.glDisableVertexAttribArray(0);
			GL20.glDisableVertexAttribArray(1);
			GL20.glDisableVertexAttribArray(2);
			// GL30.glBindVertexArray(0);

			GL20.glUseProgram(0);
		}
		// FOREACH MODEL END;
	}

	/**
	 * Releases all necessary objects from memory.
	 */
	public void dispose() {
		
		// Delete shader related things
		GL20.glUseProgram(0);
		
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		
		// Disable the VBO index from the VAO attributes list
		GL20.glDisableVertexAttribArray(0);
		
		// Delete the VBO
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		
		// Delete the IBO
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		
		
		GL20.glUseProgram(0);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		for (SceneObject so : sceneObjects) {
			so.dispose();
		}
		System.out.println("Engine3D disposed - exiting loop.");
	}

	/**
	 * Exits the Engine3D program.
	 */
	private void exit() {
		running = false;
	}

	// Getters
	public int getHeight() {
		return Display.getHeight();
	}

	public int getWidth() {
		return Display.getWidth();
	}

	public float getDeltaTime() {
		return deltaTime;
	}

	/**
	 * Creates the items.
	 */
	@Override
	public IItem createIItem(String shape, String geometry, Animation activity) {

		try {
			ArrayList<SceneObject> items = ItemFactory.getItems(shape, geometry, activity);
			TrackedSceneObject tso1 = (TrackedSceneObject)items.get(0);
			setupAttachedCamera(tso1);
			((TransformComponent) cameras.get(cameras.size() - 	1).getComponent(TransformComponent.class)).setRotation(new Vector3f(5.08f, 5.02f, 0.0f));
			sceneObjects.add(tso1);
			return (IItem) tso1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}




	
	
	/**
	 * Called by the IItem to be able to get its target vectors.
	 * @param geo
	 * @return
	 */
	public Line getLineContainer(String geometry){
		if(geoLineMapping.containsKey(geometry)){
			return geoLineMapping.get(geometry);
		}
		return null;
	}

	/**
	 * Called by the item factory to get the
	 * lines.
	 */
	private HashMap<String, Line> geoLineMapping = new HashMap<String, Line>();
	

	/**
	 * Added due to prototype1
	 * Used to implement functionality of
	 * taking Lines from the geometry file.
	 */
	EList<Line> geometryLines;

	/**
	 * Added due to prototype1
	 * Used to implement functionality of
	 * taking Lines from the geometry file and currently also creates the tracks.
	 * @param geoRoot
	 */
	private void initializeWayPoints(Geometry geoRoot) {
		//geometryLines = geoRoot.getLines();
		Iterator<Line> iter = geoRoot.getLines().iterator();
		Integer index = 0;
		try {
			while (iter.hasNext()) {
				index++;
				Line currentLine = iter.next();
				geoLineMapping.put(currentLine.getID(), currentLine);
				ArrayList<SceneObject> sceneObj = ItemFactory.getItems(
						currentLine.getTexture(), currentLine.getID(), null);
				if (sceneObj != null) {
					sceneObjects.addAll(sceneObj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	/**
	 * Sets a collection of lines to the waypointmapping.
	 * @param geo
	 * @param lines
	 */
	public void setLines(String geo, ArrayList<Vector3f[]> lines){
		wayPointMapping.put(geo, lines);
	}

	/**
	 * The mapping from geometry to the several lines
	 */
	private HashMap<String, ArrayList<Vector3f[]>> wayPointMapping = new HashMap<String, ArrayList<Vector3f[]>>();
	/**
	 * Called by the items to move on the lines (tracks).
	 * @return
	 */
	public ArrayList<Vector3f[]> getWayPointMapping(String geometry){
		return wayPointMapping.get(geometry);
	}
	@Override
	public void run(PetriNetDoc petriNet, Geometry geoRoot, Map<String,List<URI>> dataPaths) {
		new JavaClassPathLoader();
		init();
		initFactory(geoRoot, dataPaths);
		initializeWayPoints(geoRoot);
		
		pnSim = new PNSim();
		try {
			pnSim.init(petriNet, this);
		} catch (PNSimNotInitializedCorrectlyException e) {
			e.printStackTrace();
		}

		prevTime = Helper.getTime();

		running = true;

		// The main loop
		while (running && !Display.isCloseRequested()) {
			update();
		}

		// Dispose any resources and destroy the window
		dispose();
		Display.destroy();
	}

	public int getMajor() {
		// TODO Auto-generated method stub
		return versionMajor;
	}

	public int getMinor() {
		// TODO Auto-generated method stub
		return versionMinor;
	}
	
	
	
	/**
	 * If detected, that user clicked on the track.
	 */
	private void onTrackClick(String geometryOfTrack){
//		System.out.println("on track click " + geometryOfTrack);
		String shapeOfTrack = null;
		try {
			shapeOfTrack = pnSim.getShape(geometryOfTrack);
		} catch (NotSuchGeometryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(shapeOfTrack != null){
			//TODO: check for collision here
			
			//if !collision.
			//an item should be created.
			pnSim.addItem(geometryOfTrack);
		}
		else{
			System.err.println("no such geometry for the track");
		}
	}
}
