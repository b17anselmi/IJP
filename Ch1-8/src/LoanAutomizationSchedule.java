/*Exercise 5.22 Write a program given loan amount, period, and interest rate displays the atomized schedule 
 * of loan payments as well as total payment and monthly payment
 * monthly payment pays principle and interest
 * monthly interest = monthly interest rate * remaining balance
 * principal = monthly payment - monthly interest
 */
import java.util.Scanner;
public class LoanAutomizationSchedule {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//create scanner
		//get the three pieces of information needed from the user
		System.out.println("Loan amount: ");
		double amount = s.nextDouble();
		System.out.println("Period: ");
		double period = s.nextDouble();
		System.out.println("Annual Interest Rate: ");
		double yearrate=s.nextDouble();
		s.close();//close scanner
		
		
		//manipulate given info to fit into calculations
		double monthlyrate = yearrate/1200;//monthly interest rate
		double monthly = (amount*monthlyrate)/(1 - Math.pow((1 + monthlyrate), (-(period * 12))));//monthly payment
		double balance = (monthly*period*12);//total payment
		//display monthly payment amount and total payment amount
		System.out.println("Monthly Payment: " + monthly + '\n' + "Total Payment: " + balance + '\n');
		
		System.out.printf("%-1s%20s%20s%20s\n", "Payment#", "Interest","Principal", "Balance");//print header
		for (int payment = 1; (payment<=period*12); payment++) {
			double monthlyinterest = monthlyrate*balance;
			double principal = monthly-monthlyinterest;
			balance = balance - principal; 
			System.out.println(payment + "            "+ monthlyinterest +"    "+ principal + "    " + balance);
			
			}
		//interest and principal off by ≈2, balance off by 300+
	}

}
