package stringExercises;
import java.util.*;

public class stringDebuggingTask {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//user inputs a sentence. Output the sentence with all 'e's removed
		
		System.out.print("Enter sentence: ");
		String sent = in.nextLine();
		
		boolean done = true;
		String newSentence = "";
		
		do{ //this loop goes once for each word
			
			int sp = sent.indexOf(" "); //find out where first space is
			String word = "";
			
			if (sp == -1){ //if there is no space, I'm on last word of sentence
				done = false;
				word = sent;
			} else{
				word = sent.substring(0, sp); //get first word of sentence
				sent = sent.substring(sp + 1); //new sentence is everything after
			} //first word
			
				String newWord = "";
				for(int i=0;i<word.length();i++){ //loop through each letter of word
					if(word.charAt(i) != 'e') //if letter is not an 'e'
						newWord += word.charAt(i); //add letter to new word
				}
				newSentence += newWord + " "; //add new word to new sentence

		} while(done);
		System.out.println(newSentence);
	}

}
