//given a letter, display Unicode
//I think this is the exact same as FindASCII.java
import java.util.Scanner;

public class FindUnicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Character");
		//disgusting
		char letter = input.next().charAt(0);
		int ascii = letter;
		
		System.out.println("The Unicode code for "+letter + " is " + ascii);

	}

}
