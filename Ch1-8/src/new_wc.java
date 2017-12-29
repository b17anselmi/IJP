// work with 2.17 wind chill program to tell user if input is invalid
import java.util.Scanner;
public class new_wc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter outside temp in Fahrenheit: ");
		double temp = input.nextDouble();
		System.out.print("Enter wind speed in mph: ");
		double ws = input.nextDouble();
		if (ws>=2 && (temp>=-58 && temp<=41)) {
		double wct = 35.74 + 0.6215*temp -35.75*Math.pow(ws, 0.16)+ 0.4275*temp*Math.pow(ws, 0.16);
		System.out.println("The wind chill temperature is : " + wct);
		}
		else {
			System.out.print("Invalid input.");
		}
		


	}

}
