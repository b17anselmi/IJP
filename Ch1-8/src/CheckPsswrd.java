/*Exercise 6.18, have user input password and check if it's valid given parameters below
 *  at least 10 characters
 *  only letters and digits
 *  contains at least 3 digits
 */
import java.util.Scanner;
public class CheckPsswrd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter password: ");
		String psswrd=s.nextLine();
		s.close();
		
		System.out.println((isValidPsswrd(psswrd) ? "Valid " : "Invalid ") + "Password");//display valid or invalid

	}
	public static boolean isValidPsswrd(String psswrd) {
		//boolean[] temp = new boolean[psswrd.length()];
		char [] password = psswrd.toCharArray();//store all password values in an array
		boolean test= false, digits =false;//initialize two bool variables
		int d = 0;//d will keep track of how many digits are in the password
		for(int i=0; i<+password.length; i++) {
			
			if ((password[i]>=48 && password[i]<=57)||(password[i]>=65 && password[i]<=90)||(password[i]>=97 && password[i]<=122)) {
				test = true;	//if the value of the array item is a number or letter, then the password passes that parameter
			}
			
			if (password[i]>=48 && password[i]<=57) {
				d++;//keep track of the number of digits in the password
			}
		}
		boolean valid = psswrd.length()>=10 && test == true && d>=3;//if password has 10+ characters, only contains digits and letters, and has 3+ digits, it's valid
		return valid;
	}
}
