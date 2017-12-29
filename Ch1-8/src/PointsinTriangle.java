//determine if a given point is inside a right triangle with the 90 degree angle at 0,0
import java.util.Scanner;

public class PointsinTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x and y coordinates of the point: ");
		double x,y, height, width;
		x = input.nextDouble();
		y = input.nextDouble();
		height = 100;
		width = 200;
		//get the points of the line through 0,0 and x,y that intersect with the hypotenuse
		double intersectx = (-x * (width * height)) / (-y * width - x * height);
		double intersecty = (-y * (width * height)) / (-y * width - x * height);
		//if either the x or y points of our coordinates are more than the intersect points, then the point is outside the triangle
		if (x>intersectx || y > intersecty) {
			System.out.println("The point is not in the triangle.");
		}
		else {
			System.out.println("The point (" + x + "," + y + ") is inside the triangle.");
		}

	}

}
