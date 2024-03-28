import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "";
		int A = 0;
		int B = 0;
		int operation = 0;
		
		for (;;) {
			int[] values = new int [2];
			input = in.nextLine();
			int num = Integer.parseInt( input.substring(0,1) );
			if (num != 7) {
				if (input.substring(2,3).equals("A")) {
					values[0] = A;
				} else {
					values[0] = B;
				}
			
				if (num == 1) {
					if (input.substring(2,3).equals("A") ) {
						A = Integer.parseInt(input.substring(4));
					} else {
						B = Integer.parseInt(input.substring(4));
					}
				} else if (num == 2) {
					if (input.substring(2,3).equals("A")) {
					System.out.println(A);
					} else {
					System.out.println(B);			
					}
				} else {
					if (input.substring(4,5).equals("A")) {
						values[1] = A;
					} else {
						values[1] = B;
					}
					switch (num) {
						case 3:
							operation = values[0] + values[1];
							break;
						
						case 4:
							operation = values[0] * values[1];
							break;
							
						case 5:
							operation = values[0] - values[1];
							break;
							
						case 6:
							operation = values[0] / values[1];
							break;
					}
					
					if (input.substring(2,3).equals("A")) {
						A = operation;
					} else {
						B = operation;
					}
					
					
				}
			}
			
			else {
				break;
			}
		} 
		
	}
}