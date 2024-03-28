import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		int happyCount = 0;
		int sadCount = 0;
		
		for (int i = 0; i < input.length() - 3; i++) {
			String checkedInput = input.substring(0+i, 3+i);
			if (checkedInput.equals(":-)")) {
				happyCount ++;
			} else if (checkedInput.equals(":-(")) {
				sadCount ++;
			}
		}
		
		if (happyCount == 0 && sadCount == 0) {
			System.out.print("none");
		} else if (happyCount > sadCount) {
			System.out.print("happy"); 
		} else if (sadCount > happyCount) {
			System.out.print("sad");
		} else {
			System.out.print("unsure");
		}
	}
}