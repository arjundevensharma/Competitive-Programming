import java.util.*;
public class bonusChallenge1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double planBDaytimeCost;
		double planADaytimeCost;

		System.out.print("Number of daytime minutes?");
		double daytimeMin = in.nextDouble();
		
		System.out.print("Number of evening minutes?");
		double eveningMin = in.nextDouble();
		
		System.out.print("Number of weekend minutes?");
		double weekendMin = in.nextDouble();
		
		if (daytimeMin < 101) {
			planADaytimeCost = 0;
		} else {
			planADaytimeCost = ( (daytimeMin - 100) * 25);
		}
		
		if (daytimeMin < 251) {
			planBDaytimeCost = 0;
		} else {
			planBDaytimeCost = ( (daytimeMin - 250) * 45);
		}
		
		int planACostInCents = (int) ((eveningMin * 15) + (weekendMin * 20) + planADaytimeCost);
		int planBCostInCents = (int) ((eveningMin * 35) + (weekendMin * 25) + planBDaytimeCost);
		
		double planACostInDollars = planACostInCents / 100.00;
		double planBCostInDollars = planBCostInCents / 100.00;
		
		System.out.println("Plan A costs " + planACostInDollars + " dollars.");
		System.out.println("Plan B costs " + planBCostInDollars + " dollars.");
		
		if (planACostInDollars > planBCostInDollars) {
			System.out.println("Plan B is cheapest.");
		} else if (planACostInDollars == planBCostInDollars) {
			System.out.println("Plan A and B cost the same price.");
		} else {
			System.out.println("Plan A is cheapest.");
		}
	}

}