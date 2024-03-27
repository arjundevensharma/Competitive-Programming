import java.util.*;

public class SelectionChallenge3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the first number: ");
		int firstNum = in.nextInt();

		System.out.print("Please enter the second number: ");
		int secondNum = in.nextInt();
		
		if (firstNum % secondNum == 0) {
			System.out.print("Yes, " + firstNum + " is divisible by " + secondNum + ".");
		} else {
			System.out.print("No, " + firstNum + " is not divisible by " + secondNum + ".");
		}
	}

}
