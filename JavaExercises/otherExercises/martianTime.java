import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;

public class martianTime {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		//set up the stream between the program and the file
		System.out.print("\nPlease enter the file name to be encoded:");

		// Get file name from user input
		String filename = in.next();
		Scanner fileIn = new Scanner(new File (filename)); // Create a Scanner object to read from the input file
		
		// Create output file and writer
		FileWriter out = new FileWriter("outFile.txt");
		BufferedWriter bw = new BufferedWriter(out);
		PrintWriter outputFile = new PrintWriter(bw);
		
		String line;
		while(fileIn.hasNextLine()){ 
			
		}

		int ratio = 0;
		
		fileIn.close(); //must close the file after reading so that you can write back later

	}

}
