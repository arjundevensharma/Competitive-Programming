import java.util.*;
public class pascalTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int n = in.nextInt();
		
		int [][] grades = new int [n][];
		
		grades[0] = new int [1];
		
		grades[0][0] = 1;
		
		for (int i = 1; i < grades.length; i++) {
			grades[i] = new int[i + 1];
			
			grades[i][0] = 1;
			grades[i][grades[i].length - 1] = 1;
			for (int j = 1; j < grades[i].length - 1; j++) {
				grades[i][j] = grades[i - 1][j - 1] + grades[i - 1][j];
			}
			
			
		}
		
		for (int i = grades.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < grades[grades.length - 1 - i].length; j++)
				System.out.print(grades[grades.length - 1 - i][j] + " ");
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}