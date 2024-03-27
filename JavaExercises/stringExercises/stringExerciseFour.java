package stringExercises;
import java.util.*;

public class stringExerciseFour {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter sentence: ");
		String sentence = in.nextLine();
		
		int spaceIndex = sentence.indexOf(" ");
		String firstWord = sentence.substring(0, spaceIndex);
		String secondWord = sentence.substring(spaceIndex + 1);
		
		System.out.print("Your new sentence: " + firstWord + " picks " + secondWord);
	}

}
