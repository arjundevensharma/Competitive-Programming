/*
ID: arjuns92
LANG: JAVA
PROG: gift1
*/

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class gift1 {

	public static void main(String[] args) throws IOException { 
		BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
	        
	    String NP = in.readLine();
	    int num = Integer.parseInt(NP);
	    String [] names = new String [num];
	    int [] bal = new int [num];
	    
	    for (int i = 0; i < num; i++) {
	    	names[i] = in.readLine();
	    }
	    	    
	    for (int i = 0; i < num; i++) {
	    	String name = in.readLine();
	    	String input = in.readLine();
	    	int ind2 = input.indexOf(" ");
	    	int val = Integer.parseInt(input.substring(0,ind2));
	    	int nump = Integer.parseInt(input.substring(ind2 + 1));
	    	
	    	if (nump != 0) {
	    	int eachEarning = val / nump;
	    	bal[Arrays.asList(names).indexOf(name)] = bal[Arrays.asList(names).indexOf(name)] - val + (val % nump);
	    	
	    	for (int j = 0; j < nump; j++) {
	    		String name1 = in.readLine();
		    	bal[Arrays.asList(names).indexOf(name1)] += eachEarning;
	    	}
	    	}
	    }
      
	    for (int i = 0; i < num; i++) {
	    	out.println(names[i] + " " + bal [i]);
	    }
	    
	    out.close();
	}
}
