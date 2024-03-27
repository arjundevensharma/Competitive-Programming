import java.util.*;

public class SelectionChallenge5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter month: ");
		int month = in.nextInt();

		System.out.print("Please enter year: ");
		int year = in.nextInt();
		
		//This is a functionally unnecessary variable added to reduce clutter within the code.
		int numDays = 0;
		
		switch (month) {
		  case 1:
		  case 3:
		  case 5:
		  case 7:
		  case 8:
		  case 10:
		  case 12:
		    numDays = 31;
		    break;
		    
		  case 4:
		  case 6:
		  case 9:
		  case 11:
			numDays = 30;
		    break;
		    
		  case 2:
			if (year % 4 == 0) {
				numDays = 29;
			} else {
				numDays = 28;
			}
		    break;
		}
		
	    System.out.println(month + "/" + year + " has " + numDays + " days.");
	}

}
