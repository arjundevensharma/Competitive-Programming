package loopExercises;
import java.util.*;

public class loopExercise4 {

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		for (int i = 10; i > 0; i--) {
			System.out.print(i + ", ");
			Thread.sleep(1000);
		}
		System.out.print("Blast Off!");
	}

}
