package ISC4U;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class ArjunSharmaSimpleSudoku {

	public static void main(String[] args) throws IOException  {
		
		String filename = "DATA11.txt";
		Scanner fileIn = new Scanner (new File(filename));
		
	    String line;
	    
	    for (int t = 5; t > 0; t--) {
	    
		    int[][] grid = new int [4][4];
		    
		    int cnt = 0;
		    int count = 0;
		    
		    while(fileIn.hasNextLine()) {//read each line of the file
		    	
		    	while (cnt < 4) {
			    	line = fileIn.nextLine();
			    	
			    	for (int j = 0; j < 4; j++) {
			    		grid[cnt][j] = line.charAt(j) == '-' ? 0 : line.charAt(j) - '0';
			    		
			    		if (grid[cnt][j] == 0) {
			    			count ++;
			    		}
			    	}
			    
			    	cnt++;
		    	}
		    
			    while (count > 0) {
			    	for (int i = 0;i<4;i++) {
			    		for(int j = 0; j < 4; j++) {
			    			if (grid[i][j] == 0) {
			    				boolean found [] = new boolean[4];
			    				
			    				for (int k = 0; k < 4; k++) {
			    					if (grid[i][k] > 0 && found[grid[i][k] - 1] != true) {
			    						found[grid[i][k] - 1] = true;
			    					}
			    					if (grid[k][j] > 0 && found[grid[k][j] - 1] != true) {
			    						found[grid[k][j] - 1] = true;
			    					}
			    				}
			    				
			    				int cnt1 = 0;
			    				for (int k = 0; k < 4; k++) {
			    					if (found[k] == true) cnt1++;
			    				}
			    				
			    				if (cnt1 == 3) {
			    					for (int k = 0; k < 4; k++) {
				    					if (found[k] == false) {
				    						grid[i][j] = k + 1;
				    						count--;
				    					}
				    				}
			    				}
			    			}
			    		}
			    	}
			    }
			    
		    	for (int i = 0; i < 4;i++) {
		    		for(int j = 0;j < 4; j++) {
		    			System.out.print(grid[i][j] + " ");
		    		}
		    		System.out.println();
		    	}

	    		System.out.println();
	    		
	    		cnt = 0;
	    		count = 0;
		    }
	    
	    }
	}

}
