import java.util.*;
public class DebugArithmeticTask2 {
	/**

	 * Get two 2-digit nums. Add the nums together by adding the digits separately. Not allowed to just add the nums.

	 * Assume the resulting digits don't exceed 9.

	 * Example: 12 + 34 = 46

	 * @author svojnov

	 *

	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter num1: ");
		int num1 = in.nextInt();

		System.out.print("Enter num2: ");

		int num2 = in.nextInt();
		int n1d1 = num1/10; //number 1, digit 1
		int n1d2 = num1%10; //number 1, digit 2
		int n2d1 = num2/10; //number 2, digit 1
		int n2d2 = num2%10; //number 2, digit 2
		int d1 = n1d1+n2d1;
		int d2 = n1d2+n2d2;
		int answer = (d1*10) + d2;
		
		System.out.println("Your answer is: ");
		System.out.print(answer);
	}

}
