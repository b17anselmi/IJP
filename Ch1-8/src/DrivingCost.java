/*compute cost of driving a certain distance given distance, mpg of car, and price per gallon
 * sample run:
 * d = 900.5
 * mpg = 25.5
 * price = 3.55
 */
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance you want to drive: ");
		double d, mpg, price, trip_gal, cost;
		d = input.nextDouble();
		System.out.print("Enter your car's mpg: ");
		mpg = input.nextDouble();
		System.out.println("Enter price of gas per gallon: ");
		price = input.nextDouble();
		//calculate how many gallons user needs for the trip total
		trip_gal = d/mpg;
		//now for cost
		cost = trip_gal*price;
		System.out.println("For a trip of " + d + " miles, you will need " + trip_gal + " gallons of gas. When gas costs " + price + " per gallon, your trip will cost $" + cost);
		

	}

}
