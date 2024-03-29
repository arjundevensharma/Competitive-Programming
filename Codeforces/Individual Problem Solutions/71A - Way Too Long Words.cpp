import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int t = in.nextInt();
		
		while (t --> 0) {
			String a = in.next();
			if (a.length() > 10) {
				char b = a.charAt(0);
				int d = a.length() - 2;
				char c = a.charAt(a.length() - 1);
				System.out.println("" + b + d + c);
			}
			else {
				System.out.println(a);
			}
		}
	}

}
