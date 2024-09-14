/*
 * Module 5 CTA Option 1: Implementing Recursion to Provide a Product
 * Brian Gunther
 * CSC372: Programming II
 * Colorado State University Global
 * Dr. Vanessa Cooper
 * September 15, 2024
 * 
 */

import java.util.ArrayList;

/**
 * Provides a recursive method to return the product of an ArrayList of integers.
 */
public class ProductCalculator {
	
	/**
	 * Recursively multiply elements of an Integer ArrayList and return the result.
	 * @param inputNums the ArrayList containing integers
	 * @param listSize the size of the ArrayList
	 * @return the product of the ArrayList's elements as a Long integer
	 */
	public static long getProduct(ArrayList<Integer> inputNums, int listSize) {
		// Validate that the listSize value is not greater than the size of the ArrayList
		if (listSize > inputNums.size()) {
			throw new IllegalArgumentException("Error: List size parameter exceeds the length of the ArrayList");
		}
		// Base case: Return 1 when the size of the ArrayList has been reached.
		//  The return value of 1 is multiplied by the result of the previous recursion, thus returning the value of that instance.
		if (listSize == 0) {
			return 1;
		}
		
		// Get the value at the current index
		int currentValue = inputNums.get(listSize - 1);	
		
		// Recursive case: Multiply the currentValue with the result of getProduct(inputNums)
		// Also decrements the counter variable
		return currentValue * getProduct(inputNums, listSize - 1);
	}
	
}
