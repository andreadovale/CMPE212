package lab7;

import lab7.geometry.Vector2;

/**
 * A 2D translation transformation. A translation moves points by a vector
 * amount.
 * 
 * <p>
 * A translation matrix has the invariant that the upper-left 2x2 block is equal
 * to the 2x2 identity matrix. This class preserves that invariant.
 *
 */
public class Translation extends Affinity {

	/**
	 * Initializes a translation by the vector {@code (0, 0)}.
	 */
	public Translation() {
		super();
	}

	/**
	 * Initializes a translation by the vector {@code (x, y)}.
	 * 
	 * @param x the amount to move a point in the x direction
	 * @param y the amount to move a point in the y direction
	 */
	public Translation(double x, double y) {
		super();
		setVector(x, y);
	}

	
	/**
	 * Returns the vector corresponding to this translation.
	 * 
	 * @return the vector corresponding to this translation
	 */
	public Vector2 getVector() {
		return new Vector2(this.mat.get(0, 2), this.mat.get(1, 2));
	}

	/**
	 * Changes the translation vector for this transformation returning the previous
	 * vector.
	 * 
	 * <p>
	 * This method re-computes the elements of the matrix representing this
	 * transformation.
	 * 
	 * @param x the amount to move a point in the x direction
	 * @param y the amount to move a point in the y direction
	 */
	public void setVector(double x, double y) {
		this.mat.set(0, 2, x);
		this.mat.set(1, 2, y);
	}

	/**
	 * Returns the string starting with the string {@code "translation: "} followed
	 * by the string representation of the superclass.
	 * 
	 * @return a string representation of this transformation
	 */
	@Override
	public String toString() {
		return "translation: " + super.toString();
	}
}
