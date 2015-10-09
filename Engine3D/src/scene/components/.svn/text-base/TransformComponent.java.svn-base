package scene.components;

import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Quaternion;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import core.Helper;

/**
 * Main component for movement behaviour. 
 * Gives the objects, that contain
 * this component the ability to move in the 3D space.
 * Holds translation, scale and rotation matrices
 * to contain all necessary vectors for movements
 * in 3D space.
 * @author Simon, Mikkel
 *
 */
public class TransformComponent extends SceneComponent {
	private Vector3f translation = new Vector3f(0.0f, 0.0f, 0.0f); // Position
	private Vector3f rotation = new Vector3f(0.0f, 0.0f, 0.0f); // Rotation
	protected Vector3f scale = new Vector3f(1.0f, 1.0f, 1.0f); // Scale

	private Vector3f forward = new Vector3f(0.0f, 0.0f, -1.0f);
	protected Vector3f up = new Vector3f(0.0f, 1.0f, 0.0f);
	private Vector3f right = new Vector3f(1.0f, 0.0f, 0.0f);

	protected Quaternion pitch = new Quaternion();
	protected Quaternion yaw = new Quaternion();
	protected Quaternion roll = new Quaternion();
	protected Quaternion change = new Quaternion();

	private Matrix4f rotMatrix = new Matrix4f();

	protected Quaternion orientation = new Quaternion();

	//protected FloatBuffer modelMatrixBuffer = BufferUtils.createFloatBuffer(16);

	protected Matrix4f modelMatrix = new Matrix4f();

	/**
	 * Initializes the TransformComponent
	 * @param translation the position in 3D space.
	 * @param rotation the rotation in 3D space.
	 * @param scale the scale in 3D space.
	 */
	public TransformComponent(Vector3f translation, Vector3f rotation,
			Vector3f scale) {
		translate(translation);
		rotate(rotation);
		this.scale = scale;
	}

	@Override
	public void update() {
		modelMatrix = new Matrix4f();

		//Multiply in order: roll, bearing, pitch.
		Quaternion.mul(Quaternion.mul(roll, yaw, change), pitch, change);
		change.normalise();
		
		// Update the rotation matrix with the change quaternion.
		updateRotationMatrix(change);
		
		// Update the orientation quaternion
		Quaternion.mul(change, orientation, orientation);
		
		//Translate the rotation matrix to the position where the eye has moved.

		//Set the direction vector to know our orientation.
		
		getForward().x = rotMatrix.m20;
		getForward().y = rotMatrix.m21;
		getForward().z = rotMatrix.m22;
		getForward().normalise();

		//rotMatrix.store(modelMatrixBuffer);
		//modelMatrixBuffer.rewind();

		//Update our right and up orientation vectors.
		Vector3f.cross(new Vector3f(0.0f,1.0f,0.0f), getForward(), null).negate(null).normalise(getRight());
		Vector3f.cross(getRight(), getForward(), null).normalise(up);
		
		Matrix4f.mul(rotMatrix, modelMatrix, modelMatrix);
		Matrix4f.scale(this.scale, modelMatrix, modelMatrix);

	}

	private Matrix4f updateRotationMatrix(Quaternion q){

		float xx = q.x * q.x;
		float yy = q.y * q.y;
		float zz = q.z * q.z;

		float xy = q.x * q.y;
		float yz = q.y * q.z;
		float xz = q.x * q.z;

		float xw = q.x * q.w;
		float yw = q.y * q.w;
		float zw = q.z * q.w;


		rotMatrix.m00 = 1.0f - (2.0f * (yy + zz));
		rotMatrix.m01 = 2.0f * (xy + zw);
		rotMatrix.m02 = 2.0f * (xz - yw);
		rotMatrix.m03 = 0;

		// Second row
		rotMatrix.m10 = 2.0f * (xy - zw);
		rotMatrix.m11 = 1.0f - (2.0f * (xx + zz));
		rotMatrix.m12 = 2.0f * (yz + xw);
		rotMatrix.m13 = 0;

		// Third row
		rotMatrix.m20 = 2.0f * (xz + yw);
		rotMatrix.m21 = 2.0f * (yz - xw);
		rotMatrix.m22 = 1.0f - (2.0f * (xx + yy));
		rotMatrix.m23 = 0;

		// Fourth row

		//rotation.m30 = 0;
		//rotation.m31 = 0;
		//rotation.m32 = 0;
		//rotation.m33 = 1.0f;
		rotMatrix.m30 = getTranslation().x;
		rotMatrix.m31 = getTranslation().y;
		rotMatrix.m32 = getTranslation().z;
		rotMatrix.m33 = 1;

		return rotMatrix;
	}

	/**
	 * Move the object by some vector3f translation.
	 * @param translation
	 */
	public void translate(Vector3f translation) {
		this.getTranslation().translate(translation.x, translation.y, translation.z);
	}

	/**
	 * Translate the object by some vector3f rotation.
	 * @param rotation the x, y and z float values in Euler angles that the SceneObject of this TransformComponent should be rotated.
	 */
	public void rotate(Vector3f rotation) {
		// Old method
		//Vector3f.add(rotation, this.rotation, this.rotation);

		// New method
		/*
		Quaternion change = new Quaternion();
		Quaternion.mul(Quaternion.mul(rotation.z, rotation.x, change), rotation.y, change);
		change.setFromAxisAngle(new Vector4f(rotation.x, rotation.y, rotation.z, 0.0f));
		Quaternion.mul(change, orientation, orientation);*/

		// New method 2
		pitch(rotation.x);
		yaw(rotation.y);
		roll(rotation.z);
	}

	/**
	 * Change the pitch
	 * @param pitch delta in degrees
	 */
	public void pitch(float pitchDelta){
		getRotation().x += pitchDelta;
		if(getRotation().x > 360){
			getRotation().x -= 360;
		}else if(getRotation().x < 0){
			getRotation().x += 360;
		}
		pitch.setFromAxisAngle(new Vector4f(1f, 0f, 0f, Helper.degreesToRadians(getRotation().x)));
		pitch.normalise();
	}
	
	/**
	 * Change the yaw
	 * @param yaw delta in degrees
	 */
	public void yaw(float yawDelta){
		getRotation().y += yawDelta;
		if(getRotation().y > 360){
			getRotation().y -= 360;
		}else if(getRotation().y < 0){
			getRotation().y += 360;
		}

		yaw.setFromAxisAngle(new Vector4f(0f, 1f, 0f, Helper.degreesToRadians(getRotation().y)));
		yaw.normalise();
	}

	/**
	 * @param rollDelta
	 */
	public void roll(float rollDelta) {
		getRotation().z += rollDelta;
		if(getRotation().z > 360){
			getRotation().z -= 360;
		}else if(getRotation().z < 0){
			getRotation().z += 360;
		}
		roll.setFromAxisAngle(new Vector4f(0.0f, 0.0f, 1.0f, Helper.degreesToRadians(getRotation().z)));
		roll.normalise();
	}

	public Vector3f getTranslation() {
		return translation;
	}

	public Vector3f getRotation() {
		return rotation;
	}

	public Vector3f getScale() {
		return scale;
	}

	public Matrix4f getModelMatrix() {
		return modelMatrix;
	}

	public Quaternion getOrientation() {
		return orientation;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public Vector3f getForward() {
		return forward;
	}

	public void setForward(Vector3f forward) {
		this.forward = forward;
	}

	public Vector3f getRight() {
		return right;
	}

	public Matrix4f getRotMatrix() {
		return rotMatrix;
	}

	public void setRight(Vector3f right) {
		this.right = right;
	}

	public void setTranslation(Vector3f translation) {
		this.translation = translation;
	}

	public void setRotation(Vector3f rotation) {
		this.rotation = rotation;
	}

	public void rotate(Quaternion rotationQuat) {
		Quaternion.mul(change, rotationQuat, change);		
	}
}
