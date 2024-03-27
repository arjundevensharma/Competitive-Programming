package stringExercises;
import java.util.*;
 
public class stringExerciseTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter word 1: ");
		String wordOne = in.nextLine();
		
		System.out.print("Enter word 2: ");
		String wordTwo = in.nextLine();
	
		System.out.print("Enter word 3: ");
		String wordThree = in.nextLine();
		
		System.out.print("Enter word 4: ");
		String wordFour = in.nextLine();
		
		System.out.print("Enter word 5: ");
		String wordFive = in.nextLine();
		
		String newWord = wordOne.substring(0,2) + wordTwo.substring(1,3) + wordThree.substring(2,3) 
		+ wordFour.substring(3,4) + wordFive.substring(4,5);
		
		System.out.print("\nYour new word is: " +  newWord);
	}

}
