import java.util.Scanner;
public class perimeter_triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lengths of the sides of a triangle: ");
		//more fun to use arrays for this
		double[] sides = new double[3];
		double sum = 0;
		//get the sum of the sides using a for loop because it's a little cleaner
		for (int i = 0; i<3; i++) {
			sides[i]=input.nextDouble();
			sum +=sides[i];
			
			}
		if (sides[0]+sides[1]>sides[2] && sides[0]+sides[2]>sides[1] && sides[1]+sides[2]>sides[0]) {
			System.out.println("The perimeter is: " + sum);}
		else {
				System.out.println("Invalid input.");
			}
			
		}
		//if (sides) {}
		
//System.out.print(sum);
	}


