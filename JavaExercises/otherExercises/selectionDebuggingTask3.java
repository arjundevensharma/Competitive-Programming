import java.util.*;

public class selectionDebuggingTask3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of daytime minutes?");
		int day = in.nextInt();
		
		System.out.print("Number of evening minutes?");
		int eve = in.nextInt();
		
		System.out.print("Number of weekend minutes?");
		int wnd = in.nextInt();
		
		double totA = 0;
		double totB = 0;
		
		if(day>100){
		totA = (day - 100) * 0.25;
		}
		else if(day > 250){
		totB = (day - 250) * .45;
		totA = (day - 100) * 0.25;
		}
		
		totA = totA + (eve*0.15) + (wnd*0.20);
		totB = totB + (eve*0.35) + (wnd*0.25);
		
		System.out.println("Plan A Cost: $"+totA + ".");
		System.out.println("Plan B Cost: $"+totB + ".");
		
		if(totA > totB){
		System.out.println("Plan B is cheaper.");
		}
		else if (totA < totB) {
		System.out.println("Plan A is cheaper.");
		} else {
		System.out.println("Plan A is the same cost as Plan B.");	
		}
	}

}
