/*find the area of a regular polygon (all angle and side lengths are the same) given number of sides(n) and length of sides (l)
 * area = (n*s^2)/4*tan(PI/n)
 */
import java.util.Scanner;

public class RegPolygonArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number and length of sides in the polygon.");
		double n, l, area;
		n = input.nextDouble();
		l = input.nextDouble();
		
		area = (n*(Math.pow(l, 2))/(4*Math.tan(Math.PI/n)));
		
		System.out.println(area);

	}

}
