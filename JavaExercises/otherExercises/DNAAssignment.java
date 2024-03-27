import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class DNAAssignment {
	
	/**
	 * This program, given one half of a DNA double helix, will find all possible proteins that can be constructed.
	 * @author Arjun S.
	 * @version 3/04/2023
	 */

	public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner in = new Scanner(System.in);
        
        // Displaying a welcome message and the purpose of the program to the user
        System.out.println("Welcome to Arjun's DNA-Protein converter. "
        		+ "\nThis program, given one half of a DNA double helix, will find all"
        		+ " possible proteins that can be constructed.");

        // Initializing variables for the main loop
        int playAgain = 1;
		boolean correctInput = false;

		// Starting a do-while loop to allow the user to allow for the multiple-time execution of the program
        do {
        // Prompting the user to input one-half of a DNA double helix
        System.out.println("\nTo fulfill the purpose of the program, you can now input one-half of a DNA double helix.");
        String strand = in.next();
        
        // Calling the findAllProteins method to find all possible proteins that can be constructed from the DNA strand
        String[] proteins = findAllProteins(strand);
        
        // Checking if any proteins were found
        if(proteins.length == 0) {
        	// Displaying a message if no proteins were found
        	System.out.println("\nThis DNA strand does not encode any proteins.");
        } else {
        	// Displaying the number of proteins found and the list of proteins, if valid proteins were found
        	if (proteins.length == 1) {
        		System.out.println("\nGiven the DNA double helix, there is 1 possible protein that can be constructed. "
            			+ "\n\nThe singular protein follows:");
        	} else {
        		System.out.println("\nGiven the DNA double helix, there are " + proteins.length + " possible proteins that can be constructed. "
            			+ "\n\nThe " + proteins.length + " proteins follow:");
        	}
        	
        	for (String protein: proteins) {
        	System.out.println(protein);
        	}
        }
        
        // Initializing a variable to ensure user input is correct for the following prompt
        correctInput = false;
        
        // Starting a while loop to prompt the user to execute the program again, while being able to re-prompt the user in the case of incorrect input
        while (correctInput == false) {
			System.out.print("\nWould you like to execute the program again? 1 = Yes, 2 = No: ");
			playAgain = in.nextInt();
			//if user input is correct, continue to the rest of the code, otherwise repeat the loop
			if (playAgain == 1 || playAgain == 2) {
				correctInput = true;
			}
		}
		
		}
		while (playAgain != 2);  // Repeat the loop if user wants to execute the program again

        // Displaying a farewell message to the user
		System.out.print("\nThanks for using my program! I hope you found it helpful.");
	}
	
	/** This method takes one half of a DNA double helix and
	//finds the complementary strand
	 * @param - String s – DNA strand
	 * @return – String - complement
	 */
	public static String findComplement (String s) {
		// Create a StringBuilder object to store the complement of the DNA strand
		StringBuilder newWord = new StringBuilder();
		// Iterate through each character of the DNA strand
		for (int i = 0; i < s.length(); i++) {
			// Check the current character and add the appropriate complementary nucleotide
			if (s.charAt(i) == 'A') {
				newWord.append('T');
			} else if (s.charAt(i) == 'T') {
				newWord.append('A');
			} else if (s.charAt(i) == 'G') {
				newWord.append('C');
			} else if (s.charAt(i) == 'C'){
				newWord.append('G');
			}
		}
		// Return the complement of the DNA strand as a String
		return newWord.toString();
	}
	
	/** This method takes one half of a DNA double helix,
	// finds the complement and returns the RNA equivalent
	 * @param – String s – DNA strand
	 * @return – String - RNA strand
	 */
	public static String findRNAStrand (String s) {
		// Find the complementary strand of the DNA strand by calling the findComplement method
		String complement = findComplement (s);
		// Create a StringBuilder object to store the RNA strand
		StringBuilder newWord = new StringBuilder();
		// Iterate through each character of the complementary strand
		for (int i = 0; i < complement.length(); i++) {
			// Check the current character and add the appropriate RNA nucleotide
			if (complement.charAt(i) == 'T'){
				newWord.append('U');
			} else {
				newWord.append(complement.charAt(i));
			}
		}
		// Return the RNA equivalent of the DNA strand as a String
		return newWord.toString();
	}
	
	/** This converts a valid codon into the appropriate amino acid
	 * @param - String s – the codon
	 * @return - String – the amino acid
	 */
	public static String findAminoAcid(String s) {
        // Define arrays for each possible codon and their corresponding amino acid
		String[] AA_CODE
		={"UUU","UUC","UUA","UUG","UCU","UCC","UCA","UCG","UAU","UAC","UAA","UAG","UGU","UGC",
		"UGA","UGG","CUU","CUC","CUA","CUG","CCU","CCC","CCA","CCG","CAU","CAC","CAA","CAG","CGU",
		"CGC","CGA","CGG","AUU","AUC","AUA","AUG","ACU","ACC","ACA","ACG","AAU","AAC","AAA","AAG",
		"AGU","AGC","AGA","AGG","GUU","GUC","GUA","GUG","GCU","GCC","GCA","GCG","GAU","GAC","GAA",
		"GAG","GGU","GGC","GGA","GGG"};
		String[] AA_CODE_VALUE =
		{"F","F","L","L","S","S","S","S","Y","Y","STOP","STOP","C","C","STOP","W","L","L","L","L","P",
		"P","P","P","H","H","Q","Q","R","R","R","R","I","I","I","M","T","T","T","T","N","N","K","K","S",
		"S","R","R","V","V","V","V","A","A","A","A","D","D","E","E","G","G","G","G"};
		
        // Loop through the arrays and find the amino acid for the given codon
		int index = AA_CODE.length;
		
		while (index -->= 0) {
			if (s.equals(AA_CODE[index])) {
				return AA_CODE_VALUE[index];
			}
		}
		
		return null;
	}
	
	/** This method takes an RNA strand and finds possible proteins that can be
	// constructed from the entire strand reading from the first nucleotide
	 * @param
	 * @return
	 */
	public static String findProtein(String s) {
		// Initialize a StringBuilder object to hold the protein sequence
		StringBuilder newWord = new StringBuilder();
		// Initialize a flag to indicate whether a STOP codon has been encountered yet
		boolean stopExists = false;
				
		// Process the RNA strand in groups of three nucleotides at a time (codons)
		for (int i = 0; i < s.length() - 2; i += 3) {
			// Extract the current codon sequence from the RNA strand
			String currentCodon = s.substring(i, i + 3);
			// Translate the current codon into an amino acid using the findAminoAcid method
			String aminoAcidThisCodon = findAminoAcid(currentCodon);
			
			// If the current codon translates to a STOP codon, stop processing the RNA strand 
			// and set the flag to true
			if (aminoAcidThisCodon.equals("STOP")) {
				stopExists = true;
				break;
			}
			
			// Otherwise, add the translated amino acid to the protein sequence
			newWord.append(aminoAcidThisCodon);
		}
		
		// If a STOP codon was encountered, return the protein sequence
		// Otherwise, return an error message indicating that no protein sequences have been found
		return stopExists ? newWord.toString() : "This DNA strand does not encode any proteins."; 
	}
	
	/** This method should return an array of integers which stores the 
	 * position of the first nucleotide for all the start codon sequences.
	 * @param RNA strand
	 * @return described int array
	 */
	public static int[] getStartCodonPositions(String s) {
		// create a new ArrayList to store the position of the start codons
		List<Integer> positions = new ArrayList<>();
	    
		// iterate over the RNA strand in increments of 3 nucleotides (codons)
		for (int i = 0; i < s.length() - 2; i ++) {
			// extract the codon starting from i position in the RNA strand
	        String codon = s.substring(i, i + 3);
	        // if the codon is AUG (the start codon), add the position to the list of positions
	        if (codon.equals("AUG")) {
	        	positions.add(i);
	        }
	    }
		
		// convert the ArrayList to an array of integers and return it
		return positions.stream().mapToInt(Integer::intValue).toArray();
	}
	
	/** This method takes one half of a DNA double helix and find all
	// possible proteins that can be constructed using any of the
	// three valid reading frames and containing a start codon.
	// It should return an array of Strings which holds all valid
	// proteins.
	 * @param Half of a DNA double helix
	 * @return All possible proteins that can be constructed using any of the
	// three valid reading frames and containing a start codon.
	 */
	public static String[] findAllProteins(String s) {
		//convert given one-half of a DNA double helix strand to the corresponding RNA strand
		s = findRNAStrand(s);

	    // Find the positions of all start codons in the RNA strand
		int[] pos = getStartCodonPositions(s);
		
		//create new array with the same length as the amount of start codons in the RNA strand to store protein sequences
		String[] proteins = new String [pos.length];
		
		int count = 0;
		
		//add valid protein sequences to previously defined array
		for (int i = 0; i < pos.length; i++) {
			String t = s.substring(pos[i]);
			if (!(findProtein(t).equals("This DNA strand does not encode any proteins."))) {
				proteins[count] = findProtein(t);
				count++;
				}
		}
		
		//returning array with valid proteins
		return Arrays.copyOf(proteins, count);
	}

}
