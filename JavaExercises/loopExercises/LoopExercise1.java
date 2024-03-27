package loopExercises;
import java.util.*;

public class LoopExercise1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 153;
		System.out.print(armstrongSum(n));
	}
	
	public static String armstrongSum (int n)
	{
	
	int digits = String.valueOf(n).length();
	
	if (digits <= 1)
		return n + "";
	
	int places = (int) Math.pow(10, digits) - 1;
	
	int t = (int) Math.pow(n / places, 3);
	
	return t + "" + armstrongSum(n % places);
	
	}

}
