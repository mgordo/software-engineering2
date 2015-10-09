package scene.objects;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import scene.components.BoundingBoxComponent;
import scene.components.ColliderComponent;
import scene.components.RenderComponent;
import scene.components.TransformComponent;
import scene.components.TriggerComponent;
import core.Engine3D;
import core.Helper;
import core.Model3D;
import core.TexturedVertex;

public class PlaneSceneObject extends SceneObject {
	private String geometry;
	public PlaneSceneObject(Engine3D engine3DInstance, Vector3f start, Vector3f end, Map<String,List<URI>> list, String shape, String geometry) {
		super(engine3DInstance);
		this.geometry = geometry;
		float diameter = 1.0f;

		Vector3f trackVec = new Vector3f();
		Vector3f.sub(end, start, trackVec);
		float length = trackVec.length();
		
		Vector3f cross = new Vector3f();
		float angle = Helper.radiansToDegrees(Vector3f.angle(new Vector3f(1,0,0), trackVec));
		Vector3f normTrackVec = new Vector3f();
		trackVec.normalise(normTrackVec);
		if (normTrackVec.x != 1.0f && normTrackVec.x != -1.0f)
		{
			Vector3f.cross(new Vector3f(1.0f,0.0f,0.0f), trackVec, cross);
			//FIXME
			if (((Vector3f) cross.normalise()).y == -1.0f) {
				angle = -angle;
			}
		}

		// A cube
		TexturedVertex v0 = new TexturedVertex();
		v0.setXYZ(-length/2, -0.5f, diameter/2);
		v0.setRGB(1, 0, 0);
		v0.setST(0, 0.5f);
		TexturedVertex v1 = new TexturedVertex();
		v1.setXYZ(-length/2, -0.5f, -diameter/2);
		v1.setRGB(0, 1, 0);
		v1.setST(0, 0);
		TexturedVertex v2 = new TexturedVertex();
		v2.setXYZ(length/2, -0.5f, -diameter/2);
		v2.setRGB(0, 0, 1);
		v2.setST(0.5f, 0);
		TexturedVertex v3 = new TexturedVertex();
		v3.setXYZ(length/2, -0.5f, diameter/2);
		v3.setRGB(1, 1, 1);
		v3.setST(0.5f, 0.5f);
		TexturedVertex[] vertices = new TexturedVertex[] { v0, v1, v2, v3};
		int[] indices = { 0, 1, 2, 2, 3, 0};

		try {
			String texturePath=null;
			for(URI busc:list.get(shape)){
				if(busc.getPath().endsWith(".png")){
					texturePath = busc.getPath();
				}
			}
			
			//TODO: This should not be done every time an object is created, 
			//only once should the shaders be found (config) and loaded (some factory perhaps?).
			HashMap<String, String> relativeShaderPaths = new HashMap<String, String>();
			for(List<URI> paths : list.values()){
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
			Model3D newModel3D = new Model3D(vertices, indices,
					relativeShaderPaths, engine3DInstance.getMajor(), engine3DInstance.getMinor(), texturePath);
			RenderComponent render = new RenderComponent(newModel3D);
			addComponent(render);
			TransformComponent transform = new TransformComponent(new Vector3f(0, 0, 0),
					new Vector3f(0, 0, 0), new Vector3f(1, 1, 1));
			addComponent(transform);

			Vector4f[] vertexPositions = new Vector4f[vertices.length];
			int index = 0;
			for(TexturedVertex vertex : vertices ){
				vertexPositions[index++] = vertex.getElementVector();
			}			
			
			BoundingBoxComponent bbComp = new BoundingBoxComponent(vertexPositions ,transform);
			addComponent(bbComp);
			
			TriggerComponent triggerComp = new TriggerComponent(this);
			addComponent(triggerComp);



			Vector3f trackTranslation = new Vector3f();
			Vector3f.add(start, (Vector3f) trackVec.normalise().scale(length*0.5f), trackTranslation);			

			transform.translate(trackTranslation);
			transform.rotate(new Vector3f(0.f,angle,0.f));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getGeometry() {
		return geometry;
	}
}
