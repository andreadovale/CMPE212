package lab7;

/**
 * A 2D rotation transformation. A rotation rotates points about the origin
 * {@code (0, 0)} by some angle specified in radians.
 * 
 * <p>
 * A rotation matrix has the invariant that the determinant of the matrix is
 * equal to 1. This class preserves that invariant.
 * 
 * <p>
 * Rotations that differ by an integer multiple of {@code 2 * pi} radians are
 * equal.
 *
 */
public class Rotation extends Affinity {

	// ADD FIELD OR FIELDS
	

	/**
	 * Initializes a rotation of 0 radians.
	 */
	public Rotation() {

	}

	/**
	 * Initializes a rotation of the specified number of radians.
	 * 
	 * @param radians the angle of rotation
	 */
	public Rotation(double radians) {
		// IMPLEMENT setRadians FIRST, THEN USE setRadians TO COMPLETE THIS CONSTRUCTOR
		
	}

	
	/**
	 * Returns the angle of rotation for this transformation.
	 * 
	 * @return the angle of rotation for this transformation
	 */
	public double getRadians() {
	
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

	}

	/**
	 * Returns the string starting with the string {@code "rotation: "} followed by
	 * the string representation of the superclass.
	 * 
	 * @return a string representation of this transformation
	 */
	@Override
	public String toString() {
		// ALREADY DONE FOR YOU
		return "rotation: " + super.toString();
	}
}
