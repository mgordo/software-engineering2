package scene.objects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import loadpackage.Object3D;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import scene.components.BoundingBoxComponent;
import scene.components.ColliderComponent;
import scene.components.RenderComponent;
import scene.components.TransformComponent;
import core.Engine3D;
import core.Model3D;
import core.TexturedVertex;

/**
 * The default object of the visualization
 * that has the ability to be rendered 
 * and moved on the screen.
 * @author Simon, Mikkel
 *
 */
public class DefaultSceneObject extends SceneObject {

	protected TransformComponent transform;
	protected RenderComponent render;
	protected Map<String,List<URI>> dataPaths;

	public DefaultSceneObject(Engine3D engine3DInstance, Map<String,List<URI>> list, String shape) {
		super(engine3DInstance);
		dataPaths = list;
		// A cube
		/*TexturedVertex v0 = new TexturedVertex();
		v0.setXYZ(-0.5f, 0.5f, 0.5f);
		v0.setRGB(1, 0, 0);
		v0.setST(0, 0);
		TexturedVertex v1 = new TexturedVertex();
		v1.setXYZ(-0.5f, -0.5f, 0.5f);
		v1.setRGB(0, 1, 0);
		v1.setST(0, 1);
		TexturedVertex v2 = new TexturedVertex();
		v2.setXYZ(0.5f, -0.5f, 0.5f);
		v2.setRGB(0, 0, 1);
		v2.setST(1, 1);
		TexturedVertex v3 = new TexturedVertex();
		v3.setXYZ(0.5f, 0.5f, 0.5f);
		v3.setRGB(1, 1, 1);
		v3.setST(1, 0);
		
		TexturedVertex v4 = new TexturedVertex();
		v4.setXYZ(-0.5f, 0.5f, -0.5f);
		v4.setRGB(1, 0, 0);
		v4.setST(0, 0);
		TexturedVertex v5 = new TexturedVertex();
		v5.setXYZ(-0.5f, -0.5f, -0.5f);
		v5.setRGB(0, 1, 0);
		v5.setST(0, 1);
		TexturedVertex v6 = new TexturedVertex();
		v6.setXYZ(0.5f, -0.5f, -0.5f);
		v6.setRGB(0, 0, 1);
		v6.setST(1, 1);
		TexturedVertex v7 = new TexturedVertex();
		v7.setXYZ(0.5f, 0.5f, -0.5f);
		v7.setRGB(1, 1, 1);
		v7.setST(1, 0);
		TexturedVertex[] vertices = new TexturedVertex[] { v0, v1, v2, v3, v4, v5, v6, v7 };
		int[] indices = { 0, 1, 2, 2, 3, 0,
				3, 2, 6, 6, 7, 3,
				7, 6, 5, 5, 4, 7,
				4, 5, 1, 1, 0, 4,
				4, 0, 3, 3, 7, 4,
				1, 5, 6, 6, 2, 1};*/

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
			
			
			
			List<URI> calabaza = list.get(shape);
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
					relativeShaderPaths, engine3DInstance.getMajor(), engine3DInstance.getMinor(), texturePath);
			
					
			
			
			
			


			/*Model3D newModel3D = new Model3D(vertices, indices,
					relativeShaderPaths, engine3DInstance.getMajor(), engine3DInstance.getMinor(), texturePath);*/
			render = new RenderComponent(newModel3D);
			addComponent(render);
			
			Vector4f[] vertexPositions = new Vector4f[arr.length];//CHANGED arr by vertices
			int index = 0;
			for(TexturedVertex vertex : arr ){//CHANGED arr by vertices
				vertexPositions[index++] = vertex.getElementVector();
			}
			

			initTransform();
			
			
			BoundingBoxComponent bbComp = new BoundingBoxComponent(vertexPositions ,this.getTransform());
			addComponent(bbComp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DefaultSceneObject(Engine3D engine3d) {
		// TODO Auto-generated constructor stub
		super(engine3d);
		initTransform();
	}

	private void initTransform() {			
		transform = new TransformComponent(new Vector3f(0, 0, 0),
			new Vector3f(0, 0, 0), new Vector3f(1, 1, 1));
	addComponent(transform);
		
	}

	private static URI locateFile(String bundle, String fullPath) {
		try {
			URL url = FileLocator.find(Platform.getBundle(bundle), new Path(
					fullPath), null);
			if (url != null) {
				URL resolvedUrl = FileLocator.resolve(url);

				// We need to use the 3-arg constructor of URI in order to
				// properly escape file system chars.
				URI resolvedUri = new URI(resolvedUrl.getProtocol(),
						resolvedUrl.getPath(), null);

				return resolvedUri;
			}
		} catch (Exception e) {
		}
		return null;
	}
	
	@Override
	public void dispose() {
		if(render!= null){
			render.dispose();
		}
		if(this.transform != null){
			transform.dispose();
		}
		super.dispose();
	}

	public TransformComponent getTransform() {
		return transform;
	}

	public void setTransform(TransformComponent transform) {
		this.transform = transform;
	}

	public RenderComponent getRender() {
		return render;
	}

	public void setRender(RenderComponent render) {
		this.render = render;
	}

}
