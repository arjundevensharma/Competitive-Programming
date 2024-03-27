package contestExercises;
import java.util.*;

public class HarpTuning {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		boolean isNum = false;
		
		for(int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '+') {
				System.out.print(" tighten ");
			} else if (input.charAt(i) == '-') {
				System.out.print(" loosen ");
			} else if (input.charAt(i) == '0' || input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) == '3' || input.charAt(i) == '4' || input.charAt(i) == '5' || input.charAt(i) == '6' || input.charAt(i) == '7' || input.charAt(i) == '8' || input.charAt(i) == '9'){
				System.out.print(input.charAt(i) );
				isNum = true;
			} else if (isNum == true){
				System.out.print("\n" + input.charAt(i) );
				isNum = false;
			} else {
				System.out.print(input.charAt(i) );			}
		}
	}

}