package arrayExercises;
import java.util.*;

public class arrayExercise1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] A = new int[10];
		int sum = 0;
		
		int[] B = new int[A.length];

		int min = A[0];
		int max = A[0];
		
		int min2 = 1;
		int max2 = 5;
		
		int smallest = max + 1;
		int largest = min - 1;
		
		int smallestIndex = 0;
		int largestIndex = 0;
		int placeholder = 0;
		
		int[] C = new int[100];
		int[] D = new int[max2];
		
		for (int i = 0; i < A.length; i++) {
			
			
			A[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
			System.out.print(A[i] + " ");
			
			sum += A[i];
		}
		
		
		
		System.out.println("\nThe sum of the above numbers is: " + sum);
		
		sum = 0;

		//2
		for (int i = 0; i < A.length; i++) {
			
			
			if(A[i] >= 3) {
			System.out.print(A[i] + " ");
			sum += A[i];
			}
			
		}
		
		sum = 0;
		System.out.println("");

		
		for (int i = 0; i < A.length; i++) {
			
			
			if(A[i] % 2 != 0) {
			System.out.print(A[i] + " ");
			sum += A[i];
			}
			
		}
		
		
		sum = 0;
		
		for (int i = 0; i < A.length; i++) {
			
			
			B[i] = A[i] * A[i];
		}
		
		sum = 0;

		for (int i = 1; i < A.length; i++) {
			
			
			if(A[i] % 2 != 0) {
			//System.out.print(A[i] + " ");
			sum += A[i];
			}
			
			B[i] = A[i] * A[i];
			
			if (A[i] < smallest) {
				smallest = A[i];
				smallestIndex = i;
			}
			
			if (A[i] > largest) {
				largest = A[i];
				largestIndex = i;
			}
		}
		
		System.out.println("\nThe largest number is " + largest + " and the smallest number is " + smallest + ".");
		sum = 0;

		for (int i = 0; i < A.length; i++) {
			
			B[i] = A[i] * A[i];
			
		}
		
		placeholder = A[largestIndex];
		
		A[largestIndex] = A[smallestIndex];
		
		A[smallestIndex] = placeholder;
		
		System.out.print(A);
		
		sum = 0;
		System.out.println("");
		
		for (int i = 0; i < C.length; i++) {
					
			C[i] = (int)Math.floor(Math.random()*(max2-min2+1)+min2);
			
			for (int j = 0; j < D.length; j++) {
				if (C[i] == (j+1) ) {
					D[j] = D[j] + 1;
				}
			}
		}	
		
		for (int j = 0; j < D.length; j++) {
			System.out.print(D[j] + " ");
		}
	}
	
}
