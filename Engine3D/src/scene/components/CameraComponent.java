package scene.components;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import core.Helper;

/**
 * This class implements a camera component.
 * It is used to render the scene from a specific point of view.
 * Since the camera is a scene component, it also can be moved around
 * if a transform component is added. Further, it can be attached to a
 * scene object for having a chaser camera.
 * @author Mikkel
 */
public class CameraComponent extends SceneComponent {
	private Matrix4f projectionMatrix = new Matrix4f();
	private Matrix4f viewMatrix = new Matrix4f();
	private float fieldOfView;
	private float aspectRatio;
	private float nearPlane;
	private float farPlane;

	/**
	 * Initializes the camera.
	 * @param fieldOfView the vertical angle of view of the camera
	 * @param aspectRatio the ratio of the view width to the view height
	 * @param nearPlane the closest plane of the view frustrum
	 * @param farPlane the plane at the end of the view frustrum, limiting how far things are drawn
	 */
	public CameraComponent(float fieldOfView, float aspectRatio,
		float nearPlane, float farPlane) {
		this.fieldOfView = fieldOfView;
		this.aspectRatio = aspectRatio;
		this.nearPlane = nearPlane;
		this.farPlane = farPlane;
		
		float y_scale = Helper.coTangent(Helper.degreesToRadians(fieldOfView / 2f));
		float x_scale = y_scale / aspectRatio;
		float frustum_length = farPlane - nearPlane;
		
		projectionMatrix.m00 = x_scale;
		projectionMatrix.m11 = y_scale;
		projectionMatrix.m22 = -((farPlane + nearPlane) / frustum_length);
		projectionMatrix.m23 = -1;
		projectionMatrix.m32 = -((2 * nearPlane * farPlane) / frustum_length);
        projectionMatrix.m33 = 0;
	}

	@Override
	/**
	 * Creates a new view matrix used for rendering the scene in accordance with the camera's position.
	 */
	public void update() {		
		TransformComponent transform = (TransformComponent) sceneObject.getComponent(TransformComponent.class);
		
		viewMatrix = new Matrix4f((Matrix4f) transform.getModelMatrix());
		viewMatrix.rotate(Helper.degreesToRadians(180.0f), new Vector3f(0.0f,1.0f,0.0f));
		viewMatrix.invert();
	}

	/**
	 * Use this to get the camera's projection matrix.
	 * @return the projection matrix used for translating 3D objects to 2D.
	 */
	public Matrix4f getProjectionMatrix() {
		return projectionMatrix;
	}

	/**
	 * Use this to get the camera's view matrix.
	 * @return the view matrix used for rendering the scene in accordance with the camera's position.
	 */
	public Matrix4f getViewMatrix() {
		return viewMatrix;
	}

	public float getFieldOfView() {
		return fieldOfView;
	}

	public float getAspectRatio() {
		return aspectRatio;
	}

	public float getNearPlane() {
		return nearPlane;
	}

	public float getFarPlane() {
		return farPlane;
	}

	/**
	 * Call dispose when the camera component is no longer needed and needs to be destroyed.
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
