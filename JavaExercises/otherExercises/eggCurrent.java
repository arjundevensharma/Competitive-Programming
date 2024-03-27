import java.util.Scanner;

/** Determines the cost in dollars of an inputted amount of eggs based on given 
 *  costs for a dozen eggs, which vary based on the amount of egg dozens bought.
 *  @author arsharma 
 **/

public class eggCurrent {	
	
	/*finds the value of a to the power of b when values "a" and "b" are inputted to
	the method*/
	static <a, b> int findExponentValue(int a, int b) {
	    	int answer = 1;
	    	
	    	/*loops runs b times; in each loop iteration, var "a" multiplies by itself 
	    	 * and is stored in variable answer.
	    	 */
	    	for (int i = 0; i < b; i += 1){
	    		answer *= a;
	    	}
	    	
	      	return answer;
		  }
	
	//returns an inputted value rounded to a specified # decimal places as a string
	static <value, numDecimalPlaces> String decimalRounding(double value, int numDecimalPlaces) {
			
			//multiplies inputted value by 10^the specified # decimal places
			double valueTimesOneHundred = (value * findExponentValue(10, numDecimalPlaces));
			
			//rounds inputted value (times 10^the specified # decimal places)
			int roundedValueTimesOneHundred = (int) (valueTimesOneHundred + (0.5) );
			/*stores the decimal and integer value of the inputted value, rounded, as
			 * an integer */
			int decimalValue = roundedValueTimesOneHundred % findExponentValue(10, numDecimalPlaces);
			int integerValue = roundedValueTimesOneHundred / findExponentValue(10, numDecimalPlaces);
			String extraTensZeroNecessary = "";

			if (roundedValueTimesOneHundred % 100 / 10 == 0) {
				extraTensZeroNecessary += "0";
			}
			
			//returns the rounded inputted value as a string
			return (integerValue + "." + extraTensZeroNecessary + decimalValue);
		  }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Arjun's Egg Emporium!\n");
		
		System.out.print("Please enter the number of eggs you would like: ");
		int numEggs = in.nextInt();
		int numDozens = numEggs / 12;
		int numDPlaces = 2;
		
		double pricePerDozen = 0;
		
		/*stores price per dozen eggs based on the amount of dozen eggs 
		 * inputted by the user
		 */
		switch (numDozens) {
		  case 0:
		  case 1:
			pricePerDozen = 1.85;
			break;
		  case 2:
		  case 3:
		  case 4:
			pricePerDozen = 1.60;
			break;
		  case 5:
		  case 6:
		  case 7:
			pricePerDozen = 1.52;
			break;
		  case 8:
		  case 9:
		  case 10:
			pricePerDozen = 1.39;
		    break;
		  default:
			pricePerDozen = 1.25;
			break;
		}
		
		//determines number of extra eggs outside of egg dozens
		int numExtraEggs = numEggs % 12;
		//determines the price of the extra eggs outside of egg dozens as a double
		double priceExtraEggs = numExtraEggs * (pricePerDozen / 12);
		double priceEggDozens = numDozens * pricePerDozen;
		double totalPrice = priceEggDozens + priceExtraEggs;
		
		/*uses a function to store the cost of the egg dozens within the user's
		 * inputted egg amount as a string.
		 */
		
		String priceEggDozensRounded = decimalRounding(priceEggDozens, numDPlaces);
		
		/*uses a function to store the cost of the eggs outside of the egg dozens
		 * within the user's inputted egg amount as a string.
		 */
		
		String priceextraEggsRounded = decimalRounding(priceExtraEggs, numDPlaces);
		
		String totalPriceRounded = decimalRounding(totalPrice, numDPlaces);
		
		System.out.println("\nCost for dozens: $" + priceEggDozensRounded);
		System.out.println("Cost for extra eggs: $" + priceextraEggsRounded);
		System.out.print("\nYour total cost is: $" + totalPriceRounded + ".");
	}

}
