import java.util.Arrays;
import java.util.Scanner; 

public class wordSearch {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String word = in.next();;
		int rows = in.nextInt();
		int columns = in.nextInt();
		int m = 0;
		
		String[][] wordList = new String[columns][rows];
		
		for (String[] row: wordList)
		    Arrays.fill(row, "");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				String yes = in.next();
				wordList[j][i] += yes;
			}
		}
		
		//horizontal search
		for (int a = 0; a < rows; a++) {
			for (int i = 0; i < (columns - word.length() + 1); i++) {
				String word1 = "";
				String word2 = "";
				
				for (int j = 0; j < word.length(); j++) {
					word1 += wordList[j + i][a];
					word2 += wordList[columns - 1 - j - i][a];
				}
				
				if (word1.equals(word)) {
					m++;
				}
				if (word2.equals(word)) {
					m++;
				}
			}
		}
		
		for (int a = 0; a < columns; a++) {
			for (int i = 0; i < (rows - word.length() + 1); i++) {
				String word1 = "";
				String word2 = "";
				
				for (int j = 0; j < word.length(); j++) {
					word1 += wordList[a][j + i];
					word2 += wordList[a][rows - 1 - j - i];
				}
				
				if (word1.equals(word)) {
					m++;
				}
				if (word2.equals(word)) {
					m++;
				}
			}
		}
		
		for (int a = 0; a < (columns - word.length() + 1); a++) {
			for (int i = 0; i < (rows - word.length() + 1); i++) {
				String word1 = "";
				String word2 = "";
				
				for (int j = 0; j < word.length(); j++) {
					word1 += wordList[a+j][j + i];
					word2 += wordList[a+j][rows - 1 - j - i];
				}
				
				if (word1.equals(word)) {
					m++;
				}
				if (word2.equals(word)) {
					m++;
				}
			}
		}
		
		System.out.print(m);
		
	}

}