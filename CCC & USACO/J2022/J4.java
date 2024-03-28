import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numSameStudentConstraints = in.nextInt();
		int constraintsBroken = 0;
		
		String[] sameStudentConstraints = new String[numSameStudentConstraints*2];
		
		for (int i = 0; i < sameStudentConstraints.length; i++) {
			sameStudentConstraints[i] += in.next();
		}
		
		int diffSameStudentConstraints = in.nextInt();
		
		String[] diffStudentConstraints = new String[diffSameStudentConstraints*2];
		
		for (int i = 0; i < diffStudentConstraints.length; i++) {
			diffStudentConstraints[i] += in.next();
		}
		
		int numGroups = in.nextInt();
		
		String[] groups = new String[numGroups*3];
		
		for (int i = 0; i < groups.length; i++) {
			groups[i] += in.next();
		}
		
		for (int i = 1; i <= numGroups; i++) {
			String word1 = groups[(i*3)-3];
			String word2 = groups[(i*3)-2];
			String word3 = groups[(i*3)-1];
			
			for (int j = 1; j <= numSameStudentConstraints; j++) {
				if (sameStudentConstraints[(j*2) - 2].equals(word1)) {
					if (sameStudentConstraints[(j*2) - 1].equals(word2) || sameStudentConstraints[(j*2) - 1].equals(word3)) {
						
					} else {
						constraintsBroken ++;
					}
				} else if (sameStudentConstraints[(j*2) - 2].equals(word2)) {
					if (sameStudentConstraints[(j*2) - 1].equals(word1) || sameStudentConstraints[(j*2) - 1].equals(word3)) {
						
					} else {
						constraintsBroken ++;
					}
				} else if (sameStudentConstraints[(j*2) - 2].equals(word3)) {
					if (sameStudentConstraints[(j*2) - 1].equals(word2) || sameStudentConstraints[(j*2) - 1].equals(word1)) {
						
					} else {
						constraintsBroken ++;
					}
				}
				else {
					
				}
			}
			
			for (int j = 1; j <= diffSameStudentConstraints; j++) {
				if (diffStudentConstraints[(j*2) - 2].equals(word1)) {
					if (diffStudentConstraints[(j*2) - 1].equals(word2) || diffStudentConstraints[(j*2) - 1].equals(word3)) {
						constraintsBroken ++;
					} 
				} else if (diffStudentConstraints[(j*2) - 2].equals(word2)) {
					if (diffStudentConstraints[(j*2) - 1].equals(word1) || diffStudentConstraints[(j*2) - 1].equals(word3)) {
						constraintsBroken ++;
					}
				} else if (diffStudentConstraints[(j*2) - 2].equals(word3)) {
					if (diffStudentConstraints[(j*2) - 1].equals(word2) || diffStudentConstraints[(j*2) - 1].equals(word1)) {
						constraintsBroken ++;
					}
				}
				else {
					
				}
			}
		}
		
		System.out.print(constraintsBroken);
	}
}