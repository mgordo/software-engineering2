package scene.components;

import org.lwjgl.util.vector.Vector3f;

import scene.objects.SceneObject;

/**
 * Can be attached to sceneobjects.
 * Can be used to keep track of positions
 * of the attached object and more.
 */
public class AttachComponent extends SceneComponent {
	private SceneObject attachement;
	
	
	public AttachComponent(SceneObject attach){
		super();
		setAttachement(attach);
	}
	public SceneObject getAttachement() {
		return attachement;
	}
	public void setAttachement(SceneObject attachement) {
		this.attachement = attachement;
	}

	@Override
	public void update() {
		TransformComponent sceneObjectTransform = (TransformComponent) sceneObject.getComponent(TransformComponent.class);
		if (sceneObjectTransform != null) {
			
		}
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
