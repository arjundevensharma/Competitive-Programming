package contestExercises;

import java.util.Scanner;

public class numSomething {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		int count = 0;
		int numFives = 0;
		int lengthOfFours = input / 4;
		
		for (int i = 0; i <= lengthOfFours; i++) {
			int numFours = lengthOfFours - numFives;
			int thing = (5 * numFives) + (4 * numFours);
			if (thing == input) {
				count++;
			}	
			numFives ++;
		}
		
		System.out.print(count);
	}
}