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
import java.util.Scanner;
/**
 * Test class to prove functionality of the getProduct() and getProductRecursive() methods
 */
public class ProductTest {
	
	/**
	 * Parses the user's input string and converts it to an ArrayList of integers, if possible
	 * @param inputNums
	 * @return an ArrayList of integers
	 */
	public static ArrayList<Integer> parseString(String inputNums){
		ArrayList<Integer> numString = new ArrayList<Integer>();
		
		// The regular expression "\\s+" splits each string at one or more spaces
		String[] splitString = inputNums.split("\\s+");  
		
		for (int i = 0; i < splitString.length; ++i) {
	        try {
	            int currentNum = Integer.parseInt(splitString[i]);
	            numString.add(currentNum);
	        } catch (NumberFormatException e) {
	            System.out.println("\"" + splitString[i] + "\"" + " is not an Integer.");
	        }
		}
		
		return numString;
	}

	/**
	 * Main method prompts for user input, calls the parsing method, and then calls the method to calculate the product
	 * @param args
	 */
	public static void main(String[] args) {
		final int entryMax = 5;
		String entryString = null;
		ArrayList<Integer> inputNumbers = new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		
		// Basic input validation loop
		do {
			System.out.print("Enter " + entryMax + " integers separated by spaces (e.g., 10 12 14 16 18): ");
			entryString = s.nextLine();
			
			inputNumbers = parseString(entryString);
			
			if (inputNumbers.size() != entryMax) {
				System.out.println("Your input was invalid and did not return exactly " + entryMax + " integers. Please try again.");
			}
		} while (inputNumbers.size() != entryMax);
		
		// Call the getProduct() method to recursively multiply the numbers
		try {
			System.out.println("The product is: " + ProductCalculator.getProduct(inputNumbers, inputNumbers.size()));	
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		
		s.close();
	}

}
