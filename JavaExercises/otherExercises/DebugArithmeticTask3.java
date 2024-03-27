import java.util.*;
public class DebugArithmeticTask3 {
	/**

	 * Output the sum of the digits of a 4-digit number. 

	 * @author svojnov

	 *

	 */
	
	public static void main(String[] args) {		
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter a 4 digit number: ");		
	int number = in.nextInt();		
	
	int first = number/1000;		
	int second = number%1000/100;
	int third = number%100/10;	
	int fourth = number%10;		
	
	System.out.println("The sum is: " + first + second + third + fourth + ".");	}
	
	//This code gets the number of seconds that have elapsed 	
	//since January 1st.  Your job is to calculate how many 	
	//days, hours, and minutes that actually is 	
	//NOTE: use test data that you can verify on your calculator!! 	
}
