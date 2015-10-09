package scene.components;

import scene.objects.SceneObject;
import interfaces.IDisposable;
import interfaces.IUpdateable;

/**
 * Base class for all behavior components.
 * Has a reference to its scene object it belongs to.
 * @author Simon, Mikkel
 *
 */
public abstract class SceneComponent implements IUpdateable, IDisposable {
	//public boolean enabled = true;
	protected SceneObject sceneObject;
	
	public void setSceneObject(SceneObject sceneObject) {
		if (this.sceneObject != null)
			this.sceneObject.removeComponent(this);
		
		this.sceneObject = sceneObject;
	}
	
//	public SceneObject getSceneObject(){		
//		return this.sceneObject;
//	}
	
	/**
	 * Returns the class of the belonging scene object.
	 * @return the class of the belonging scene object.
	 */
	public Class<?> getSceneObjectClass(){
		return sceneObject.getClass();
	}
	
	public SceneObject getSceneObject(){
		return sceneObject;
	}
	
	/**
	 * Updates the component. Subclasses of SceneComponent should be updated each frame.
	 */
	public abstract void update();

	/**
	 * Call dispose() when the SceneComponent is no longer needed.
	 */
	public abstract void dispose();
}
