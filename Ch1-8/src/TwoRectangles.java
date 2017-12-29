/*prompt user to enter height, width, and center x,y coordinate of 2 rectangles
 * determine if one rectangle is inside the other, overlaps, or does not
 */
import java.util.Scanner;
public class TwoRectangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1's center x,y coordinates, width, and height: ");
		//get info for first rectangle
		double r1x, r1y, r1_width, r1_height;
		r1x = input.nextDouble();
		r1y = input.nextDouble();
		r1_width = input.nextDouble();
		r1_height = input.nextDouble();
		//info for second rectangle
		System.out.println("Enter r2's center x,y coordinates, width, and height: ");
		double r2x, r2y, r2_width, r2_height;
		r2x = input.nextDouble();
		r2y = input.nextDouble();
		r2_width = input.nextDouble();
		r2_height = input.nextDouble();
		
		double r1xmax = r1x + r1_width;
		  double r1ymax = r1y + r1_height;
		  double r1xmin = r1x - r1_width;
		  double r1ymin = r1y - r1_height;
		  double r2xmax = r2x + r2_width;
		  double r2ymax = r2y + r2_height;
		  double r2xmin = r2x - r2_width;
		  double r2ymin = r2y - r2_height;
		 
		  if (r1xmax == r2xmax && r1xmin == r2xmin && r1ymax == r2ymax
		    && r1ymin == r2ymin) {
		   // Check if the two are identical
		   System.out.print("r1 and r2 are indentical");
		 
		  } else if (r1xmax <= r2xmax && r1xmin >= r2xmin && r1ymax <= r2ymax
		    && r1ymin >= r2ymin) {
		   // Check if r1 is in r2
		   System.out.print("r1 is inside r2");
		  } else if (r2xmax <= r1xmax && r2xmin >= r1xmin && r2ymax <= r1ymax
		    && r2ymin >= r1ymin) {
		   // Check if r2 is in r1
		   System.out.print("r2 is inside r1");
		  } else if (r1xmax < r2xmin || r1xmin > r2xmax || r1ymax < r2ymin
		    || r2ymin > r1ymax) {
		   // Check if the two overlap
		   System.out.print("r2 does not overlaps r1");
		  } else {
		   System.out.print("r2 overlaps r1");
		  }

	}

}
