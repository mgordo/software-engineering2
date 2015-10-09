package scene.components;

import java.util.ArrayList;

import org.lwjgl.util.vector.Vector3f;

import scene.objects.SceneObject;
import scene.objects.TrackedSceneObject;


/**
 * Class for the collision behavior.
 * @author Simon, Mikkel
 *
 */
public class ColliderComponent extends SceneComponent {
	private BoundingBoxComponent boundingBoxComp;
	private boolean currentlyColliding = false;	

	public ColliderComponent(SceneObject sceneObj, BoundingBoxComponent boundingBoxComp) {
		this.boundingBoxComp = boundingBoxComp;
		sceneObj.addComponent(boundingBoxComp);
	}

	@Override
	public void update() {
		boundingBoxComp.update();
	}

	@Override
	public void dispose() {
		boundingBoxComp.dispose();
	}

	public BoundingBoxComponent getBoundingBoxComponent(){
		return boundingBoxComp;
	}

	/**
	 * Checks if collider component collides with other collider
	 * component.
	 * @param colliders the collision component to check 
	 * collision against.
	 */
	public void updateCollisionState(ArrayList<ColliderComponent> colliders) {
		//FIXME: Potential unchecked component null pointer
		// If waiting..
		
		// get the forward vector
		// get the center of bounding box
		// move point according to the forward vector to the approriate 
		TrackedSceneObject trackedScene = (TrackedSceneObject) getSceneObject();
		Vector3f forward = new Vector3f(trackedScene.getTransform().getForward());
		
		forward.x *= boundingBoxComp.getBoundingBox().getDistancXToCenter();
		forward.y *= boundingBoxComp.getBoundingBox().getDistancYToCenter();
		forward.z *= boundingBoxComp.getBoundingBox().getDistancZToCenter();
		
		forward.scale(trackedScene.getEngine3DInstance().getDeltaTime() * trackedScene.getSpeed() * 10);
		
		Vector3f frontCenterPoint = new Vector3f();
		Vector3f.add(trackedScene.getTransform().getTranslation(), forward, frontCenterPoint);
		
		
		if(!((WaitComponent) getSceneObject().getComponent(WaitComponent.class)).isWaiting() ){
			// For all colliders..
			for (ColliderComponent collider : colliders) {
				if (collider != this) {
					boolean colliding = collider.getBoundingBoxComponent().intersects(frontCenterPoint);
					// If colliding..
					if (colliding) {
						currentlyColliding = true;
						return;
					}
				}
			}
		}
		currentlyColliding = false;
	}

	public boolean checkCollision(Vector3f point) {
		return boundingBoxComp.intersects(point);
	}

	public boolean currentlyColliding() {
		return currentlyColliding;
	}
}
