/*calculate interest
 * interest = balance*(annualInterestRate/1200)
 */
import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter annual interest rate and balance:");
		double ir, bal, interest;
		ir = input.nextDouble();
		bal = input.nextDouble();
		interest = bal*(ir/1200);
		System.out.println("The interest is "+ interest);

	}

}
