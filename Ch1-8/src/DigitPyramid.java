/*given a number of lines between 1 and 15, display a pyramid of digits with the below format

 * input = 7
 * 7 6 5 4 3 2 1 2 3 4 5 6 7 
 * 6 5 4 3 2 1 2 3 4 5 6
 * 5 4 3 2 1 2 3 4 5
 * etc
 * current output is wrong format, try again later
 */
import java.util.Scanner;
public class DigitPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of lines (1-15):");
		int lines = s.nextInt();
		s.close();
		if (lines <1 || lines>15) {
			System.out.println("Please enter a number between 1 and 15, you entered " + lines);
		}
		else {
			for (int i = 1; i <= lines; i++) {
				   // printing spaces, 2 at a time from j=1 to j= lines-i 
				   for (int j = 1; j <= (lines - i); j++) {
				    System.out.print("  ");
				   }
				    
				   //Printing number decreamentally from the line number j to 1
				   for (int j = i; j >= 1; j--) {
				    System.out.print(j + " ");
				   }
				    
				   //Printing number increamentally from 2 to line number j
				   for (int j = 2; j <= i; j++) {
				    System.out.print(j + " ");
				   }
				   System.out.println();
				 
				  }
		}

	}

}
