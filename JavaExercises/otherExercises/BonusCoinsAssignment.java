import java.util.*;
public class BonusCoinsAssignment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Outputs a stand-alone line of text to welcome the user to the program
		System.out.println("Welcome to the Number Digit Flipper!");
		
		/* Prompts the user to input a 6-digit integer to enable the
		functionality of the program */
		System.out.print("Enter a 6-digit number: ");
		
		//Stores the inputted integer value in a variable named centAmount
		int inputtedNum = in.nextInt();
		
		/*Through processes using the operations mod and division, all six digits' values are stored
		*in int variables.
		*/
		int digitOne = inputtedNum / 100000;
		int digitTwo = inputtedNum % 100000 / 10000;
		int digitThree = inputtedNum % 10000 / 1000;
		int digitFour = inputtedNum % 1000 / 100;
		int digitFive = inputtedNum % 100 / 10;
		int digitSix = inputtedNum % 10 ;
		
		/*Now that the digit values have been stored, the digits by varying powers of 10 and added
		* together to manipulate their placement in the original inputted 6-digit number
		*/
		int newNum = (digitTwo * 100000) + (digitOne * 10000) + (digitFour * 1000) 
					 + (digitThree * 100) + (digitSix * 10) + digitFive;
		
		//Finally this new number is printed
		System.out.print("That number with each pair of digits switched is: " + newNum);
	}

}
