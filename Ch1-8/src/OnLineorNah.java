//taking PntPosition.java and revised to show if on line segment or not

import java.util.Scanner;

public class OnLineorNah {

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
		
		//we have to check if it's in the range of the line, and then see if it's on the line
		if (((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1)) && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1))) {
			test = (x1-x0)*(y2-y0) - (x2-x0)*(y1-y0);
			if (test==0) {
			System.out.println("("+x2 + ","+ y2 +") is on the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ").");}
		}
		else {
			System.out.println("("+x2 + ","+ y2 +") is not on the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ").");
		}


	}

}
