import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Birthday Guesser!");
		System.out.println("1. Determine your birth month (1 = January, etc)");
		System.out.println("2. Multiply that number by 5");
		System.out.println("3. Add 6 to that number");
		System.out.println("4. Multiply the number by 4");
		System.out.println("5. Add 9 to the number");
		System.out.println("6. Multiply that number by 5");
		System.out.println("7. Add your birth day to the number");
		System.out.print("Enter your special number: ");
		
		int specialNumber = in.nextInt();
		int newNumber = specialNumber - 165;
		int birthMonth = newNumber / 100;
		int birthDay = newNumber % 100;
		
		System.out.print("Your birthday is " + birthMonth + "/" + birthDay + ".");
	}

}
