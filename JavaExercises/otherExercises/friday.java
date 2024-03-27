/*
ID: arjuns92
LANG: JAVA
PROG: friday
*/

import java.io.*;
public class friday {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("friday.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

	    int n = Integer.parseInt(in.readLine());
	    int [] days = new int [7];
	    int benchmark = -3;
	    int [] addedDays = {31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	    
	    for (int i = 0; i < n; i++) {
	    	int year = 1900 + i;
	    	boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	    	if (isLeapYear == true) {
	    		addedDays[2] = 29;
	    	} else {
	    		addedDays[2] = 28;
	    	}
	    	
	    	
	    	for (int j = 0; j < 12; j++) {
	    		benchmark += addedDays[j] % 7;
	    		if (benchmark >= 7) {
	    			benchmark %= 7;
	    		}
	    		days[benchmark] ++;
	    	}
	    }
	    
	    out.print(days[0]);
	    for (int i = 1; i < days.length; i++) {
	    	out.print(" " + days[i]);
	    }
	    out.println();
	    out.close();
	}

}
