package methodExercises;
import java.util.*;

public class numberOneMethodEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Students[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		int grades[] = {82, 88, 68,90,95,46,99,86,85};
		System.out.println(getScholarAvg(grades));
		
		for (int i = 0; i < grades.length; i++) {
		
		if (isScholar(grades[i]) == true) {
			System.out.println(Students [i]);
		}
		
		}
		
	}
	
	/**
	 * 
	 * @param g
	 * @return
	 */
	
	public static boolean isScholar (int g) {
	
			return (g >= 86);
	}
	
	public static double getScholarAvg(int[] g) {
		int count = 0;
		int num = 0;
		for(int i = 0; i < g.length; i++) {
			if (g[i] >= 86) {
			num += g[i];
			count++;
			}
		}
		
		return (double)num / count;
	}
}
