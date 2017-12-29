/*display roots for a quadratic equation when user inputs a, b, and c.
 * works like a charm
 */
import java.util.Scanner;

public class quad_eq {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("For an equation with the form ax^2 + bx + c = 0, enter a, b, and c");
		double a, b, c, disc, root, root1, root2;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		disc = Math.pow(b, 2) - 4*a*c;
		if (disc==0) {
			root = -b/2*a;
			System.out.println("The equation has one root: " + root);
		}
		else if (disc > 0) {
			root1 = (-b + Math.pow(disc, 0.5))/2*a;
			root2 = (-b - Math.pow(disc, 0.5))/2*a;
			System.out.println("The equation has two roots, " + root1 + " and " + root2);
		}
		else {
			System.out.println("The equation has no real roots.");
		}

	}

}
