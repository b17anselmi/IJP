/*Suppose you save $100 each month into a savings account with the annual interest rate 5%. 
 * Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
         100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
         (100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
         (100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month. 
(In Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)
 * test run: enter 100, answer should be $608.81
 */
import java.util.Scanner;

public class comp_value {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//ask user how much they are going to save for the month
		System.out.println("Enter monthly savings amount: ");
		double save = input.nextDouble();
		//just for simplicity's sake I'm going to do this loop wise
		System.out.println("How many months would you like to save for?");
		int time, i;
		time = input.nextInt();
		System.out.println("Enter annual interest rate:");
		//we need to turn whatever the user inputs into both a decimal and also divide it by how many times it will compound in a year
		double interest=(1 + ((input.nextDouble())*0.001)/12.0);
		double total = save*Math.pow(interest, time*12);

		
		//display results
		System.out.println("After " + time + " months you will have $"+ total + ".");
	}

}
//couldn't figure it out, try again after other chapter exercises complete
