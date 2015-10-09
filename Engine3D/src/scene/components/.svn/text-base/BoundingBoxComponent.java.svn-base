package scene.components;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import utils.BoundingBox;

public class BoundingBoxComponent extends SceneComponent {

	protected Vector3f[] vertexPositions = new Vector3f[8];
	protected byte[] indices;
	private Vector4f[] extremePoints;
	private Matrix4f lastRotMatrix;
	

	private BoundingBox boundingBox;
	
	public BoundingBoxComponent(BoundingBox boundingBox){
		this.boundingBox = boundingBox;
	}

	public BoundingBoxComponent(Vector4f[] vertexPositions, TransformComponent transform) {
		boundingBox = new BoundingBox();
		// lastRotation = transform.getOrientation();
		lastRotMatrix = transform.getRotMatrix();

		boundingBox.setCenter(transform.getTranslation());

		calculate(vertexPositions, lastRotMatrix);
	}

	@Override
	public void update() {
		TransformComponent transform = (TransformComponent) sceneObject
				.getComponent(TransformComponent.class);
		if (transform != null) {
			// Quaternion currentOrientation = transform.getOrientation();
			// if (lastRotation.x != currentOrientation.x || lastRotation.y !=
			// currentOrientation.y ||
			// lastRotation.z != currentOrientation.z || lastRotation.w !=
			// currentOrientation.w) {

			// }
			Matrix4f identityMatrix = new Matrix4f();
			Matrix4f rotMatrix = transform.getRotMatrix();
			if (Matrix4f.mul(rotMatrix, Matrix4f.invert(lastRotMatrix, null),
					null) != identityMatrix) {
				recalculate(rotMatrix);
			}
			lastRotMatrix = rotMatrix;
		}
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	private void recalculate(Matrix4f rotMatrix) {
		calculate(extremePoints, rotMatrix);
	}

	private void calculate(Vector4f[] vertexPositions, Matrix4f rotMatrix) {
//		System.out.println("Calculating bounding box");

		float highestX = Float.MIN_VALUE;
		float lowestX = Float.MAX_VALUE;
		float highestY = Float.MIN_VALUE;
		float lowestY = Float.MAX_VALUE;
		float highestZ = Float.MIN_VALUE;
		float lowestZ = Float.MAX_VALUE;
		
		Vector4f[] tempExtremePoints = new Vector4f[6];
		for (Vector4f elements : vertexPositions) {
			if(elements == null) {
				elements = new Vector4f();
			}
			
//			elements = Matrix4f.transform(rotMatrix, elements, null);
			
			if (elements.x > highestX) {
				highestX = elements.x;
				tempExtremePoints[0] = elements;
			}
			if (elements.x < lowestX) {
				lowestX = elements.x;
				tempExtremePoints[1] = elements;
			}
			if (elements.y > highestY) {
				highestY = elements.y;
				tempExtremePoints[2] = elements;
			}
			if (elements.y < lowestY) {
				lowestY = elements.y;
				tempExtremePoints[3] = elements;
			}
			if (elements.z > highestZ) {
				highestZ = elements.z;
				tempExtremePoints[4] = elements;
			}
			if (elements.z < lowestZ) {
				lowestZ = elements.z;
				tempExtremePoints[5] = elements;
			}
		}

		extremePoints = tempExtremePoints;

		float distX = Math.abs(highestX - lowestX);
		boundingBox.setDistancXToCenter(distX / 2);
		float distY = Math.abs(highestY - lowestY);
		boundingBox.setDistancYToCenter(distY / 2);
		float distZ = Math.abs(highestZ - lowestZ);
		boundingBox.setDistancZToCenter(distZ / 2);
		
		if(sceneObject != null)
		boundingBox.setCenter(((TransformComponent) sceneObject
				.getComponent(TransformComponent.class)).getTranslation());
	}
	
	/**
	 * Checks if two BoundingBoxComponents intersect.
	 * 
	 * @param boundingBoxComp
	 *            the BoundingBoxComponent that is checked if it intersects with
	 *            the current one.
	 * @return true if the two BoundingBoxComponents intersect, otherwise false
	 */
	public boolean intersects(BoundingBoxComponent boundingBoxComp) {
		return (this.boundingBox.intersects(boundingBoxComp.getBoundingBox()));
	}
	
	public boolean intersects(Vector3f point) {
		return (this.boundingBox.intersects(point));
	}

	/**
	 * Getter for the current BoundingBox.
	 * 
	 * @return the current BoundingBox.
	 */
	public BoundingBox getBoundingBox() {
		return this.boundingBox;
	}
}
