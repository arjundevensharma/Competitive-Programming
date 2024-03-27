package stringExercises;
import java.util.*;

public class anagramGuessingGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//storing the five words being scrambled; customize as desired
		//String[] words = {"deliquescent", "floccinaucinihilipilification", "loquacious", "obdurate", "perspicacious"};
		
		String[] words = {"interesting", "winter", "spicy", "door", "alchemist"};
		
		System.out.print("Welcome to Arjun's Anagram Game!");
		
		int score = 0;

		for (int a = 0; a < words.length; a++) {
		
			String currentWord = words[a];
			int[] positions = new int[currentWord.length()];
			String newWord = "";
			
			for (int i = 0; i < currentWord.length(); i++) {
				int untakenRandNum = 0;
				boolean posTaken = true;
				
				if (i != (currentWord.length() - 1) ) {
				
					while(posTaken) {
						posTaken = false;
						int randNum = (int)Math.floor(Math.random()*(positions.length));
						
						for (int j = 0; j < positions.length; j++) {
							if (positions[j] == randNum) {
								posTaken = true;
							}
						}
						
						if (posTaken == false) {
							untakenRandNum = randNum;
							positions[i] = untakenRandNum;
						}
					}
					
				} else {
				positions[i] = untakenRandNum;
					}
				
				newWord += currentWord.charAt(untakenRandNum);
				
			}
		
		System.out.println("\nThis is scrambled word " + (a + 1) + ": " + newWord);
		
		System.out.print("\nEnter your first guess out of three of the unscrambled version of this word: ");
		String firstGuess = in.nextLine();
		
		if (firstGuess.equals(currentWord)) {
			System.out.println("\nAmazing! You got it first try!");
			score += 3;
		} else {
			System.out.print("\nThat's not it, try again. Enter your second guess out of three as to the unscrambled version of this word: ");
			String secondGuess = in.nextLine();
			
				if (secondGuess.equals(currentWord)) {
					System.out.println("\nGreat job! You got it!");
					score += 2;
				} else {
					System.out.print("\nThat's not it, try again. Enter your last guess as to the unscrambled version of this word: ");
					String thirdGuess = in.nextLine();
					
						if (thirdGuess.equals(currentWord) ) {
							System.out.println("\nYou got it! Third try's the charm!");
							score ++;
						} else {
							System.out.println("\nGood efforts. Unfortunately, all three guesses were wrong. The correct word was: " + currentWord + ".");
						}
			   } 
		}
			
		}
		
		System.out.print("\nThanks for playing Arjun's Anagram Game! You got a score of " + score + " points!");
	
	}

}
