package contestExercises;

import java.util.*;

public class cupcakeParty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int regularBoxes = in.nextInt();
		int smallBoxes = in.nextInt();
		
		int numCupcakes = (regularBoxes * 8) + (smallBoxes * 3);
		
		System.out.print(numCupcakes - 28);
	}
}