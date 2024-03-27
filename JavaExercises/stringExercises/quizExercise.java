package stringExercises;
import java.util.*;

public class quizExercise {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = "hello";
		String input2 = "yella";
		
		for (int i = 0; i < input1.length(); i++) {
			if (input1.charAt(i) == input2.charAt(i)) {
				System.out.print(input1.charAt(i));
			}
		}
	}

}
