package loopExercises;
import java.util.*;

public class LoopDebuggingAssignment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//#1
    	//output a to the exponent b. The following loop runs b times
		
    	int a; 
    	int b;
    	
    	System.out.print("Enter integer 'a': ");
    	a = in.nextInt();
    	
    	System.out.print("Enter integer 'b': ");
    	b = in.nextInt();
    	
    	int answer = 1;
    	
    	/*loops runs b times; in each loop iteration, var "a" multiplies by itself and is stored in
    	 * variable answer.
    	 */
    	for (int i = 0; i < b; i += 1){
    		answer *= a;
    	}

      	System.out.println(a + " to the exponent " + b + " is " + answer);

    	//#2 
    	//ask the user to enter 5 numbers. Output the highest and lowest number
    	
    	System.out.print("\nenter a number: ");
      	int firstNum = in.nextInt();
      	
      	int high = firstNum; 
    	int low = firstNum;
    	
    	/*iterates through the 4 numbers and stores them in variable high if they are higher than the
    	 *highest num prior determined + stores them in variable low if they are lower than the
    	 *lowest num prior determined
    	 */
    	for (int i = 0; i < 4; i++){
    		
          	System.out.print("enter a number: ");
          	int num = in.nextInt();
          	
          	if (num > high){
                	high = num;
          	}
          	
          	if(num < low)
                	low = num;
          	
    	}
    	
    	System.out.println("the highest is: " + high + " and the lowest is: " + low + "\n");
    	
    	//#3                	
    	//this section has the user enter more grades if they have
    	//a failing average, until their average is passing
    	
    	int average = 0;
    	int count = 1;
    	
    	do {
            System.out.print("Please enter another grade: ");
    	  	int newGrade = in.nextInt();
    	  	
    	  	average = ( (average * (count-1) ) + newGrade)/count;
    	
    	  	System.out.println("Your new average is " + average + "%");
    		count++;
    	} 
    	while (average < 50);

	}

}
