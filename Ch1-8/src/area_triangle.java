/*given points, find area of a triangle
 *  A = x1y2 + x2y3 + x3y1 – x1y3 – x2y1 – x3y2
 */
import java.util.Scanner;

public class area_triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 points of a triangle counterclockwise: ");
		double x1,y1,x2,y2,x3,y3, A;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3=input.nextDouble();
		y3=input.nextDouble();
		A = x1*y2 + x2*y3 + x3*y1 - x1*y3 - x2*y1 - x3*y2;
		System.out.println("The area of the triangle with the points (" + x1 +"," + y1 +") (" + x2 + "," + y2 + ") (" + x3+"," + y3 +") is " + A);

	}

}
//not correct, try again after other exercises