package lab7;

import lab7.geometry.Point2;

/**
 * A two-dimensional geometric transformation maps a two-dimensional point to 
 * a two-dimensional point.
 */
public interface Transform {
	/**
	 * Transforms the specified point using this transformation changing the
	 * coordinates of the point.
	 * 
	 * @param p a point to transform
	 * @return the transformed point p
	 */
	public Point2 transform(Point2 p);

	/**
	 * Maps the specified point using this transformation to produce a new point.
	 * 
	 * @param p a point to map
	 * @return a new point equal to this transformation applied to p
	 */
	default public Point2 map(Point2 p) {
		Point2 q = new Point2(p);
		return this.transform(q);
	}
}
