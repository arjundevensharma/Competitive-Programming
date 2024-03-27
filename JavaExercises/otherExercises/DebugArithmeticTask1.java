import java.util.*;
public class DebugArithmeticTask1 {
	/** * Calculate % based on test and assignment grades. Round final %. 
	 * * Term mark is meant to be 60% of the final, the summative grade 25% and the exam 15% 
	 * * @author svojnov * 
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your term work grade: ");
		int term = in.nextInt();

		System.out.print("Enter your summative grade: ");
		int sum = in.nextInt();

		System.out.print("Enter your exam grade: ");
		int exam = in.nextInt();

		double finalG = term*.60 + sum*.15 + exam*.25;
		int finalGrade = (int)(finalG+0.5);

		System.out.println("Your final grade is: " + finalGrade  + "%.");
	}
}
