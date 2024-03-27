package loopExercises;
import java.util.*;

public class LoopExercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter number 1: ");
		int firstNum = in.nextInt();

		System.out.print("Please enter number 2: ");
		int secondNum = in.nextInt();
		
		int differenceBetweenNumsInclusive = (secondNum - firstNum) + 1;
		
		System.out.print("Your even numbers are: ");
		/*
        int[] evenNumbers;
        evenNumbers = new int[(int)(differenceBetweenNumsInclusive)/2];
        */
        
		if (differenceBetweenNumsInclusive < 0) {
			
			differenceBetweenNumsInclusive *= -1;
			for(int i = 0; i < differenceBetweenNumsInclusive; i++) {
				if( (secondNum + i) % 2 == 0) {
					/*
					int arrayIndex = (int)( (i+1.5)/2 );
			        evenNumbers[arrayIndex] = (secondNum + i);
			        */
					
					System.out.print((secondNum + i) + ", ");
				}
			}
			
		} else {
			
			for(int i = 0; i < differenceBetweenNumsInclusive; i++) {
				if( (firstNum + i) % 2 == 0) {
					/*
					int arrayIndex = (int)( (i+1.5)/2 );
			        evenNumbers[arrayIndex] = (firstNum + i);
			        */
					System.out.print((firstNum + i) + ", ");
				}
			}
			
		}
		
	}

}