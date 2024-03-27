package methodExercises;
import java.util.*;

public class methodExerciseOne {

	public static String outputReverse(String word) {
		String newWord = "";
		for (int i = word.length(); i > 0; i--) {
			newWord += word.charAt(i - 1);
		}
		return newWord;
	}
	
	public static void outputWithSpaces(String word) {
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			newWord += word.charAt(i) + " ";
		}
		System.out.println(newWord);
	}
	
	public static boolean isPalendrome(String word) {
		if (word.equals(outputReverse(word))) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = in.nextLine();
		
		System.out.println("Your word reversed is: " + outputReverse(word));
		System.out.print("Your word with spaces is: ");
		outputWithSpaces(word);
		
		if(isPalendrome(word)) {
			System.out.print("Your word is a palindrome.");
		} else {
			System.out.print("Your word is not a palindrome.");
		}
	}	

}