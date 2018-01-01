/*Exercise 5.19, display a pyramid
 * 			1
 * 		1	3	1
 * 1		3	9	3	1
 * and so on until 2187 is bottom middle digit
 */

public class powersof3pyramid {

	public static void main(String[] args) {
		  //8 leveles of the pyramid
		  int n = 8;
		 
		  for (int i = 1; i <= n; i++) {
		   // printing spaces
		   for (int j = 1; j <= (n - i); j++) {
		    System.out.print("    ");
		   }
		 
		   // Printing number incrementally from 0 to i-1
		   for (int j = 0; j < i; j++) {
		    System.out.printf("%4d", (int) Math.pow(3, j));
		   }
		 
		   // Printing number decreamentally from i-2 to 0
		   for (int j = i - 2; j >= 0; j--) {
		    System.out.printf("%4d", (int) Math.pow(3, j));
		   }
		   System.out.println(); //got to next line

	}

}
}
