/*calculate future investment value 
 * futureIV = IA*(1+ monthlyINterestRate)^numyears*12
 */
import java.util.Scanner;

public class FutureInvestmentRate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double IA, IR, years, exp, d, FIV;
		System.out.println("Enter investment amount:");
		IA = input.nextDouble();
		System.out.println("Enter annual interest rate:");
		IR = input.nextDouble()/12;
		System.out.println("Enter number of years:");
		years = input.nextDouble();
		exp = years*12;
		d = 1+(IR/120);
		FIV = IA*Math.pow(d, exp);
		System.out.println("Accumulated value is $" + FIV);
				
	}

}
//not quite correct, looks the same as code below, but go back and check after other exercises

/*import java.util.Scanner;

public class Exercise_02_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the investment amount,
		// annual interest rate and number of years.
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble();
		monthlyInterestRate /= 1200;
		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		// Calculate future investment value
		double futureInvestmentValue = 
			amount * Math.pow(1 + monthlyInterestRate, years * 12);
		
		// Display result
		System.out.println("Accumulated value is $" + futureInvestmentValue);
	}
}
 */
