/*revised listing 3.8, generate a lottery of 3 digit numbers
 * 12000 prize if user input matches
 * 5000 prize if all digits are in the lottery number
 * 2000 prize if one digit of user input matches lottery number
 */
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		//generate lottery number
		int lottery = (int)(Math.random()*1000);
		//ask user to guess number
		System.out.println("Enter your guess (3 digits)");
		Scanner input = new Scanner(System.in);
		 int guess = input.nextInt();
		 
		 //get digits from both lottery and guess
		 int lot1, lot2, lot3, guess1, guess2, guess3;
		 lot1 = lottery/100;
		 lot2 = (lottery%100)/10;
		 lot3= (lottery%10);
		 guess1 = guess/100;
		 guess2 = (guess%100)/10;
		 guess3 = guess%10;
		 
		 System.out.println("The lottery number is " + lottery);
		 
		 //now let's check what the user guessed
		 if (guess == lottery) {
			 System.out.println("Exact match: you win $12,000!");
		 }
		 else if ((guess1 ==lot1 || guess1==lot2 ||guess1==lot3)&& (guess2==lot1 ||guess2==lot2 || guess3 ==lot3)&&(guess3==lot1||guess3==lot2|| guess3==lot3)) {
			 System.out.println("Match all digits: you win $5,000!");
		 }
		 else if ((guess1 ==lot1 || guess1==lot2 ||guess1==lot3)|| (guess2==lot1 ||guess2==lot2 || guess3 ==lot3)||(guess3==lot1||guess3==lot2|| guess3==lot3)) { 
			 System.out.println("Matched 1 digit: You win $2,000!");
		 }
		 else {
			 System.out.println("Sorry, no match.");
		 }

	}

}
