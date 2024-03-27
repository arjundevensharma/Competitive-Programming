import java.util.*;

public class SelectionDebugAssignment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// user enters a grade. Program outputs what letter grade that is. Do
		// not change the order of if statements or add or delete statements. Simply
		// change the statements given. You MUST use an ELSE statement!!!

		System.out.println("please enter grade: ");

		int grade = in.nextInt();

		if (grade > 79)
			System.out.println("A");
		else if (grade > 69)
			System.out.println("B");
		else if (grade > 59)
			System.out.println("C");
		else if (grade > 49)
			System.out.println("D");
		else
			System.out.println("F");

		// The following code is supposed to see if you are eligible to ride on the
		// rollercoaster "Big Mama". You must be 40inches < x < 80inches in height,
		// 25kg < y < 85kg in weight, AND 5 < z < 65 years old to go on it. Rework the
		// code below so that it works. Feel free to shorten the number of lines.

		System.out.println("please enter age: ");
		int age = in.nextInt();
		
		System.out.println("please enter weight in kg: ");
		double weight = in.nextDouble();

		System.out.println("please enter height in inches: ");
		int height = in.nextInt();
		
		if (age > 5 && age < 65 && weight > 25 && weight < 85 && height > 40 && height < 80) {
			System.out.println("you may enter");
		} else {
			System.out.println("no, you can't go on the Big Mama");
		}

	}

}
