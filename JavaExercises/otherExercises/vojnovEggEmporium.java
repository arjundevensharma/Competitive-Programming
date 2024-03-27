import java.util.*;

/** Determines the cost in dollars of an inputted amount of eggs based on given 
 *  costs for a dozen eggs, which vary based on the amount of egg dozens bought.
 *  @author arsharma 
 **/

public class vojnovEggEmporium {	
	//Next Steps: repeated calculations in 3 functions
	
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
	
	/*returns the sum of two inputted values first _ (specified #) decimal places
	 * multiplied by 100 as an integer.
	 */
	
	
	static <value1, value2, numDecimalPlaces> int decimalAddition(double value1, double value2, int numDecimalPlaces) {
		
		//multiplies first inputted value by 10^the specified # decimal places
		double value1TimesOneHundred = (value1 * findExponentValue(10, numDecimalPlaces) );
		//rounds first inputted value times 10^the specified # decimal places
		int roundedValue1TimesOneHundred = (int) (value1TimesOneHundred + (0.5) );
		//stores the decimal value of first inputted value, rounded, as an integer
		int value1DecimalValue = roundedValue1TimesOneHundred % findExponentValue(10, numDecimalPlaces);
		
		//multiplies second inputted value by 10^the specified # decimal places
		double value2TimesOneHundred = (value2 * findExponentValue(10, numDecimalPlaces) );
		//rounds second inputted value times 10^the specified # decimal places
		int roundedValue2TimesOneHundred = (int) (value2TimesOneHundred + (0.5) );
		//stores the decimal value of second inputted value, rounded, as an integer
		int value2DecimalValue = roundedValue2TimesOneHundred % findExponentValue(10, numDecimalPlaces);
		
		/*returns the sum of the rounded decimal values of the first and second
		 * inputted values as an integer*/
		return (value1DecimalValue + value2DecimalValue);
	  }
	
	// returns the sum of two inputted values rounded to the nearest one as an integer
	static <value1, value2, numDecimalPlaces> int integerAddition(double value1, double value2, int numDecimalPlaces) {
		
		//multiplies first inputted value by 10^the specified # decimal places
		double value1TimesOneHundred = (value1 * findExponentValue(10, numDecimalPlaces) );
		//rounds first inputted value times 10^the specified # decimal places
		int roundedValue1TimesOneHundred = (int) (value1TimesOneHundred + (0.5) );
		//stores the decimal value of first inputted value, rounded, as an integer
		int integer1Value = roundedValue1TimesOneHundred / findExponentValue(10, numDecimalPlaces);
		
		//multiplies second inputted value by 10^the specified # decimal places
		double value2TimesOneHundred = (value2 * findExponentValue(10, numDecimalPlaces) );
		//rounds second inputted value times 10^the specified # decimal places
		int roundedValue2TimesOneHundred = (int) (value2TimesOneHundred + (0.5) );
		//stores the decimal value of second inputted value, rounded, as an integer
		int integer2Value = roundedValue2TimesOneHundred / findExponentValue(10, numDecimalPlaces);

		/*returns the sum of the rounded integer values of the first and second
		 * inputted values as an integer*/
		return (integer1Value + integer2Value);
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
		double numExtraEggs = numEggs % 12;
		//determines the price of the extra eggs outside of egg dozens as a double
		double priceExtraEggs = pricePerDozen * (numExtraEggs/12);
		String totalPrice = decimalRounding(priceExtraEggs + (numDozens * pricePerDozen), 2);
		
		/*uses a function to store the cost of the egg dozens within the user's
		 * inputted egg amount as a string.
		 */
		
		String eggDozensCost = decimalRounding( (numDozens * pricePerDozen), numDPlaces);
		
		if(eggDozensCost.length() == 3) {
			eggDozensCost = eggDozensCost.substring(0,2) + "0" + eggDozensCost.substring(2,3);
		}
		
		/*uses a function to store the cost of the eggs outside of the egg dozens
		 * within the user's inputted egg amount as a string.
		 */
		
		
		String extraEggsCost = decimalRounding(priceExtraEggs , numDPlaces);
		
		if(extraEggsCost.length() == 3) {
			extraEggsCost = extraEggsCost.substring(0,2) + "0" + extraEggsCost.substring(2,3);
		}
		
		System.out.println("\nCost for dozens: $" + eggDozensCost);
		System.out.println("Cost for extra eggs: $" + extraEggsCost);
		
		
		//stores the total decimal dollar value of the eggs as an integer
		//int totalDecimalValue = decimalAddition(priceExtraEggs, (numDozens * pricePerDozen), numDPlaces);
		//String extraTensZeroNecessary = "";

		/*calculates if the tens digit of the decimal value is 0, in which case variable
		extraTensZeroNecessary will store string value 0 for output formatting purposes.
		 
		if(totalDecimalValue % 100 / 10 == 0) {
			extraTensZeroNecessary += "0";
		}
		*/
		/*stores the total integer dollar value of the eggs without the carryover
		 * integer dollar value derived from the third-left digit of int var 
		 * "totalDecimalValue." E.g. if initialIntegerValue = 23 and totalDecimalValue
		 * = 124, this variable does not account for the 1 dollar represented in int var
		 * totalDecimalValue.
		
		int initialIntegerValue = integerAddition(priceExtraEggs, (numDozens * pricePerDozen), numDPlaces);
		 *///Stores the previously described carryover value from int var totalDecimalValue/* 
		//int carryOverFromDecimalValue = totalDecimalValue / 100;
			/*Stores the total integer dollar value of the eggs with the previously 
		 *described carryover value from int var totalDecimalValue.
		 *//*
		int TotalIntegerValue = initialIntegerValue + carryOverFromDecimalValue;
		//Stores total cost as a string
		String totalCost = TotalIntegerValue + "." + extraTensZeroNecessary + (totalDecimalValue % 100);
		
		*/
		
		System.out.print("\nYour total cost is: $" + totalPrice + ".");
	}

}
