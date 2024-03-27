package methodExercises;
import java.util.*;

public class recursionPraccy {
	
	public static int exp(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * exp(a,b-1);
	}

	public static int mult(int n, int m) {
		if (m == 0) {
			return 0;
		}
		return n + mult(n, m - 1);//returns the value of n*m
	}


	public static int seq(int n) {
		if (n == 1) {
			return n;
		}
		return n + seq(n - 1);//returns the sum of 1+2+...+n
	}

	public static int div(int n, int m) {
        if (n < m) {
            return 0;
        }
        else {
            return 1 + div(n - m, m);
        }
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(div(10, 2));
	}

}
