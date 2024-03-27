import java.util.*;

public class SelectionChallenge2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the mark of the first test: ");
		int firstTestMark = in.nextInt();

		System.out.print("Please enter the mark of the second test: ");
		int secondTestMark = in.nextInt();

		System.out.print("Please enter the mark of the final exam: ");
		int finalExamMark = in.nextInt();
		
		int finalGrade = 0;
		
		if (finalExamMark < 50) {
			finalGrade = finalExamMark;
		} else {
			finalGrade = (firstTestMark + secondTestMark + finalExamMark) / 3;
		}
		
		System.out.print("The final mark is " + finalGrade + "%.");
	}

}
