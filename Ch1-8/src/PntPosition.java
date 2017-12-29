/*given the endpoints of a discrete line and a third point, program will tell you if the point is on, to the left of, or to the right of the line
 * (x1-x0)*(y2-y0) - (x2-x0)*(y1-y0)
 * >0, p2 is on the left
 * =0 p2 is on the line
 * <0 p2 is on the right
 */
import java.util.Scanner;

public class PntPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x0, y0, x1, y1, x2, y2, test;
		System.out.println("Enter three points for p0, p1, and p2:");
		x0 = input.nextDouble();
		y0 = input.nextDouble();
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		test = (x1-x0)*(y2-y0) - (x2-x0)*(y1-y0);
		if (test>0) {
			System.out.println("("+x2 + ","+ y2 +") is on the left side of the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ").");
		}
		else if (test == 0) {
			System.out.println("("+x2 + ","+ y2 +") is on the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ").");
		}
		else if (test<0) {
			System.out.println("("+x2 + ","+ y2 +") is on the right side of the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ").");
		}

	}

}
