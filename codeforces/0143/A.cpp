import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int t = in.nextInt();
		
		int sum = 0;
		
		while (t --> 0) {
			if (in.nextInt() + in.nextInt() + in.nextInt() >= 2)
				sum++;
		}
		
		System.out.println(sum);
	}

}
