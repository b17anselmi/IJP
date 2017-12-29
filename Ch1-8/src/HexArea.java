/*given side length of a hexagon, compute area
 * area = ((6*l**2)/(4*arctan(PI/6)
 */
import java.util.Scanner;
public class HexArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter hexagon side length: ");
		double l = input.nextDouble();
		
		double area = ((6*Math.pow(l, 2))/(4*Math.atan(Math.toRadians(30))));
		System.out.println("Area = " + area);

	}

}
