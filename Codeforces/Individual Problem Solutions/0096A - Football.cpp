import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String n = in.next();
		
		if (n.contains("0000000") || n.contains("1111111"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
