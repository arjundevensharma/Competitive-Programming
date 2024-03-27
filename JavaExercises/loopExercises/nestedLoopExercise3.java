package loopExercises;
import java.util.*;

public class nestedLoopExercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a positive integer: ");
		int num = in.nextInt();
		
		boolean notPrime = false;
		
		System.out.println("\nThe prime numbers up to " + num + " are: ");
		
		if (num > 2) {
			System.out.print("2, ");
		} else {
			System.out.print("Either there are no prime numbers under " + num + " or a decimal/negative number was inputted.");
		}
		
		for (int i = 3; i < num; i++) {
			notPrime = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					notPrime = true;
				}
			}
			
			if (notPrime == false) {
				System.out.print(i + ", ");
			}
		}
	}

}
