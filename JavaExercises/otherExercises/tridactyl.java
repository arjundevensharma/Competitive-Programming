import java.util.*;
import java.io.*;
public class tridactyl {
	/**
	 * This program decrypts user-entered strings, using the tridactyl algorithm.
	 * 
	 * Arjun + Ally did this 
	 */
	
  public static void main(String[] args) throws IOException { 	    
	Scanner in = new Scanner(System.in);

	//title
    System.out.println("Welcome to the Double-A Tridactyl (Ally and Arjun).");
    System.out.println("Now, enter your file name");

    String filename = in.next();
	Scanner fileIn = new Scanner (new File(filename));
    
    //title
    String passphrase = passToAlphabet(fileIn.nextLine());//find passphrase
    
    String line;
    while(fileIn.hasNextLine()) {//read each line of the file
    	
    	line = fileIn.nextLine();
    	line = line.substring(1, line.lastIndexOf(']'));//ignore square brackets
        System.out.println(decrypt(line, passphrase)+"\n");//decrypt each message in the file
    }
    
  }
/**
 * Turns passphrase user entered to new alphabet to decrypt stuff with
 * @param passphrase
 * @return
 */
  public static String passToAlphabet (String passphrase){
    String stringAlphabet = "";
    passphrase = passphrase.toUpperCase();//makes case consistent
    StringBuffer alphabet = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ ");
    for (int i = 0; i < passphrase.length(); i++) {//loop through passphrase characters to form new alphabet 
    	if (stringAlphabet.indexOf(passphrase.charAt(i)) == -1 && (Character.isLetter(passphrase.charAt(i)) || passphrase.charAt(i) ==' ')) {//if current character in passphrase hasn't already been recorded in new alphabet and is a space of letter
    		stringAlphabet += passphrase.charAt(i); //add character to new alphabet
    		alphabet.delete(alphabet.indexOf(passphrase.substring(i, i+1)), alphabet.indexOf(passphrase.substring(i, i+1)) + 1); //delete character from original alphabet
		}
    }
    stringAlphabet += alphabet; //add characters not found in passphrase to new alphabet
    return stringAlphabet;
  }
  
  /**
   * Decrypts message, turning message into base three according to passphrase, switching characters, and reconverting back to letters
   * 
   * @param message
   * @param passphrase
   * @return
   */
  public static String decrypt (String message, String passphrase) {
	  
	  String spaceCode = "";
	  
	  StringBuffer output = new StringBuffer("");
	  
	  for (int i = 0; i < message.length(); i++) { //loop through message characters
		  int num = passphrase.indexOf(message.charAt(i));
		  
		  output.append((num / 9) + "" + (num % 9 / 3) + "" + (num % 3)); //turn character into base three
		  
		  if (message.charAt(i) == ' ' && spaceCode.length() < 3) {
			  spaceCode += (num / 9) + "" + (num % 9 / 3) + "" + (num % 3);;
		  }
	  }
	  
	  while (output.length() % 9 != 0) {
		  output.append(spaceCode);
	  }
	  
	  String sequence = "";
		  
	  for (int i = 0; i < output.length()/9; i++) {
		 //takes in current sequence of base-3 
		 StringBuffer current = new StringBuffer(output.substring(i * 9, i * 9 + 9));
		 
		 //exchange digits as per guidelines
		 String temp = current.substring(6);
		 current.setCharAt(6, current.charAt(3));
		 current.setCharAt(3, temp.charAt(0));
		 
		 temp = current.substring(1);
		 current.setCharAt(1, current.charAt(7));
		 current.setCharAt(7, temp.charAt(0));
		 
		 temp = current.substring(2);
		 current.setCharAt(2, current.charAt(5));
		 current.setCharAt(5, temp.charAt(0));
		 
		 sequence += current.toString();
	  }
	  
	  String out = "";
	  
	  for(int i=0; i<sequence.length(); i+=3) {//loop through sequence 
			 //calculate base 3 to base 10
			 int dig= Integer.parseInt(sequence.substring(i, i +1))*9 + Integer.parseInt(sequence.substring(i+1, i+2))*3 + Integer.parseInt(sequence.substring(i+2, i+3));
			 out+=passphrase.charAt(dig);//add that num into out
		  }
	  
	  return out;
  }
 
}