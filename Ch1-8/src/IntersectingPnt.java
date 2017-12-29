/*given two points on each of two lines, display intersecting point using Cramer's rule:
*	ax + by = e
*	cx + dy = f
*to solve linear equations given by:
*(y1-y2)x - (x1-x2)y = (y1-y2)*x1 - (x1-x2)*y1
*(y3-y4)x -(x3 - x4)y = (y3-y4)*x3 - (x3-x4)*y3
 */
import java.util.Scanner;

public class IntersectingPnt {

	public static void main(String[] args) {
		double x1,x2,x3, x4, y1, y2,y3,y4, a, b, c, d, e, f, x, y;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		x1 = input.nextDouble();
		y1= input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 =input.nextDouble();
		x4 = input.nextDouble();
		y4= input.nextDouble();
		a =(y1-y2);
		b =-(x1-x2);
		c= y3-y4;
		d= -(x3 - x4);
		e= (y1-y2)*x1 - (x1-x2)*y1;
		f = (y3-y4)*x3 - (x3-x4)*y3;
		if (a * d - b * c == 0) {
			System.out.println("The lines are parallel.");
		}
		else {
		
		x =(e*d-b*f)/(a*d-b*c);
		y=(a*f-e*c)/(a*d-b*c);
		
		System.out.println("The intersection point is (" + x + "," + y + ")" );
		
		/* solution code as well, b and d need to be negative
	double a = y1 - y2;
  double b = -(x1 - x2);
  double e = (y1 - y2) * x1 - (x1 - x2) * y1;
  double c = (y3 - y4);
  double d = -(x3 - x4);
  double f = (y3 - y4) * x3 - (x3 - x4) * y3;
 
  if (a * d - b * c == 0) {
   System.out.println("The two lines are parallel.");
   System.exit(0);
  }
 
  double x = (e * d - b * f) / (a * d - b * c);
  double y = (a * f - e * c) / (a * d - b * c);
 
  System.out.print("The intersecting point is at (" + x + ", " + y + ")");
		 * 
		 */
		}
	}

}

