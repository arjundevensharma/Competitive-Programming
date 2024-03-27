package loopExercises;
import java.util.*;

public class nestedLoopExercise1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(getArmstrongSum(153));
	}
	
	public static double getArmstrongSum (int n) 
	{
		int digits = String.valueOf(n).length();
		
		if (digits <= 1) {
			return Math.pow(n, 3);
		}
		
		int places = (int) Math.pow(10, digits - 1);
		
		return Math.pow(n/places, 3) + getArmstrongSum((int)(n % places));
	}
}
