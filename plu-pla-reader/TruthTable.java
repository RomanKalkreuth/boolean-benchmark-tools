import java.util.Vector;

/**
 * Implements a truth table which stores the inputs and outputs in two
 * dimensional vectors of generic type. This class can be used for compressed
 * and uncompressed truth tables.
 * 
 * Rows and chunks will be added as clones of the respective imput/output
 * row/chunk vectors.
 * 
 * The generic property of this class is bounded to Number.
 * 
 * @author Roman Kalkreuth, https://orcid.org/0000-0003-1449-5131,
 *         https://www.researchgate.net/profile/Roman-Kalkreuth,
 *         https://twitter.com/RomanKalkreuth
 *
 * @version 1.0
 *
 * @param <T> Generic type for the input/output vectors
 */
public class TruthTable<T extends Number> {

	private Vector<Vector<T>> inputs = new Vector<Vector<T>>();
	private Vector<Vector<T>> outputs = new Vector<Vector<T>>();

	private boolean compressed = false;

	/**
	 * Removes the elements of the two dimensional input/output vectors.
	 */
	public void clear() {
		inputs.clear();
		outputs.clear();
	}

	/**
	 * Returns the number of rows of the table.
	 * 
	 * @return Number of rows
	 */
	public int rows() {
		return inputs.size();
	}

	/**
	 * Prints a compressed or uncompressed truth table without header. The inputs
	 * and outputs are separated with whitespace.
	 */
	public void print() {
		// Iterate over the number of rows of the table.
		for (int i = 0; i < this.rows(); i++) {

			// Get the input/output rows at index i
			Vector<T> inputRow = (Vector<T>) this.getInputsAt(i);
			Vector<T> outputRow = (Vector<T>) this.getOutputsAt(i);

			// Iterate over the input row and print the inputs
			for (int j = 0; j < inputRow.size(); j++) {
				System.out.print(inputRow.get(j) + " ");
			}

			// Whitespace for seperation
			System.out.print("   ");

			// Iterate over the output row and print the outputs
			for (int j = 0; j < outputRow.size(); j++) {
				System.out.print(outputRow.get(j) + " ");
			}

			System.out.println();

		}
	}

	/**
	 * Adds an input row/chunk vector to the two dimensional input vector.
	 * 
	 * @param inputVec Vector containing an input chunk/row.
	 */
	public void addInputs(Vector<T> inputVec) {
		this.inputs.add((Vector<T>) inputVec.clone());
	}

	/**
	 * Adds an output row/chunk vector to the two dimensional output vector.
	 * 
	 * @param outputVec Vector containing an input chunk/row.
	 */
	public void addOutputs(Vector<T> outputVec) {
		this.outputs.add((Vector<T>) outputVec.clone());

	}

	/**
	 * Returns a chunk/row vector at the given index.
	 * 
	 * @param index of the input hunk/row within the two dimensional input vector
	 * 
	 * @return the chunk/row input vector at the given index
	 */
	public Vector<T> getInputsAt(int index) {
		return inputs.get(index);
	}

	/**
	 * Returns a chunk/row vector at the given index.
	 * 
	 * @param index of the output hunk/row within the two dimensional output vector
	 * 
	 * @return the chunk/row input vector at the given index
	 */
	public Vector<T> getOutputsAt(int index) {
		return outputs.get(index);
	}

	/**
	 * Returns the two dimensional input vector of the table.
	 * 
	 * @return two dimensional input vector
	 */
	public Vector<Vector<T>> getInputs() {
		return inputs;
	}

	/**
	 * Returns the two dimensional output input vector of the table.
	 * 
	 * @return two dimensional output vector
	 */
	public Vector<Vector<T>> getOutputs() {
		return outputs;
	}

	/**
	 * Returns the value the compressed variable.
	 * 
	 * @return value of the compressed variable
	 */
	public boolean isCompressed() {
		return compressed;
	}

	/**
	 * Sets the compressed variable.
	 * 
	 * @param compressed new Boolean value for the variable
	 */
	public void setCompressed(boolean compressed) {
		this.compressed = compressed;
	}

}
