import java.util.ArrayList;

/**
 * Provides a recursive method to return the product of an ArrayList of integers
 */
public class ProductCalculator {
	
	public static int getProduct(ArrayList<Integer> inputNums) {
		// The counter variable keeps track of the recursion count and is used as a base case to exit recursion
		int counter = inputNums.size() - 1;
		int currentValue = inputNums.get(counter);	
		
		// Base case: Return the currentValue when the specified number of inputs has been reached
		if (counter == 0) {
			return currentValue;
		}
		// Recursive case: Call getProduct with the value of currentValue and the current counter
		else {
			inputNums.removeLast();
			return currentValue * getProduct(inputNums);
		}
	}
}
