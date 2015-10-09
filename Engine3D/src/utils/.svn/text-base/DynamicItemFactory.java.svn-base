package utils;


import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.lwjgl.util.vector.Vector3f;

import geometry.Line;
import geometry.Point;
import scene.components.ColliderComponent;
import scene.components.TriggerComponent;
import scene.objects.DefaultSceneObject;
import scene.objects.SceneObject;
import scene.objects.TrackedSceneObject;
import animations.Animation;

/**
 * Concrete item factory for the trains.
 * @author Simon, Mikkel
 *
 */
public class DynamicItemFactory extends ItemFactory {

	@Override
	protected ArrayList<SceneObject> createItems(String shape, String geo, Animation activity) {
		System.out.println("creating " +  shape);
		SceneObject sceneObject = null;
		if(shape.startsWith("train")){//
			TrackedSceneObject tso1 = new TrackedSceneObject(engine3DInstance, dataPaths, shape );
			tso1.setGeometry(geo);
			tso1.setShape(shape);
			tso1.setActivity(activity);
			sceneObject = tso1;
		}
		else{//
			EList<Point> points = geometry.getPoints();
			for(Point point : points){
				if(point.getID().equals(geo)){
					// got the point
					// FIXME: create IItem Component for interfacing
					// with PNSim
					
					TrackedSceneObject tso1 = new TrackedSceneObject(engine3DInstance, dataPaths, shape);
					// ATTENTION change Z and Y value
					Vector3f position = new Vector3f(point.getX(), point.getZ(), point.getY());
					tso1.getTransform().translate(position);
					sceneObject = tso1;
				}
			}
		}
		System.out.println("Finished creating " + shape);
		ArrayList<SceneObject> sceneObjects = new ArrayList<SceneObject>();
		sceneObjects.add(sceneObject);
		return sceneObjects;		
	}

}
