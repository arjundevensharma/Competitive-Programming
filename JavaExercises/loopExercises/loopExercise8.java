package loopExercises;
import java.util.*;

public class loopExercise8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int guess = 50;
		int guessIncrement = 25;
		int userInput = -1;
		double guessIncrementHalvingOperation = (double)(guessIncrement);
		
		do {
			System.out.print("Is your number " + guess + " (Too low = 0, Too high = 1, got it! = 2)?");
			userInput = in.nextInt();
			
			switch(userInput) {
			  case 0:
				  guess += guessIncrement;
				break;
			  case 1:
				  guess -= guessIncrement;
			    break;
			}
			
			guessIncrementHalvingOperation /= 2;
			double guessIncrementRoundingPreparation = guessIncrementHalvingOperation + 0.5;
			
			guessIncrement = (int)(guessIncrementRoundingPreparation); 
			
		}
		while (userInput != 2);
	}

}