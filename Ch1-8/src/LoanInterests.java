/* Exercise 5.21 given a loan amount and period, display monthly and total payments for each interest rate 
 * between 5%-10% in 1/4 steps (i.e. 5.0, 5.25, 5.5, etc)
 */
import java.util.Scanner;
public class LoanInterests {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Loan Amount: ");
		double loan = s.nextDouble();//get loan amount
		System.out.println("Period in years: ");
		double period = s.nextDouble();//get number of years of the loan period
		s.close();//close scanner
		double interest = 5.0; //initiate interest at 5%
		System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");//print header
		do {
			double monthlyrate, monthly, total;
			monthlyrate = interest/1200;//monthly interest rate
			monthly = loan*monthlyrate/(1 - Math.pow(1 + monthlyrate, -(period * 12)));//monthly payment
			total = monthly*period*12;//total payment
			
			System.out.println(interest+ "    "+ monthly + "    "+ total ); //formatting isn't perfect, but the math is right
			interest += 0.25;//update interest rate
		}while (interest<=10.0);//end computation once the interest rate is 10%

	}

}
