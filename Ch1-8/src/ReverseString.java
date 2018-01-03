//Exercise 5.46 reverse a string
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = s.nextLine();//get and store input
		s.close();
		String reverse = new StringBuffer(string).reverse().toString();//new string of reversed characters
		System.out.println("Reversed string: "+reverse);//results
		

	}

}
