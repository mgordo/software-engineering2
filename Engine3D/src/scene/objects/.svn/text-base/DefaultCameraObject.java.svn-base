package scene.objects;

import org.lwjgl.util.vector.Vector3f;

import scene.components.AttachComponent;
import scene.components.CameraComponent;
import scene.components.SceneComponent;
import scene.components.TransformComponent;
import core.Engine3D;

/**
 * The default camera that can be used
 * to display the scene in a different
 * angle and from a different perspective.
 * Contains a transformcomponent with which
 * the camera is able to move around in
 * the 3D space.
 * @author Simon, Mikkel
 *
 */
public class DefaultCameraObject extends SceneObject {

	private float fieldOfView = 60f;
	private float aspectRatio;
	private float nearPlane = 0.1f;
	private float farPlane = 100f;

	public DefaultCameraObject(Engine3D engine3DInstance) {
		super(engine3DInstance);
		init();
	}
	public DefaultCameraObject(Engine3D engine3DInstance, CameraComponent camera) {
		super(engine3DInstance);
		init(camera);
	}
	public DefaultCameraObject(Engine3D engine3DInstance, TransformComponent trans) {
		super(engine3DInstance);
		init(trans);
	}
	public DefaultCameraObject(Engine3D engine3DInstance, CameraComponent camera, TransformComponent trans) {
		super(engine3DInstance);
		init(camera, trans);
	}

	private TransformComponent createStandardTransformComponent(){
		// We want to be able to move the camera around
		return new TransformComponent(new Vector3f(3.1548097f, 6.0451474f, -10.7045403f), new Vector3f(0,0,0), new Vector3f(1,1,1));
	}

	private CameraComponent createStandardCameraComponent(){
		// And the camera shall take care of management of view and projection matrices
		aspectRatio = (float)engine3D.getWidth() / (float)engine3D.getHeight();
		return new CameraComponent(fieldOfView, aspectRatio, nearPlane, farPlane);
	}

	private void init(){
		init(createStandardCameraComponent(), createStandardTransformComponent());
	}

	private void init(CameraComponent camera) {
		init(camera, createStandardTransformComponent());
	}

	private void init(TransformComponent trans) {
		init(createStandardCameraComponent(), trans);
	}

	private void init(CameraComponent camera, TransformComponent trans) {
		addComponent(trans);
		addComponent(camera);
	}

	@Override
	public void update(){
		SceneComponent comp = getComponent(AttachComponent.class);
		if(comp != null && comp instanceof AttachComponent){
			TransformComponent mainCamTrans = (TransformComponent)getComponent(TransformComponent.class);
			SceneObject attachement = ((AttachComponent) comp).getAttachement();
			if(attachement instanceof TrackedSceneObject){
				TrackedSceneObject track = (TrackedSceneObject)attachement;
				Vector3f p = Vector3f.sub(track.getOriginVector(), mainCamTrans.getTranslation(), null);
				p.z -=3;
				mainCamTrans.translate(p);
			}
		}
		super.update();
	}
}
