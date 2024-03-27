package loopExercises;
import java.util.*;

public class LoopExercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int number = in.nextInt();
		long product = number;
		
		for(int i = (number - 1); i > 0; i--) {
			product *= i;
		}
		
		System.out.print(number + "! = " + product);
	}

}
