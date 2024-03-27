package contestExercises;
import java.util.Scanner; 

public class sadnessIncompletion {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int m = 0;
		
		int []a = new int [t];
		int []b = new int [t];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			if (a[i] == 1) {
				m += 3;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
			if (b[i] == 1) {
				m += 3;
			}
		}
		
		for (int i = 0; i < t - 1; i++) {
			if (a[i] == 1 && a[i + 1] == 1) {
				m-= 2;
			}
			
			if (b[i] == 1 && b[i + 1] == 1) {
				m-= 2;
			}
			
			if (i % 2 == 0) {
				if (a[i] == 1 && b[i] == 1) {
					m-= 2;
				}
			}
		}
		
		if ((t - 1) % 2 == 0) {
			if (a[t - 1] == 1 && b[t - 1] == 1) {
				m-= 2;
			}
		}
		
		System.out.print(m);
	}

}