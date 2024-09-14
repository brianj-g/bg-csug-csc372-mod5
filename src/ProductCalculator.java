import java.util.ArrayList;

/**
 * Provides a recursive method to return the product of an ArrayList of integers.
 */
public class ProductCalculator {
	
	/**
	 * Recursively multiply elements of an Integer ArrayList and return the result.
	 *  Made private because it should be called using a copy of the original ArrayList.
	 * @param inputNums
	 * @return the product of the ArrayList's elements as a Long integer
	 */
	private static long getProductRecursive(ArrayList<Integer> inputNums) {
		// The counter variable keeps track of the recursion count and is used as a base case to exit recursion
		int counter = inputNums.size() - 1;
		int currentValue = inputNums.get(counter);	
		
		// Base case: Return the currentValue when the specified number of inputs has been reached
		if (counter == 0) {
			return currentValue;
		}
		// Recursive case: Multiply the currentValue with the result of getProduct(inputNums)
		// Also removes the last element of the ArrayList, which effectively decrements the counter variable
		else {
			inputNums.remove(counter);
			return currentValue * getProduct(inputNums);
		}
	}
	
	/**
	 * The public method creates a copy of the ArrayList and passes it into the recursive method to avoid modifying the user's
	 *  original list.  This is a safer approach since there could be scenarios where the original object may be needed elsewhere.
	 * 
	 * @param inputNums
	 * @return the result of the recursive method as a Long integer
	 */
	public static long getProduct(ArrayList<Integer> inputNums) {
		ArrayList<Integer> inputCopy = new ArrayList<Integer>(inputNums);
		return getProductRecursive(inputCopy);
	}
}
