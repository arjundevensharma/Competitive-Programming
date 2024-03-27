package contestExercises;

import java.util.Scanner;

public class vowelThing {

	static String vowelOutput(String word, int i) {
		String newWord = "";
		
		if (word.substring(i,i+1).equals("a") || word.substring(i,i+1).equals("b") || word.substring(i,i+1).equals("c")) {
			newWord += "a";
		} else if (word.substring(i,i+1).equals("d") || word.substring(i,i+1).equals("e") || word.substring(i,i+1).equals("f") || word.substring(i,i+1).equals("g")) {
			newWord += "e";
		} else if (word.substring(i, i+1).equals("h") || word.substring(i,i+1).equals("i") || word.substring(i,i+1).equals("j") || word.substring(i,i+1).equals("k") || word.substring(i,i+1).equals("l")) {
			newWord += "i";
		} else if (word.substring(i, i+1).equals("m") || word.substring(i,i+1).equals("n") || word.substring(i,i+1).equals("o") || word.substring(i,i+1).equals("p") || word.substring(i,i+1).equals("q") || word.substring(i,i+1).equals("r") ) {
			newWord += "o";
		} else {
			newWord += "u";
		}
		
		return newWord;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String word = in.next();
		String newWord = "";
		
		for (int i = 0; i < word.length(); i++) {
			newWord += word.substring(i,i+1);
			
			if (word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u') {
				newWord += vowelOutput(word, i);
				
				if (word.charAt(i) == 'z') {
				    newWord += "z";
				} else {
					char ch = word.charAt(i);
					ch = (char)( ( (int) word.charAt(i) ) + 1);
										
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						ch = (char)( ( (int) ch ) + 1);
					}
					
					newWord += ch;
				}
			}
			
		}
		System.out.print(newWord);

	}
}