import java.util.*;
public class DebugTask {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//user enters num1 and num2. Outputs the remainder of num1/num2
		System.out.println("please enter first integer: ");
		int num1 = in.nextInt();
		
		System.out.println("please enter second integer: ");
		int num2 = in.nextInt();
		
		int integerQuotient = num1/num2;
		int num1MinusRemainder = integerQuotient * num2;
		
		System.out.println(num1-num1MinusRemainder);
		
		//user enters a 4 digit number. Outputs the digit second from the right
		System.out.println("please enter an integer: ");
		
		int fourDigitNum = in.nextInt();
		int threeDigitNum = fourDigitNum%1000;
		int hundredsDigit = threeDigitNum/100;
		
		System.out.println(hundredsDigit*10);
	}

}
