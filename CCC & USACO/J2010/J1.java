import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		int numWays = 0;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i > j) {
					break;
				}
				if (i + j == input) {
					numWays ++;
					break;
				}
			}
		}
		
		System.out.print(numWays);
	}
}