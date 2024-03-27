import java.util.*;

public class ArithmeticDebuggingTask4 {

	/** This method takes one half of a DNA double helix and
	//finds the complementary strand
	 * @param - String s – DNA strand
	 * @return – String - complement
	 */
	public static String findComplement (String s) {
		String newWord = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				newWord += 'T';
			} else if (s.charAt(i) == 'T') {
				newWord += 'A';
			} else if (s.charAt(i) == 'G') {
				newWord += 'C';
			} else if (s.charAt(i) == 'C'){
				newWord += 'G';
			}
		}
		
		return newWord;
	}
	
	/** This method takes one half of a DNA double helix,
	// finds the complement and returns the RNA equivalent
	 * @param – String s – DNA strand
	 * @return – String - RNA strand
	 */
	public static String findRNAStrand (String s) {
		String word = findComplement (s);
		String newWord = "";
		for (int i = 0; i < s.length(); i++) {
			if (word.charAt(i) == 'T'){
				newWord += 'U';
			} else {
				newWord += word.charAt(i);
			}
		}
		
		return newWord;
	}
	
	/** This converts a valid codon into the appropriate amino acid
	 * @param - String s – the codon
	 * @return - String – the amino acid
	 */
	public static String findAminoAcid(String s) {
		
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
		
		int index = AA_CODE.length;
		
		while (index --> 0) {
			if (s.equals(AA_CODE[index])) {
				return AA_CODE_VALUE[index];
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		
		for (int i = 0; i < s.length() / 3; i++) {
	        System.out.println(s.substring(0 + (i*3), 3 + (i*3)));
		}
	}

}
