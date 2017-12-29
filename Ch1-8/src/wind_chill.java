/*calculate the wind chill
 * wc= 35.74 + 0.6215(outside temp F) -35.75(wind speed mph)**0.16+ 0.4275(outside temp)(wind speed mph)**0.16
 */
import java.util.Scanner;

public class wind_chill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter outside temp in Fahrenheit: ");
		double temp = input.nextDouble();
		System.out.print("Enter wind speed in mph: ");
		double ws = input.nextDouble();
		double wct = 35.74 + 0.6215*temp -35.75*Math.pow(ws, 0.16)+ 0.4275*temp*Math.pow(ws, 0.16);
		System.out.println("The wind chill temperature is : " + wct);
	}

}
