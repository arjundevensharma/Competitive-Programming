package contestExercises;

import java.util.Scanner; 

public class climateChange {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int currentNum = -1;
		
		while (currentNum != 0)
		{
			int numCases = in.nextInt();
			int shortest = numCases;
			
			int[] rawData = new int [numCases];
			
			for (int i = 0; i < numCases; i++) {
				rawData[i] = in.nextInt();
			}
			
			int [] diffs = new int [numCases - 1];
			
			for (int i = 0; i < numCases - 1; i++) {
				diffs[i] = rawData[i + 1] - rawData[i];
			}
			
			for (int i = 1; i < shortest; i++) {
				if (hasCycle(i, diffs) == true)
					shortest = i;
			}
			
			System.out.println(shortest);
		}
		
	}
	
	public static boolean hasCycle(int len, int[] diffs) {
		
		int numSeq = (int)((diffs.length + 0.5) / len);
		
		int[][] seq = new int [numSeq][len];
		
		for (int i = 0; i < numSeq; i++)
		{
			for (int j = 0; j < len; j++)
			{
				seq[i*2 - 1][j] = diffs[i + j];
			}
		}
		return true;
		
	}

}