/*calculate cost of shipping when given a package weight
 * (0,2] = 2.5
 * (2,4] = 4.5
 * (4,10] = 7.5
 * (10,20] = 10.5
 */
import java.util.Scanner;

public class shipping_cost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of your package: ");
		double weight = input.nextDouble();
		double shipping;
		if (weight <=2) {
			shipping = 2.5;
			
		}
		else if (weight <=4) {
			shipping = 4.5;
			System.out.println("Shipping costs: "+ shipping);
		}
		else if (weight <=10) {
			shipping = 7.5;
			System.out.println("Shipping costs: "+ shipping);
		}
		else if (weight <=20) {
			shipping = 10.5;
			System.out.println("Shipping costs: "+ shipping);
		}
		else if (weight>20) {
			System.out.println("Package is too heavy to be shipped.");
		}

	}

}
