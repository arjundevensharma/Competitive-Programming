import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int s = in.nextInt();
		int nDistance = 0;
		int bDistance = 0;
		boolean nA = true;
		boolean bC = true;
		int nAd = 0;
		int nBd = 0;
		int bCd = 0;
		int bDd = 0;
		
		for (int i = 0; i < s; i++) {
			if (nA) {
				nDistance ++;
				nAd ++;
				if (nAd == a) {
					nAd = 0;
					nA = false;
				}
			} else {
				nDistance --;
				nBd ++;
				if (nBd == b) {
					nBd = 0;
					nA = true;
				}
			}
			
			if (bC) {
				bDistance ++;
				bCd ++;
				if (bCd == c) {
					bCd = 0;
					bC = false;
				}
			} else {
				bDistance --;
				bDd ++;
				if (bDd == d) {
					bDd = 0;
					bC = true;
				}
			}
		}
		
		if (nDistance > bDistance) {
			System.out.print("Nikky");
		} else if (nDistance == bDistance) {
			System.out.print("Tied");
		} else {
			System.out.print("Byron");
		}
	}
}