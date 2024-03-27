package lab7;

import lab7.geometry.Point2;

/**
 * A 2D rotation transformation where the rotation occurs about a specified
 * point by some angle specified in radians.
 * 
 * <p>
 * A remote rotation matrix has the invariant that the determinant of the matrix
 * is equal to 1. This class preserves that invariant.
 * 
 * <p>
 * Rotations about the same point that differ by an integer multiple of
 * {@code 2 * pi} radians are equal.
 *
 */
public class RemoteRotation extends Affinity {

	// the angle of rotation for this transformation
	private double radians;

	// the center of rotation for this transformation
	private Point2 center;

	/**
	 * Initializes a rotation of 0 radians about the point {@code (0, 0)}.
	 */
	public RemoteRotation() {

	}


	/**
	 * Initializes this remote rotation to the specified angle about the specified
	 * center of rotation.
	 * 
	 * @param radians the angle to rotate by
	 * @param center  the point to rotate about
	 */
	public RemoteRotation(double radians, Point2 center) {
		// IMPLEMENT set FIRST, THEN USE set TO COMPLETE THIS CONSTRUCTOR
	}

	/**
	 * Returns the angle of rotation.
	 * 
	 * @return the angle of rotation
	 */
	public double getRadians() {
		// ALREADY DONE FOR YOU
		return this.radians;
	}

	/**
	 * Returns a new point equal to the center of rotation.
	 * 
	 * @return the center of rotation
	 */
	public Point2 getCenter() {
		// ALREADY DONE FOR YOU
		Point2 new_point = this.center;
		return new_point;
	}

	/**
	 * Changes the angle of rotation for this transformation.
	 * 
	 * <p>
	 * This method re-computes the elements of the matrix representing this
	 * transformation if the specified angle is different from the current angle of
	 * rotation.
	 * 
	 * @param radians the angle of rotation
	 */
	public void setRadians(double radians) {
		// ALREADY DONE FOR YOU
		set(radians, this.center);
	}

	/**
	 * Changes the center of rotation for this transformation.
	 * 
	 * <p>
	 * This method re-computes the elements of the matrix representing this
	 * transformation.
	 * 
	 * @param center the center of rotation
	 */
	public void setCenter(Point2 center) {
		// ALREADY DONE FOR YOU
		set(this.radians, center);

	}

	/**
	 * Changes the angle and center of rotation for this transformation.
	 * 
	 * <p>
	 * This method re-computes the elements of the matrix representing this
	 * transformation.
	 * 
	 * @param radians the angle of rotation
	 * @param center  the center of rotation
	 */
	public void set(double radians, Point2 center) {
		
	}

	/**
	 * Returns the string starting with the string {@code "affinity: "} followed by
	 * the string representation of the superclass.
	 * 
	 * @return a string representation of this transformation
	 */
	@Override
	public String toString() {
		// ALREADY DONE FOR YOU
		return "affinity: " + super.toString();
	}

}
