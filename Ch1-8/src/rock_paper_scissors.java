//make a program that plays rock paper scissors with the user

import java.util.Scanner;
public class rock_paper_scissors {

	public static void main(String[] args) {
		int number = (int)(Math.random()*3);
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper(2)");
		int guess = input.nextInt();
		 if (number == 0 && guess == 0)
	            System.out.println("The computer is Scissors. You are Scissors too. It is a draw.");
	        if (number == 0 && guess == 1)
	            System.out.println("The computer is Scissors. You are Rock. You won.");
	        if (number == 0 && guess == 2)
	            System.out.println("The computer is Scissors. You are Paper. You lose.");
	        if (number == 1 && guess == 0)
	            System.out.println("The computer is Rock. You are Scissors. You lose.");
	        if (number == 1 && guess == 1)
	            System.out.println("The computer is Rock. You are Rock too. It is a draw.");
	        if (number == 1 && guess == 2)
	            System.out.println("The computer is Rock. You are Paper. You won.");
	        if (number == 2 && guess == 0)
	            System.out.println("The computer is Paper. You are Scissors. You won.");
	        if (number == 2 && guess == 1)
	            System.out.println("The computer is Paper. You are Rock. You lose.");
	        if (number == 2 && guess == 2)
	            System.out.println("The computer is Paper. You are Paper too. It is a draw.");
		

	}

}
