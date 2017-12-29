/*multiplying the digits of an integer between 0 and 1000 and multiplying them together
 * book test example is that the digits of 932 should multiply to 54
 */
import java.util.Scanner;

public class mult_digint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000: ");
		int integer, ans, hun, ten, sing,upten;
		//checking if scanner works
		//String name= input.next();
		integer = input.nextInt();	
		hun = integer/100;
		ten= (integer/10); //returns
		upten= ten%10;
		sing= integer%10; //returns 2
		ans =hun*upten*sing;
		//System.out.print(upten);
		System.out.println("Multiplying the digits of the integer " + integer + " together equals " + ans);
		//System.out.println("hello " + name);

	}

}
