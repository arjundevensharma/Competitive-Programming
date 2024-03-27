import java.util.Scanner;

public class goodGroupsCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int biggestSquare = 1;
		int numXDigits = 0;
		int numYDigits = 0;
		int squareAreaSize = in.nextInt();
		int numTrees = in.nextInt();
		boolean loopDone = false;
		String[] largeTreePositions = new String[numTrees];
		
		for (int i = 0; i < numTrees; i++) {
			String num1 = in.next();
			String num2 = in.next();
			largeTreePositions[i] = num1 + " " + num2;
		}
		
        for (int i = 0; i <= squareAreaSize; i++) {
        	if (loopDone == false) {
        	i *= i;
        	boolean noTrees = true;
        	int root = (int)Math.pow(i, 0.5);
        	int currentSquareSize = squareAreaSize + 1 - root;
        	
        	for (int j = 0; j < squareAreaSize - currentSquareSize; j++) {
        		for (int k = 0; k < squareAreaSize - currentSquareSize; k++) {
        				for (int l = 0; l < largeTreePositions.length; l++) {
        					int spaceIndex = largeTreePositions[l].indexOf(" ");
        					numYDigits = spaceIndex-1;
        					numXDigits = largeTreePositions[l].length() - 3 - numYDigits;
        					int currentXValue = Integer.parseInt(largeTreePositions[l].substring(numYDigits + 2,3 + numYDigits + numXDigits));
        					int currentYValue = (squareAreaSize + 1 - Integer.parseInt(largeTreePositions[l].substring(0,1+numYDigits)) );
        					
        					if (currentXValue >= k + 1 && currentXValue <= currentSquareSize + k) {
        						if (currentYValue >= j + 1 && currentYValue <= currentSquareSize + j) {
        							noTrees = false;
        						}
        					}
        					
        				}
        				if (noTrees == true) {
    						biggestSquare = currentSquareSize;
    						loopDone = true;
    					}
        				
        			}
        		}
        	
        	i = root;
        	}
        	
        }
        
        System.out.print(biggestSquare);
	}
}