import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
/*
public class goldbach {
	Scanner fileIn = new Scanner(new File ("DATA11.txt")); // Create a Scanner object to read from the input file
	
	// Create output file and writer
	FileWriter out = new FileWriter("DATA12.txt");
	BufferedWriter bw = new BufferedWriter(out);
	PrintWriter outputFile = new PrintWriter(bw);
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 
    int num = in.nextInt();
    int seq = 0;
    if (isPrime(num - 2))
    {
    	seq++;
    }
    for (int i = 3; i < num / 2 + 1; i+=2)
    {
    	if (isPrime(num - i) && isPrime(i))
    	{
    		seq++;
    	}
    }
    while (fileIn.hasNextLine()) {
		int num = fileIn.nextLine();
		// Use cipher method to encrypt/decrypt the current line of the file
		String newWord = cipher(line, direction, getKeyArray(key));
		outputFile.println(newWord); 
	} )
}

public static int calculateSeq (int num) {
	Scanner in = new Scanner(System.in);
    int seq = 0;
    if (isPrime(num - 2))
    {
    	seq++;
    }
    for (int i = 3; i < num / 2 + 1; i+=2)
    {
    	if (isPrime(num - i) && isPrime(i))
    	{
    		seq++;
    	}
    }
    
    return seq;
}

  public static boolean isPrime (int num)
  {
    for (int i = 2; i <= num - 1; i++)
    {
      if (num%i == 0) 
      {
        return false;
      }
    }
    return true;
  }

}

*/