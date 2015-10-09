package utils;

import org.lwjgl.util.vector.Vector3f;

/**
 * This is the main object for bounding box. It consists of a center point and
 * three distances to the most outer planes on each axis.
 * 
 * @author Simon, Mikkel
 * 
 */
public class BoundingBox {
	private float distancXToCenter;
	private float distancYToCenter;
	private float distancZToCenter;

	private Vector3f center;

	/**
	 * Constructor for the bounding box. No values are initialized.
	 */
	public BoundingBox() {

	}

	/**
	 * Constructor for the bounding box. Sets all necessary values according to
	 * the given values.
	 * 
	 * @param distanceX
	 *            the distance to the plane on the x axis.
	 * @param distanceY
	 *            the distance to the plane on the y axis.
	 * @param distanceZ
	 *            the distance to the plane on the z axis.
	 * @param center
	 *            the center point of the bounding box.
	 */
	public BoundingBox(float distanceX, float distanceY, float distanceZ,
			Vector3f center) {
		this.distancXToCenter = distanceX;
		this.distancYToCenter = distanceY;
		this.distancZToCenter = distanceZ;
		this.center = center;
	}

	/**
	 * Copy constructor.
	 */
	public BoundingBox(BoundingBox boundingBox) {
		this(boundingBox.getDistancXToCenter(), boundingBox
				.getDistancYToCenter(), boundingBox.getDistancZToCenter(),
				new Vector3f());
		// no defensive copies are created here, since
		// there are no mutable object fields (String is immutable)
		this.center.set(boundingBox.getCenter().getX(), boundingBox.getCenter()
				.getY(), boundingBox.getCenter().getZ());
	}

	/**
	 * Gets the distance from the center to the outer plane on the x axis
	 * 
	 * @return the distance
	 */
	public float getDistancXToCenter() {
		return distancXToCenter;
	}

	/**
	 * Sets the distance from the center to the outer plane on the x axis
	 * 
	 * @param distancXToCenter
	 *            the distance to the center.
	 */
	public void setDistancXToCenter(float distancXToCenter) {
		this.distancXToCenter = distancXToCenter;
	}

	/**
	 * Gets the distance from the center to the outer plane on the y axis
	 * 
	 * @return the distance
	 */
	public float getDistancYToCenter() {
		return distancYToCenter;
	}

	/**
	 * Sets the distance from the center to the outer plane on the y axis
	 * 
	 * @param distancYToCenter
	 *            the distance to the center
	 */
	public void setDistancYToCenter(float distancYToCenter) {
		this.distancYToCenter = distancYToCenter;
	}

	/**
	 * Gets the distance from the center to the outer plane on the z axis
	 * 
	 * @return the distance
	 */
	public float getDistancZToCenter() {
		return distancZToCenter;
	}

	/**
	 * Sets the distance from the center to the outer plane on the z axis
	 * 
	 * @param distancZToCenter
	 *            the distance to the center
	 */
	public void setDistancZToCenter(float distancZToCenter) {
		this.distancZToCenter = distancZToCenter;
	}

	/**
	 * Gets the center point.
	 * 
	 * @return the center point.
	 */
	public Vector3f getCenter() {
		return center;
	}

	/**
	 * Sets the center point.
	 * 
	 * @param center
	 *            the center point.
	 */
	public void setCenter(Vector3f center) {
		this.center = center;
	}

	/**
	 * The intersection method checks, if a other boundingbox object intersects
	 * with the current one.
	 * 
	 * @param boundingBox
	 *            which is checked if it intersects with the current one.
	 * @return true if the two boundingboxes intersect, otherwise false
	 */
	public boolean intersects(BoundingBox boundingBox) {
		float combinedDistanceCenterToXSide = Math.abs((getDistancXToCenter())
				+ (boundingBox.getDistancXToCenter()));
		float centerDistanceXAxis = Math.abs(getCenter().x
				- boundingBox.getCenter().x);
		if (centerDistanceXAxis > combinedDistanceCenterToXSide) {
			return false;
		}
		float combinedDistanceCenterToYSide = Math.abs((getDistancYToCenter())
				+ (boundingBox.getDistancYToCenter()));
		float centerDistanceYAxis = Math.abs(getCenter().y
				- boundingBox.getCenter().y);
		if (centerDistanceYAxis > combinedDistanceCenterToYSide) {
			return false;
		}
		float combinedDistanceCenterToZSide = Math.abs((getDistancZToCenter())
				+ (boundingBox.getDistancZToCenter()));
		float centerDistanceZAxis = Math.abs(getCenter().z
				- boundingBox.getCenter().z);
		if (centerDistanceZAxis > combinedDistanceCenterToZSide) {
			return false;
		}
		return true;
	}

	/**
	 * Checks if a point intersects with the bounding box.
	 * @param point the point which is checked against the bounding box.
	 * @return true if the point intersects with the bounding box.
	 */
	public boolean intersects(Vector3f point) {
		if (Math.abs(getCenter().x - point.x) > getDistancXToCenter()) {
			return false;
		}
		if (Math.abs(getCenter().y - point.y) > getDistancYToCenter()) {
			return false;
		}
		if (Math.abs(getCenter().z - point.z) > getDistancZToCenter()) {
			return false;
		}
		return true;
	}

}
