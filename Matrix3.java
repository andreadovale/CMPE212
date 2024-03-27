package lab7;

import java.util.Arrays;

/**
 * A basic matrix class for 3x3 real-valued matrices.
 * 
 * <p>
 * The rows and columns of the matrix are indexed using a 0-based index (i.e.,
 * the first row is row 0 and the first column is column 0).
 */
public class Matrix3 {

	private double[][] elem;

	/**
	 * Initializes this matrix to a 3x3 matrix of all zeros.
	 */
	public Matrix3() {
		this.elem = new double[3][3];
		this.elem[0][0] = 1.0;
		this.elem[1][1] = 1.0;
		this.elem[2][2] = 1.0;
	}

	/**
	 * Initializes the elements of this matrix by copying the elements from another
	 * matrix.
	 * 
	 * @param other the matrix to copy
	 */
	public Matrix3(Matrix3 other) {
		this.elem = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.elem[i][j] = other.elem[i][j];
			}
		}
	}

	private static void validateIndexes(int row, int col) {
		if (row < 0 || row > 2) {
			throw new IndexOutOfBoundsException("row index out of bounds: " + row);
		}
		if (col < 0 || col > 2) {
			throw new IndexOutOfBoundsException("column index out of bounds: " + col);
		}
	}

	/**
	 * Returns the element at the specified row and column of this matrix.
	 * 
	 * @param row the row index
	 * @param col the column index
	 * @return the element at the specified row and column
	 * @throws IndexOutOfBoundsException if the row or column index is out of bounds
	 */
	public double get(int row, int col) {
		validateIndexes(row, col);
		return this.elem[row][col];
	}

	/**
	 * Replaces the element at the specified row and column of this matrix to the
	 * specified value returning the previous value.
	 * 
	 * @param row the row index
	 * @param col the column index
	 * @param val the value to stored at the specified indexes
	 * @return the previous element at the specified row and column
	 * @throws IndexOutOfBoundsException if the row or column index is out of bounds
	 */
	public double set(int row, int col, double val) {
		validateIndexes(row, col);
		double old = this.elem[row][col];
		this.elem[row][col] = val;
		return old;
	}

	/**
	 * Premultiplies this matrix by the specified matrix changing the elements of
	 * this matrix.
	 * 
	 * @param other the matrix to premultiply this matrix by
	 * @return a reference to this matrix
	 */
	public Matrix3 premultiply(Matrix3 other) {
		Matrix3 tmp = multiply(other, this);
		this.elem = tmp.elem;
		return this;
	}

	/**
	 * Postmultiplies this matrix by the specified matrix changing the elements of
	 * this matrix.
	 * 
	 * @param other the matrix to postmultiply this matrix by
	 * @return a reference to this matrix
	 */
	public Matrix3 postmultiply(Matrix3 other) {
		Matrix3 tmp = multiply(this, other);
		this.elem = tmp.elem;
		return this;
	}

	/**
	 * Computes the matrix product {@code a * b} returning the product as a new
	 * matrix.
	 * 
	 * @param a a matrix
	 * @param b a matrix
	 * @return the matrix product a * b
	 */
	public static Matrix3 multiply(Matrix3 a, Matrix3 b) {
		Matrix3 c = new Matrix3();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c.elem[i][j] = a.elem[i][0] * b.elem[0][j] + a.elem[i][1] * b.elem[1][j] + a.elem[i][2] * b.elem[2][j];
			}
		}
		return c;
	}

	/**
	 * Compares the specified object with this matrix for equality. Returns true if
	 * and only if the specified object is also a matrix and all corresponding pairs
	 * of elements in the two matrices are equal.
	 * 
	 * @param obj the object to be compared for equality with this matrix
	 * @return true if the specified object is equal to this matrix
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Matrix3)) {
			return false;
		}
		Matrix3 other = (Matrix3) obj;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (Double.doubleToLongBits(this.elem[i][j]) != Double.doubleToLongBits(other.elem[i][j])) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Returns a hash code for this matrix.
	 * 
	 * @return a hash code for this matrix
	 */
	@Override
	public int hashCode() {
		return Arrays.deepHashCode(this.elem);
	}

	/**
	 * Returns a string representation of this matrix.
	 * 
	 * <p>
	 * The returned string contains the elements of this matrix in row-major order
	 * (the elements of row 0, followed by the elements of row 1, followed by the
	 * elements of row2).
	 * 
	 * @return a string representation of this matrix
	 */
	@Override
	public String toString() {
		return Arrays.deepToString(this.elem);
	}

}
