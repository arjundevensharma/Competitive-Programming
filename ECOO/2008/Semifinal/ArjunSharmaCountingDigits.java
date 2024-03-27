package ISC4U;

import java.io.*;
import java.util.*;

public class ArjunSharmaCountingDigits {
	/**
	 * This program counts the number of digits used to number a range of pages.
	 * @author Arjun Sharma
	 * @version 1.0
	 */
	public static void main(String[] args) throws IOException, FileNotFoundException {
	    Scanner in = new Scanner(System.in); // Create a Scanner object to read input from the user
	    //again, DATA11.txt for sure?
	    Scanner fileIn = new Scanner(new File("DATA11.txt")); // Create a Scanner object to read from a file
	    PrintWriter outputFile = new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))); // Create a PrintWriter object to write output to a file
	    
	    while (fileIn.hasNextLine()) { // Loop through each line in the input file
	        int startPage = Integer.parseInt(fileIn.next()); // Read the start page number from the file and convert it to an integer
	        int endPage = Integer.parseInt(fileIn.next()); // Read the end page number from the file and convert it to an integer
	        int numPages = endPage - startPage + 1; // Calculate the number of pages in the range
	        int numDigits = findNumDigits(startPage, endPage); // Calculate the number of digits used to number the pages
	
	        String formattedData = "There are " + numDigits + " digits used to number the " + numPages + " pages"; // Create a formatted string with the results
	
	        outputFile.println(formattedData); // Write the formatted string to the output file
	    }
	
	    outputFile.close(); // Close the output file
	}
	
	/**
	 * Calculates the number of digits used to number a range of pages
	 *
	 * @param startPage The starting page number
	 * @param endPage The ending page number
	 * @return The total number of digits of all pages between start and ending pages
	 */
	public static int findNumDigits(int startPage, int endPage) {
	    int searchNum = startPage; // Set the initial search number to the starting page number
	    int digits = 0; // Initialize the total number of digits to 0
	
	    while (searchNum <= endPage) { // Loop through each page number in the range
	        int currentDigits = (int) (Math.log10(searchNum) + 1); // Calculate the number of digits in the current page number
	        int nextNum = (int) (Math.pow(10, currentDigits)); // Calculate the next page number with the same number of digits
	        if (nextNum > endPage) { // If the next page number exceeds the end page, adjust it to the end page
	            nextNum = endPage + 1; //adds 1 to the number so that when the searchNumber is subtracted from it, it will correctly output the number of digits between it and the searchNum
	        }
	
	        digits += currentDigits * (nextNum - searchNum); // Add the number of digits in the current range to the total count
	        searchNum = (int) (Math.pow(10, currentDigits)); // Update the search number to the next page number with the same number of digits
	    }
	
	    return digits; // Return the total number of digits
	}
}
