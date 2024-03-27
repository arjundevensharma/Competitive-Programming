import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter weight, in pounds: ");
		double weightInPounds = in.nextDouble();

		System.out.print("Please enter height, in inches: ");
		double heightInInches = in.nextDouble();
		
		double heightInMetres = heightInInches * 0.0254;
		double weightInKilograms = weightInPounds * 0.454;
		double BMI = weightInKilograms / (heightInMetres * heightInMetres);
		
		System.out.print("BMI is: " + BMI);
	}

}
