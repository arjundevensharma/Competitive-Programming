package stringExercises;
import java.util.*;

public class examPrep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jk = 0;
		
		do {
			jk = 1;
		} while (jk == 1);
		String w = in.next();
		String l = in.next();
		
		System.out.print(w.substring(0,w.indexOf('e')) + l.substring(l.lastIndexOf('e') + 1));
		int width = 17;
		int height = 36;
		double area = 5;
		
		System.out.println( (width>area) && (area!= 10));
		System.out.println( (height!=36) || (area>4));
		System.out.println(!(height!=25));
		System.out.println((height*width<area));
		System.out.println( !(width == 17) || (width == 40));
		System.out.println( ((width>17) && (height< 40) ) || (area>=5.5));
		
		int count = 0;
		
		for (int i = 0; i < 20; i++) {
			count ++;
		}
		System.out.println(count);
		
		for (int i = 20; i >= 6; i-=5) {
			count ++;
		}
		System.out.println(count);
		
		int j = 10;
		
		do {
		j-= 2;
		count++;
		} while (j > 0);
		
		System.out.println(count);
		
		String a = "Happy";
		String b = "Gilmore";
		int yes = a.length() + b.length();
		System.out.println(yes);
		System.out.println(!(a.equals(b)));
		System.out.println(b.substring(2,6));
		System.out.println(a.substring(3));
		System.out.println(a.indexOf("a") + (b.indexOf("m")));
		System.out.println(a.substring(0,a.length() - 2) + b.charAt(1) + "i" + a.charAt(b.length() - 3));
		
		sci();

		int i = 29;
		int aa = 64;
		
		System.out.println ( i + aa  + a) ;
		
		doStuff (157);
		
	}
	
	public static void sci() {
		double m = 1234;
		int p = 0;
		while (m >= 10) {
			m = m/10;
			p++;
		}
		System.out.println(m + " e " + p);
	}
	
	public static void doStuff (int i) {
		int d = 128;
		int[] A = new int[8];
		for (int c=0; c < A.length; c++) {
			A[7-c] = i/d;
			if (A[7-c] == 1)
				i =i-d;
			d = d/2;
		}
	}


}
