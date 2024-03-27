package lab7;

import lab7.geometry.Point2;

/**
 * A geometric transformation that adds the value {@code a * Math.sin(f * x)} to
 * the y coordinate of a point where {@code a} is a real-valued positive scaling
 * factor (called the amplitude), {@code f} is a real-valued positive value
 * (called the frequency), and {@code x} is the x coordinate of the point.
 *
 */
public class AddSineXToY implements Transform {

	// ADD FIELDS 
	

	/**
	 * Initializes the amplitude and frequency of this transformation to
	 * the specified strictly positive values.
	 * 
	 * @param amp the amplitude
	 * @param freq the frequency
	 * @throws IllegalArgumentException if {@code amp <= 0}
	 * @throws IllegalArgumentException if {@code freq <= 0}
	 */
	public AddSineXToY(double amp, double freq) {
	}

	/**
	 * Returns the amplitude of this transformation.
	 * 
	 * @return the amplitude of this transformation
	 */
	public double amplitude() {
	}

	/**
	 * Returns the frequency of this transformation.
	 * 
	 * @return the frequency of this transformation
	 */
	public double frequency() {
	}

	/**
	 * Adds the value {@code a * Math.sin(f * x)} to the y coordinate of {@code p}
	 * where {@code a} is the amplitude of this transformation, {@code f} is the
	 * frequency of this transformation, and {@code x} is the x coordinate of
	 * {@code p}.
	 * 
	 * @param p a point to transform
	 * @return the transformed point p
	 */
	@Override
	public Point2 transform(Point2 p) {
	}

}
