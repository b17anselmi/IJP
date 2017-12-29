// given center coordinates and radii of two circles, determine whether the second circle is inside the first  or if it overlaps the first

import java.util.Scanner;

public class TwoCircles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle1's center x,y coordinates and radius: ");
		//get info for first rectangle
		double x1, y1, radius1;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		radius1 = input.nextDouble();
		
		//info for second rectangle
		System.out.println("Enter circle2's center x,y coordinates and radius: ");
		double x2, y2, radius2;
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		radius2= input.nextDouble();
		
		double d = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
		
		if (d<= Math.abs(radius1-radius2)) {
			System.out.println("circle2 is inside circle1.");
		}
		else if (d<= radius1+radius2) {
			System.out.println("The two circles overlap.");
		}
		else {
			System.out.println("The circles do not overlap.");
		}

	}

}
