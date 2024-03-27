package loopExercises;
import java.text.DecimalFormat;
import java.util.*;

public class loopExercise7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double [] a = {12, 5, 6, 123, 5, 1};
		sort (a);
		
		for (int i = 0; i < a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void sort (double[] a) {
		for (int n = 1; n < a.length; n++) {
			double aTemp = a[n];
			int i = 0;
			
			for (i = n; i > 0 && aTemp < a[i - 1]; i--) {
				a[i] = a[i - 1];
			}
			a[i] = aTemp;
		}
	}

}
