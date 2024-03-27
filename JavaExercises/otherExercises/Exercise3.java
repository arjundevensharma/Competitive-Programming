import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter temperature, in Fahrenheit: ");
		
		double temperatureInFahrenheit = in.nextDouble();
		double temperatureInCelcius = (5.0/9.0)*(temperatureInFahrenheit - 32);
		
		System.out.print("Temperature in Celcius is: " + temperatureInCelcius + " degrees.");
	}
}