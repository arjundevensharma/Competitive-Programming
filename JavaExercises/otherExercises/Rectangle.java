import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		System.out.print("Enter length: ");
		double length = in.nextDouble();
		
		System.out.print("Enter width: ");
		int width = in.nextInt();
		
		double rectangleArea = length * width;
		
		double rectanglePerimeter = length * 2 + width * 2;
		
		System.out.println("Area is: " + rectangleArea);
		
		System.out.println("Perimeter is" + rectanglePerimeter);
	}

}