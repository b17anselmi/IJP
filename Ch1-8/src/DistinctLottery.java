//Exercise 5.32, revised listing 3.8 to make sure two lottery numbers between 1-49 are different
import java.util.Scanner;
import java.util.Random;
public class DistinctLottery {

	public static void main(String[] args) {
		Random r = new Random();
		int  lottery = r.nextInt(49) + 1;//generate lottery number between 1 and 49
		while(lottery%11==0) {//generate a new lottery number if the two digits aren't distinct (i.e. 22, 33, 44)
			lottery = r.nextInt(49) + 1;
		}
		System.out.println("Enter your guess (2 digits)");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		input.close();
		 int lot1, lot2, guess1, guess2;
		 lot1 = lottery/10;
		 lot2= (lottery%10);
		 guess1 = guess/10;
		 guess2 = guess%10; 
		 
		 System.out.println("The lottery number is " + lottery);
		 
		 //now let's check what the user guessed
		 if (guess == lottery) {
			 System.out.println("Exact match: you win $12,000!");
		 }
		 else if ((guess1 ==lot1 || guess1==lot2)&& (guess2==lot1 ||guess2==lot2)) {
			 System.out.println("Match all digits: you win $5,000!");
		 }
		 else {
			 System.out.println("Sorry, no match.");
		 }
		

	}

}
