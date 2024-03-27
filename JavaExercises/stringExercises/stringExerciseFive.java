package stringExercises;
import java.util.*;

public class stringExerciseFive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter phone number: ");
		String phoneNumber = in.nextLine();
		
		int sum = 0;
		
		for (int i = 0; i < phoneNumber.length(); i++ ) {
			String currentNum = phoneNumber.substring(i, i + 1);
			
			if (currentNum.equals("-") ) {} else {
				sum += Integer.parseInt(currentNum);
			}
		}
		
		if (sum % 11 == 0) {
			System.out.print("Your number is rad!");
		} else {
			System.out.print("Your number is not rad!");
		}
	}

}
