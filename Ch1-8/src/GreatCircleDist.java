/*given two points of latitude and longitude, compute the distance between two points on the surface of a sphere
 * d = radius*arccos(sin(x1) *sin(x2)+ cos(x1)*cos(x2)*cos(y1-y2))
 */
import java.util.Scanner;

public class GreatCircleDist {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and Longitude) in degrees: ");
		double x1, y1, x2, y2, radius, d;
		x1 = Math.toRadians(input.nextDouble());
		y1 = Math.toRadians(input.nextDouble());
		
		System.out.println("Enter point 2 (latitude and Longitude) in degrees: ");
		x2 = Math.toRadians(input.nextDouble());
		y2= Math.toRadians(input.nextDouble());
		radius = 6371.01;
		d = radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		System.out.println("The distance between the two points is " + d);

	}

}
