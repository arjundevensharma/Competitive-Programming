import java.util.*;
public class CoinsAssignment {
	/** Determine the least number of quarters, dimes, nickels, and pennies
	 *  needed to represent a value of 1-99 cents.
	 *  @author arsharma 
	 **/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Outputs a stand-alone line of text to welcome the user to the program
		System.out.println("Welcome to the Optimal Change Calculator!");
		
		/* Prompts the user to input an integer value from 1-99 to enable the
		functionality of the program */
		System.out.print("Enter a whole number from 1 to 99: ");
		
		//Stores the inputted integer value in a variable named centAmount
		int centAmount = in.nextInt();
		
		//Calculates cent value left after optimal # quarters are accounted for
		int leftoverCentValueAfterQuarters = centAmount % 25; 
		
		//Calculates cent value left after optimal # dimes are accounted for
		int leftoverCentValueAfterDimes = leftoverCentValueAfterQuarters % 10;
		
		//Calculates cent value left after optimal # nickels are accounted for
		int leftoverCentValueAfterNickels = leftoverCentValueAfterDimes % 5; 

		/*Calculates and stores the optimal amount of quarters, dimes, and nickels needed to represent
		 inputted cent value*/
		int quartersNeeded = centAmount / 25;
		int dimesNeeded = leftoverCentValueAfterQuarters / 10;
		int nickelsNeeded = leftoverCentValueAfterDimes / 5;
		/*It should be noted that the optimal amount of pennies needed to represent the inputted cent
		 * value is already stored in int variable "leftoverCentValueAfterNickels"
		 */
		
		/*Outputs the optimal amount of quarters, dimes, nickels, and pennies needed to represent 
		 * inputted cent
		 */
		System.out.print("\nYou need:\n" + quartersNeeded
		+ " quarters  25cents\n" + dimesNeeded 
		+ " dimes     10cents\n" + nickelsNeeded 
		+ " nickels   5 cents\n" + leftoverCentValueAfterNickels 
		+ " pennies   1 cent");
	}

}
