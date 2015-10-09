package utils;

import geometry.Geometry;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.lwjgl.util.vector.Vector3f;

import scene.components.ColliderComponent;
import scene.components.TransformComponent;
import scene.objects.SceneObject;
import animations.Animation;
import core.Engine3D;

/**
 * Base class for the item factory.
 * Allows objects, that call this class
 * to get a scene object according
 * to the passed shape value.
 * @author Simon, Mikkel
 *
 */
public abstract class ItemFactory {
	protected static Geometry geometry = null;
	protected static Engine3D engine3DInstance;
	public static Map<String,List<URI>> dataPaths;
	
	
	/**
	 * initializes all necessary things.
	 */
	public static void init(Geometry geo, Engine3D engine3d , Map<String,List<URI>> paths){
		geometry = geo;
		engine3DInstance = engine3d;
		dataPaths = paths;
	}
	
	public static ArrayList<SceneObject> getItems(String shape, String geo, Animation activity) throws Exception{
		if(geometry == null){
			throw new NullPointerException("Initialize the item factory before calling the method.");
		}
		
		String currentShape = shape.toLowerCase();
		if(currentShape.startsWith("track")){
			// TODO: call the train factory			
			return new StaticItemFactory().createItems(shape, geo, activity);
		}
		else if(currentShape.startsWith("train")){
			return new DynamicItemFactory().createItems(shape, geo, activity);
		}
		else if(currentShape.startsWith("trafficlight")){
			return new DynamicItemFactory().createItems(shape, geo, activity);
			 
		}
		System.err.println("No valid shape for " + geo + " passed.");
		return null;
	}
	protected ArrayList<SceneObject> createItems(String shape, String geo, Animation activity){
		return null;
	}

//	protected SceneObject createItem(String geometry) {
//		return null;
//	}
}
