/*Exercise 5.48 given a string, display every character in an even position
 * i.e. "Denver" should output "evr" and "Beijing Chicago" should output "ejnhcg"
 * even positions, not indexes
 */
import java.util.Scanner;
public class EvenStringChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = s.nextLine();
		s.close();
		char [] index = new char[string.length()];//create an array to store even values in
		String even = "";//initiate string for the even positions
		for(int i = 0; i<string.length(); i++) {
			if (i%2!=0) {//check if the position is even (not the index)
				index[i]=string.charAt(i);//if it is, store it in our array
			}
			even += index[i];//add array elements we made to string variable so they display on one line
		}
		System.out.println(even.replaceAll("\\s", ""));//results without any white space

	}

}
