//revision of 3.17 to play until either computer or player wins three times 
import java.util.Scanner;
public class RockPaperScissorsRev {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int comp=0, player=0; //initial scores
		do {
		int number = (int)(Math.random()*3);//generate random number between 0 and 2
		System.out.println("scissor (0), rock (1), paper(2)");
		int guess = input.nextInt();//get user guess
		
		 if (number == 0 && guess == 0) {
	            System.out.println("The computer is Scissors. You are Scissors too. It is a draw.");
		 }
	        if (number == 0 && guess == 1) {
	            System.out.println("The computer is Scissors. You are Rock. You won.");
	            player++;
	        }
	        if (number == 0 && guess == 2) {
	            System.out.println("The computer is Scissors. You are Paper. You lose.");
	            comp++;
	        }
	        if (number == 1 && guess == 0) {
	            System.out.println("The computer is Rock. You are Scissors. You lose.");
	            comp++;
	        }
	        if (number == 1 && guess == 1) {
	            System.out.println("The computer is Rock. You are Rock too. It is a draw.");
	        }
	        if (number == 1 && guess == 2) {
	            System.out.println("The computer is Rock. You are Paper. You won.");
	            player++;
	        }
	        if (number == 2 && guess == 0) {
	            System.out.println("The computer is Paper. You are Scissors. You won.");
	            player++;
	        }
	        if (number == 2 && guess == 1) {
	            System.out.println("The computer is Paper. You are Rock. You lose.");
	            comp++;
	        }
	        if (number == 2 && guess == 2) {
	            System.out.println("The computer is Paper. You are Paper too. It is a draw.");
	        }
	        if (comp>player&& comp==3) {
	        	System.out.println('\n'+ "The computer has won 3 times. You lose the match.");
	        }
	        if (player>comp && player ==3) {
	        	System.out.println('\n' + "You have won 3 times. You win the match.");
	        }

		}while(comp<3 && player <3);//game over once either the player of the computer wins three times
		input.close();
		}
	

}
