import java.util.*;
public class SelectionChallenge1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the amount of the bill (in dollars): ");
		int billTotal = in.nextInt();

		System.out.print("Were you satisfied with the service? (yes=1, no=2): ");
		int serviceSatisfaction = in.nextInt();
		
		int recommendedTipValue = 0;
		
		if (serviceSatisfaction == 1) {
			recommendedTipValue = (int) (billTotal * 0.15); 
		} else if (serviceSatisfaction == 2) {
			recommendedTipValue = (int) (billTotal * 0.1); 
		}
		
		System.out.print("You should tip $" + recommendedTipValue + ".");
	}

}
