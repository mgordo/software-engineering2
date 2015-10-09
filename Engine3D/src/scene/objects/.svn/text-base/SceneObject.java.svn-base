package scene.objects;

import interfaces.IDisposable;
import interfaces.IUpdateable;

import java.util.ArrayList;

import scene.components.SceneComponent;
import core.Engine3D;

/**
 * Base object of the scene.
 * SceneObjects has SceneComponents that add functionality to the SceneObject.
 * A scene object is as the name says an object of the scene. Those objects
 * can have behavior components so called SceneComponents. With SceneComponents
 * the SceneObject could have the ability to move in the 3D space, to store
 * matrices used for the camera, to provide methods used for collision detection
 * or methods to interact with user inputs such as mouse or keyboard. 
 * @author Simon, Mikkel
 *
 */
public class SceneObject implements IUpdateable, IDisposable {
	private ArrayList<SceneComponent> components = new ArrayList<SceneComponent>();
	protected final Engine3D engine3D;
	
	/**
	 * Adds the engine3dinstance to the attributes.
	 * @param engine3DInstance the instance reference to be added
	 * to the attributes of the scene object.
	 * Read more about scene objects here {@link SceneObject}
	 */
	public SceneObject(Engine3D engine3DInstance) {
		this.engine3D = engine3DInstance;
	}
	
	/**
	 * Updates all components.
	 */
	public void update() {
		for (SceneComponent comp: getComponents()) {
			comp.update();
		}
	}
	
	/**
	 * Adds a component to the collection.
	 * @param component to be added to the collection.
	 */
	public void addComponent(SceneComponent component) {
		component.setSceneObject(this);
		getComponents().add(component);
	}

	/**
	 * Gets the first specific component according to 
	 * the given component type.
	 * If the given component type is not found, null
	 * is returned
	 * @param componentType of the returned object.
	 * @return a specific component according to the
	 * given component type.
	 */
	public SceneComponent getComponent(Class<?> componentType) {
		for (SceneComponent component : getComponents()) {
			if (component.getClass() == componentType) {
				return component;
			}
		}
		return null;
	}

	/**
	 * Gets all specific components according to 
	 * the given component type.
	 * If the given component type is not found, null
	 * is returned
	 * @param componentType of the returned object.
	 * @return a specific component according to the
	 * given component type.
	 */
	public ArrayList<SceneComponent> getComponents(Class<?> componentType) {
		ArrayList<SceneComponent> retVal = null;
		for (SceneComponent component : getComponents()) {
			if (component.getClass() == componentType) {
				if(retVal == null){
					retVal = new ArrayList<SceneComponent>();
				}
				retVal.add(component);
			}
		}
		return retVal;
	}

	/**
	 * Removes a specific component from the scene
	 * object.
	 * @param component to be removed from the
	 * collection.
	 */
	public void removeComponent(SceneComponent component) {
		getComponents().remove(component);		
	}

	/**
	 * Disposes all components of this object.
	 * Read more in {@link IDisposable}
	 */
	public void dispose() {
		// TODO Auto-generated method stub
		for (SceneComponent comp: getComponents()) {
			comp.dispose();
		}
	}

	/**
	 * Getter for the collection of components.
	 * @return the collection of components.
	 */
	protected ArrayList<SceneComponent> getComponents() {
		return components;
	}

	/**
	 * Sets the components of the scene object.
	 * For more information about what a component
	 * is read {@link SceneComponent}
	 * @param components collection, added to the
	 * scene object.
	 */
	public void setComponents(ArrayList<SceneComponent> components) {
		this.components = components;
	}
	
	public Engine3D getEngine3DInstance(){
		return this.engine3D;
	}
}
