/*test if a point is inside a rectangle centered at (1,1) with a width= 10, height = 5
 * if horizontal distance to center <= width/2 && vertical distance <= height/2
 */
import java.util.Scanner;		

public class ptinrctngl {

	public static void main(String[] args) {
		double x1,x2, y1, y2, width, height, ver_d, hor_d;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x and y coordinates of the point: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x1 = 1.0;
		y1 = 1.0;
		width = 10;
		height = 5;
		ver_d = y2 - y1;
		hor_d= x2-x1;
		
		if (ver_d<=(height/2) && hor_d <= (width/2)) {
			System.out.println("The point (" + x2 + "," + y2 + ") is inside the rectangle.");
		}
		else {
			System.out.println("The point (" + x2 + "," + y2 + ") is not inside the rectangle.");
		}

	}

}
