package loopExercises;
import java.util.*;

public class loopExercise6 {
	
	static <a, b> int findExponent(int a, int b) {
		
    	int answer = 1;
    	
    	/*loops runs b times; in each loop iteration, var "a" multiplies by itself and is stored in
    	 * variable answer.
    	 */
    	for (int i = 0; i < b; i += 1){
    		answer *= a;
    	}

      	return answer;
	  }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int number = 0;
		double sum = 0.0;
		int count = 0;
		
		do {
		System.out.print("Please enter a number (-1 to quit): ");
		number = in.nextInt();
		
		if (number!= -1) {
			sum += number;
			count ++;
		}
		
		}
		while (number != -1);
		
		if (sum == 0) 
		System.out.print("Program was quit upon startup.");
		
		else {
	
			System.out.print("The average of the inputted integers should be to _ decimal places:");
			int numDecimalPlaces = in.nextInt();
			
			int decimalPlaceCompensation = findExponent(10, numDecimalPlaces); 
			double averageTimesOneThousand = ( (sum * decimalPlaceCompensation ) / count);
			
			int roundedAverageTimesOneThousand = (int) (averageTimesOneThousand + (0.5) );
			int decimalValueOfAverage = roundedAverageTimesOneThousand % decimalPlaceCompensation;
			int integerValueOfAverage = roundedAverageTimesOneThousand / decimalPlaceCompensation;
			
			System.out.print("The average is " + integerValueOfAverage + "." + decimalValueOfAverage + ".");
		}
	}

}
