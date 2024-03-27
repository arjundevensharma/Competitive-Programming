package ISC4U;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class ArjunSharmaMartianTime {
	/**
	 * This program converts Earth time to Martian time, given a quantity of Earth time conveyed through # days, hours, and minutes.
	 * It reads input from a file, performs the conversion, and writes the converted time to an output file.
	 * @author Arjun Sharma
	 */

	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
		//Process user-given file name, prompting for file name until valid one given
	    Scanner in = new Scanner(System.in);
	    System.out.print("Welcome to Arjun's Earth-Mars Planetary Time Converter!");
	    
	    String fileName;
	    do
	    {
	    	  System.out.print("\nPlease enter the name of the file containing your desired Earth time data: ");
		      fileName = in.next();
	    } while (!(new File(fileName).isFile()));
	    
	    //Read input and write output through files
	    Scanner fileIn = new Scanner(new File(fileName)); //Read input from user-given file name
	    PrintWriter outputFile = new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))); //Write output to a file named "output.txt"
	    
	    //data processing measures follow
	    int[] earthTimeData = new int[3]; // Create an array to store Earth time data [day, hour, minute]
	    DecimalFormat format = new DecimalFormat("00"); //Object to allow future formatting of output data per given conventions
	    
	    //calculate conversion ratio between Earth time and Martian time
	    double martianDaySeconds = (24 * 60 * 60) + (37 * 60) + 22.663; //calculate the amount of earth seconds that exists in a Martian day
		  double ratio = 86400 / martianDaySeconds; // Calculate the conversion ratio V-of what?
	    //Loading screen animation for usability 
	    System.out.print("\nConverting");
	    
	    for (int i = 0; i < Math.floor(Math.random() *(4) + 2); i++) {
			System.out.print(". ");
			Thread.sleep(500);
		  }
	    
	    System.out.println();
	    
	    // Read data from the input file and convert to Martian time
	    while (fileIn.hasNextLine()) {
	        for (int i = 0; i < earthTimeData.length; i++) {
	            earthTimeData[i] = fileIn.nextInt(); // Read the 3 int values from each line of the input file and store them in an earthTimeData array to be further processed in the rest of the code
	        }
	        
	        //Calculate converted time
	        earthTimeData[0]--; //Decrement the recorded number of Earth days to account for the Martian time difference
		    int totalEarthTimeSeconds = (earthTimeData[0] * 86400) + (earthTimeData[1] * 3600) + (earthTimeData[2] * 60); // Convert the given Earth time data from the currently processed line into an amount of Earth seconds
	        double totalMartianTimeSeconds = totalEarthTimeSeconds * ratio; //Calculate total equivalent number of Martian time seconds to Earth seconds V-doesn't it do the opposite?
	        
	        //store the converted time in days, hours, and minutes
	        int martianDays = (int) (totalMartianTimeSeconds / 86400) + 1; //V-why add 1?
          int martianHours = (int) (totalMartianTimeSeconds % 86400 / 3600);
          int martianMinutes = (int) (totalMartianTimeSeconds % 3600 / 60);

	        // Write the converted Martian time data in the specified output form to the output file
	        outputFile.println("Day " + martianDays + ", " + format.format(martianHours) + ":" + format.format(martianMinutes));
	    }
	    
	    System.out.println("\nThe given Earth time data has been successfully converted to Martian time data!\nYou can find the converted data in the file named 'output.txt'.");
	    
	    //Close the output file
	    outputFile.close(); 
	}
}