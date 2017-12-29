/*compute the finite arithmatic progresion sum given n, difference(d), and the first term
 * revised from 2.12
 * an = a1 +(n-1)*d
 * goal: display Sn
 * Sn = n(a1+an)/2
 */
import java.util.Scanner;

public class FiniteSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//first we need to know what an is
		double an, n, d, a1, Sn;
		System.out.println("Enter the sum upper limit: ");
		n = input.nextDouble();
		System.out.println("Enter first term in series: ");
		a1 = input.nextDouble();
		System.out.println("Enter difference between terms: ");
		d = input.nextDouble();
		//now that we have what we need for an, we can compute it
		an= a1 + (n-1)*d;
		System.out.println("an = " + an);
		Sn = n*(a1+an)/2;
		System.out.println("Sn = " + Sn);

	}

}
