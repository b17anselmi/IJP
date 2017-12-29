//solving linear 2x2 equations but this time with the user prompted to enter a,b,c,d,e, and f

import java.util.Scanner;

public class lin_eq2 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, and f");
		double a, b, c, d, e, f, test, x, y;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		test = a*b - b*c;
		if (test == 0) {
			System.out.println("The equation has no solution.");
		}
		else {
			x =(e*d-b*f)/(a*d-b*c);
			y=(a*f-e*c)/(a*d-b*c);
			System.out.println("x = " + x + " y = " + y);
		}
//when using no solution values, system prints Infinity and - Infinity, which is not what it's supposed to do

	}

}

/*
Using Cramer's rule:
ax + by = e
cx + dy = f

x=(e*d-b*f)/(a*d-b*c)
y=(a*f-e*c)/(a*d-b*c)
*/