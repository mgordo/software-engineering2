package scene.components;

import org.lwjgl.util.vector.Vector3f;
import org.omg.CORBA.INITIALIZE;

import core.Engine3D;
import scene.objects.SceneObject;
import utils.BoundingBox;

/**
 * This class implements the trigger behavior.
 * Every object that has the trigger behavior
 * @author Simon
 *
 */
public class TriggerComponent extends SceneComponent{
	private BoundingBoxComponent boundingBoxComponent;
	private WaitComponent waitingComponent;

	
	public TriggerComponent(SceneObject sceneObject){
		initialize(sceneObject, null);
	}
	
	public TriggerComponent(SceneObject sceneObject, BoundingBox boundingBox){
		initialize(sceneObject, boundingBox);
	}
	
	private void initialize(SceneObject sceneObject, BoundingBox boundingBox) {
		this.sceneObject = sceneObject;
		BoundingBoxComponent boundingBoxComp = (BoundingBoxComponent)sceneObject.getComponent(BoundingBoxComponent.class);
		if(boundingBoxComp == null){
			// no boundingbox component.
			
			if(boundingBox == null){
				// no boundingbox component.
				throw new NullPointerException();
			}
			
			boundingBoxComp = new BoundingBoxComponent(boundingBox);
			sceneObject.addComponent(boundingBoxComp);
			this.boundingBoxComponent = boundingBoxComp;
		} else{
			// a boundingbox component exists. Add it to the
			// internal references
			this.boundingBoxComponent = boundingBoxComp;
		}
		
		
		WaitComponent wait = (WaitComponent)sceneObject.getComponent(WaitComponent.class);
		if(wait != null){
			waitingComponent = wait;
		}else{
			waitingComponent = new WaitComponent(sceneObject.getEngine3DInstance(), false);
			sceneObject.addComponent(waitingComponent);
		}
	}
	

	public boolean checkCollision(Vector3f point) {
		return this.boundingBoxComponent.intersects(point);
	}

	public BoundingBox getBoundingBox(){
		return boundingBoxComponent.getBoundingBox();
	}
	


//	/**
//	 * Sets the component to wait.
//	 */
//	public void wait(boolean value){
//		waitingComponent.setWaiting(true);
//	}

	/**
	 * Sets the component to wait if value is true.
	 * else not to wait.
	 */
	public void waitForTrigger(boolean value){
		waitingComponent.setWaitingForever(value);
		waitingComponent.setWaiting(value);
	}
	
	/**
	 * returns true if waiting.
	 * @return
	 */
	public boolean waiting(){
		return waitingComponent.isWaiting();
	}
	
	/**
	 * Has to wait is true if the
	 * component has to wait due to
	 * a counter or sth. like that.
	 * @return
	 */
	public boolean hasToWait(){
		return !waitingComponent.waitingForever();
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void setWaitingTime(float counter) {
		waitingComponent.setWaitingTime(counter);
		waitingComponent.setWaiting(true);
	}

}
