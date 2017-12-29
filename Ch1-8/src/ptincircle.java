/*test to see if an inputed point is in a circle
 * radius = 10
 * centered around (1, 1) 
 * point is in a circle if distance is <= radius from center of the circle 
 */
import java.util.Scanner;		
public class ptincircle {

	public static void main(String[] args) {
		double x1,x2, y1, y2, temp, r, d;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x and y coordinates of the point: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x1 = 1.0;
		y1 = 1.0;
		r = 10;
		temp = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		d = Math.pow(temp, 0.5);
		
		if (d<=r) {
			System.out.println("The point (" + x2 + "," + y2 + ") is inside the circle.");
		}
		else {
			System.out.println("The point (" + x2 + "," + y2 + ") is not inside the circle.");
		}
		
		
	}

}
