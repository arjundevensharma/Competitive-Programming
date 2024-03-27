import java.util.*;
import java.io.*;

public class tridactylCode {
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
	        System.out.println(back2Let(sequenceToExchanged(passToThreeDigitCode(line, passphrase), passphrase), passphrase) +"\n");//decrypt each message in the file
	    }
  }

  public static String passToAlphabet (String passphrase){
    String stringAlphabet = "";
    passphrase = passphrase.toUpperCase();
    StringBuffer alphabet = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ ");
    for (int i = 0; i < passphrase.length(); i++) {
    	if (stringAlphabet.indexOf(passphrase.charAt(i)) == -1 && (Character.isLetter(passphrase.charAt(i)) || passphrase.charAt(i) ==' ')) {
    		stringAlphabet += passphrase.charAt(i);
    		alphabet.delete(alphabet.indexOf(passphrase.substring(i, i+1)), alphabet.indexOf(passphrase.substring(i, i+1)) + 1);	
		}
    }
    stringAlphabet += alphabet;
    return stringAlphabet;
  }
  
  public static String passToThreeDigitCode(String message, String passphrase) {
	  
	  String spaceCode = "";
	  
	  String output = "";
	  for (int i = 0; i < message.length(); i++) {
		  int num = passphrase.indexOf(message.charAt(i));
		  
		  output += (num / 9) + "" + (num % 9 / 3) + "" + (num % 3);
		  
		  if (message.charAt(i) == ' ') {
			  spaceCode += output;
		  }
	  }
	  
	  while (output.length() % 9 != 0) {
		  output += spaceCode;
	  }
	  
	  return output;
  }
  
  /**
   * Exchanges digits of sequence as per guidelines
   * @param sequence
   * @param passphrase
   * @return exchanged digits
   */
  
  public static String sequenceToExchanged (String sequence, String passphrase)
  {
	  String output = "";
	  
	  for (int i = 0; i < sequence.length()/9; i++) {
		 //takes in current sequence of base-3 
		 StringBuffer current = new StringBuffer(sequence.substring(i * 9, i * 9 + 9));
		 
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
		 
		 output += current.toString();
	  }
	  
	  return output;
  }
  
  /**
   * This method gets the exchanged base-3 into letter: last part of code
   * @param sequence: base 3 string
   * @param passphrase: passphrase
   * @return
   */
  public static String back2Let (String sequence, String passphrase) {
	  String out="";
	  
	  for(int i=0; i<sequence.length(); i+=3) {//loop through sequence 
		 //calculate base 3 to base 10
		 int dig= Integer.parseInt(sequence.substring(i, i +1))*9 + Integer.parseInt(sequence.substring(i+1, i+2))*3 + Integer.parseInt(sequence.substring(i+2, i+3));
		 out+=passphrase.charAt(dig);//add that num into out
	  }
	  return out;//return out
  }
 
}