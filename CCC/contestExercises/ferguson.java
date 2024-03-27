package contestExercises;
import java.util.Scanner;

public class ferguson {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numPlayers = in.nextInt();
		int starPlayerCount = 0;
		
		for (int i = 0; i < numPlayers; i++) {
			int numPoints = in.nextInt();
			int numFouls = in.nextInt();
			
			if ( (numPoints * 5) - (numFouls * 3) > 40) {
				starPlayerCount ++;
			}
		}
		
		System.out.print(starPlayerCount);
		if (starPlayerCount == numPlayers) {
			System.out.print("+");
		}
	}
}