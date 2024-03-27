/*
ID: arjuns92
LANG: JAVA
PROG: ride
*/

import java.io.*;

public class ride {

	public static void main(String[] args) throws IOException { 
		BufferedReader in = new BufferedReader(new FileReader("ride.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	        
	    String a = in.readLine();
	    String b = in.readLine();
      
	    if (toNumber(a) % 47 == toNumber(b) % 47) {
	    	out.println("GO");
	    } else {
	    	out.println("STAY");
	    }
	    out.close();
	}

	public static int toNumber(String word) { 
		int sum = 1;
        for (int i = 0; i < word.length(); i++) {
        	sum *= ( (int)word.charAt(i) - 64);
        }
        return sum;
	}
}
