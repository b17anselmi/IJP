/*Exercise 5.14
 *revision of listing 5.9
 * given two integers, display the greatest common denominator 
 */
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two intergers:");
		int [] n = new int[2];//store both numbers in an array
		n[0] = sc.nextInt();
		n[1] = sc.nextInt(); 
		sc.close();
		 if (n[1] < n[0]) {
			   int temp = n[1];
			   n[1] = n[0];
			   n[0] = temp;
			  }
			 //starting at the highest number
			  for (int d = n[0]; true; d--) {
			 //start looking for divisors of each number until one is found
			   if (n[0] % d == 0 && n[1] % d == 0) {
			    System.out.println("GCD = " + d);//print result
			    break;
			   }

	}

	}
}
