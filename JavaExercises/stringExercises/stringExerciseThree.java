package stringExercises;
import java.util.*;

public class stringExerciseThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String wordEntered = in.nextLine();
		
		System.out.print("Please enter a letter: ");
		String letterEntered = in.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < wordEntered.length(); i++ ) {
			if (wordEntered.substring(i, i + 1).equals(letterEntered)) {
				count ++;
			}
		}
		
		System.out.print("The letter " + letterEntered + " appears " + count + " times in " + wordEntered + ".");
	}

}
