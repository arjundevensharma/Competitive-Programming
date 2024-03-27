import java.util.*;

public class SelectionChallenge4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your sex (input an integer value; 1 = male and 2 = female): ");
		int sex = in.nextInt();

		System.out.print("Please enter your age (integer value): ");
		int age = in.nextInt();
		
		if (sex == 2) {
			
			if (age < 20) {
				System.out.print("The cost is 2 dollars.");
			} else if (age < 40) {
				System.out.print("The cost is 5 dollars.");
			} else {
				System.out.print("The cost is 10 dollars.");
			}
			
		} else if (sex == 1) {
			
			if (age < 20) {
				System.out.print("The cost is 5 dollars.");
			} else if (age < 40) {
				System.out.print("The cost is 10 dollars.");
			} else {
				System.out.print("The cost is 15 dollars.");
			}
			
		} else {
			System.out.print("The character 'M' or 'F' was not inputted, so the program doesn't work.");
		}
	}

}
