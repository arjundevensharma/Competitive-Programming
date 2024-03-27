package stringExercises;
import java.util.*;

public class stringExerciseOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String userWord = in.nextLine();
		
		System.out.print("The vowels of that word are: ");
		
		for(int i = 0; i < userWord.length(); i++) {
			
			String letter = userWord.substring(i, i + 1);
			
			if (letter.equals("a") || letter.equals("A") || letter.equals("e") || letter.equals("E") || letter.equals("i") || letter.equals("I") || letter.equals("O") || letter.equals("o") || letter.equals("U") || letter.equals("u") || letter.equals("Y") || letter.equals("y")) {
				System.out.print(userWord.charAt(i));
			}
		}
	}

}