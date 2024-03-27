import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an amount of money: ");
		
		double money = in.nextDouble();
		double tax = money / 5;
		double aTax = (money - 1000) / 2;
		
		System.out.println("Your money is: " + money);
		System.out.println("Your tax is: " + tax);
		System.out.println("Your adjusted tax is: " + aTax);
		System.out.println("Money = $" + money + ", Tax = $" + tax + ", Adjusted Tax = $" + aTax);
	}

}
