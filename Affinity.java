package lab7;

import lab7.geometry.Point2;

/**
 * A class representing a combination of one or more affine transformations.
 * Other affine transformations can be premultiplied or postmultiplied with this
 * transformation.
 */
public class Affinity implements Transform {

	/**
	 * The matrix representation of this transformation.
	 */
	protected Matrix3 mat;
	
	/**
	 * Initializes this affinity to the identity transformation.
	 */
	public Affinity() {
		this.mat = new Matrix3();
	}

	/**
	 * Initializes this affinity by copying another transformation.
	 * 
	 * @param t an affinity to copy
	 */
	public Affinity(Affinity t) {
		this.mat = new Matrix3(t.mat);
	}

	/**
	 * Premultiply this transformation with the specified transformation changing
	 * this transformation.
	 * 
	 * @param t a transformation to premultiply this transformation by
	 */
	public void premultiply(Affinity t) {
		this.mat.premultiply(t.mat);
	}

	/**
	 * Postmultiply this transformation with the specified transformation changing
	 * this transformation.
	 * 
	 * @param t a transformation to postmultiply this transformation by
	 */
	public void postmultiply(Affinity t) {
		this.mat.postmultiply(t.mat);
	}

	/**
	 * Transforms the specified point using this transformation changing the
	 * coordinates of the point.
	 * 
	 * @param p a point to transform
	 * @return the transformed point p
	 */
	public Point2 transform(Point2 p) {
		double x = this.mat.get(0, 0) * p.x() + this.mat.get(0, 1) * p.y() + this.mat.get(0, 2);
		double y = this.mat.get(1, 0) * p.x() + this.mat.get(1, 1) * p.y() + this.mat.get(1, 2);
		p.set(x, y);
		return p;
	}


	/**
	 * Returns a new copy of the matrix representation of this transformation.
	 * 
	 * @return a new copy of the matrix representation of this transformation
	 */
	public Matrix3 copyMatrix() {
		return new Matrix3(this.mat);
	}

	/**
	 * Returns a hash code for this transformation. The returned hash code is the
	 * hash code of the transformation matrix.
	 * 
	 * @return a hash code for this transformation
	 */
	@Override
	public int hashCode() {
		return this.mat.hashCode();
	}

	/**
	 * Compares the specified object with this affinity for equality. Returns true
	 * if and only if the specified object is also an {@code Affinity} object having a
	 * matrix representation equal to this transformation.
	 * 
	 * @param obj the object to be compared for equality with this transformation
	 * @return true if the specified object is equal to this transformation
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Affinity)) {
			return false;
		}
		Affinity other = (Affinity) obj;
		return this.mat.equals(other.mat);
	}

	/**
	 * Returns the string representation of the matrix representation of this
	 * transformation.
	 * 
	 * <p>
	 * The nine elements of the matrix will appear in an easily readable form in the
	 * returned string.
	 * 
	 * @return a string representation of this transformation
	 */
	@Override
	public String toString() {
		return this.mat.toString();
	}

}
