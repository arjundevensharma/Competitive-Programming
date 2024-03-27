package loopExercises;
import java.util.*;

public class nestedLoopExercise2Again {

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int userInput = 1;
		
		do {
			
			for (int i = 10; i > 0; i--) {
				System.out.print(i + ", ");
				Thread.sleep(1000);
			}
			System.out.print("Blast Off!");
		
		System.out.print("\n");
		System.out.print("Would you like to play again (1 = yes, 2 = no): ");
		userInput = in.nextInt();
		
		System.out.print("\n");
	}
	
	while (userInput < 2);
	}

}
