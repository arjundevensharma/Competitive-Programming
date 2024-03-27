package stringExercises;
import java.util.*;

public class stringExerciseSix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter sentence: ");
		String sentence = in.nextLine();
		
		int vowelCount = 0;
		int spaceCount = 0;
		
		//find number of words; find indexes for all spaces; some nested for loop to get it
		for(int i = 0; i < sentence.length(); i++) {
					
			String letter = sentence.substring(i, i + 1);
			
			if (letter.equals("a") || letter.equals("A") || letter.equals("e") || 
				letter.equals("E") || letter.equals("i") || letter.equals("I") || 
				letter.equals("O") || letter.equals("o") || letter.equals("U") || 
				letter.equals("u") || letter.equals("Y") || letter.equals("y")) {
				vowelCount ++;
			}
			
			if (letter.equals(" ") ) {
					spaceCount ++;
				}
		}
		
		int firstSpaceIndex = sentence.indexOf(" ");
		int currentSpaceIndex = firstSpaceIndex;
		String newWord = sentence.substring(0, firstSpaceIndex);
		
		System.out.print("The words with less than three vowels: ");
		
		for(int i = 0; i < (spaceCount + 1); i++) {
			int localVowelCount = 0;
			
			for (int j = 0; j < newWord.length(); j++) {
				
				String letter = newWord.substring(j, j + 1);

				if (letter.equals("a") || letter.equals("A") || letter.equals("e") || 
						letter.equals("E") || letter.equals("i") || letter.equals("I") || 
						letter.equals("O") || letter.equals("o") || letter.equals("U") || 
						letter.equals("u") || letter.equals("Y") || letter.equals("y")) {
						localVowelCount ++;
					}
			}
			
			if (localVowelCount < 3) {
				System.out.print(newWord + " ");
			}
			
			sentence = sentence.substring(currentSpaceIndex + 1);
			currentSpaceIndex = sentence.indexOf(" ");
			
			if (currentSpaceIndex == -1) {
				newWord = sentence;
			} else {
			newWord = sentence.substring(0, currentSpaceIndex);
			}
		}
		
		System.out.print("\nThere are " + vowelCount + " vowels.");
		
		/*
		String words[] = new String[(spaceCount + 1)];
		int spacePositions[] = new int[ (spaceCount + 1) ];
		spacePositions[0] = 0;
		int spaceIndex = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			
			String letter = sentence.substring(i, i + 1);
			
			if (letter.equals(" ") ) {
					spacePositions[spaceIndex] = i;
					words[spaceIndex] = sentence.substring(spacePositions[i], i);
					spaceIndex ++;
				}
		}
		
		System.out.print("The words with less than three vowels: ");
		
		for(int i = 0; i < words.length; i++) {
			int localVowelCount = 0;
			for (int j = 0; j < words[i].length(); j++) {
				
				String letter = words[i].substring(j, j + 1);

				if (letter.equals("a") || letter.equals("A") || letter.equals("e") || 
						letter.equals("E") || letter.equals("i") || letter.equals("I") || 
						letter.equals("O") || letter.equals("o") || letter.equals("U") || 
						letter.equals("u") || letter.equals("Y") || letter.equals("y")) {
						localVowelCount ++;
					}
			}
			if (localVowelCount < 3) {
				System.out.print(words[i] + " ");
			}
 		}
		
		System.out.print("\nThere are " + vowelCount + " vowels.");
		
		*/
	}

}
