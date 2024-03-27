import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//imagine a circle inscribed within a square.  You will ask
		//the user to enter the length of a side, then calculate 
		//the area of the square, the circle, and the leftover area

		System.out.print("Please enter the side length of the square: ");

		int side = in.nextInt();

		double radius = side * 0.5;

		int areaSq = side * side;

		double areaCi = 3.14 * radius * radius;

		System.out.println("Square: " + areaSq + "units^2\n"+ "Circle: "+areaCi+"units^2\n" + "Leftover: "+ (areaSq-areaCi) );
	}

}