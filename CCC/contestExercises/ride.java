/*
ID: arjuns92
LANG: JAVA
TASK: ride
*/
package contestExercises;
import java.io.*;
import java.util.*;

class test {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer comet = new StringTokenizer(f.readLine());
    StringTokenizer group = new StringTokenizer(f.readLine());
    String one = comet.nextToken();
    String two = group.nextToken();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
	int charValue = 1;
	int charValue2 = 1;
	String output = "";
    for (int i = 0; i < one.length(); i++) {
    	char currentChar = one.charAt(i);
    	char currentChar2 = two.charAt(i);
    	charValue *= (alphabet.indexOf(currentChar) + 1);
    	charValue2 *= (alphabet.indexOf(currentChar2) + 1);
    }
    if (charValue % 47 == charValue2 % 47) {
    	output += "GO";
    } else {
    	output += "STAY";
    }
    out.println(output);                           // output result
    out.close();                                  // close the output file
  }
}