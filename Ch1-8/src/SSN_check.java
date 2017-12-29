//check if an inputed SSN is valid based on DDD-DD-DDDD format
import java.util.Scanner;
public class SSN_check {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter SSN (DDD-DD-DDDD):");
     
        String SSN = input.nextLine();
        input.close(); //so that's how you close it

     // Check whether the input is valid
     		boolean isValid = //I feel like there's a cleaner way to do this
     			(SSN.length() == 11) && 
     			(Character.isDigit(SSN.charAt(0))) &&
     			(Character.isDigit(SSN.charAt(1))) &&
     			(Character.isDigit(SSN.charAt(2))) &&
     			(SSN.charAt(3) == '-') &&
     			(Character.isDigit(SSN.charAt(4))) &&
     			(Character.isDigit(SSN.charAt(5))) &&
     			(Character.isDigit(SSN.charAt(7))) &&
     			(SSN.charAt(6) == '-') &&
     			(Character.isDigit(SSN.charAt(8))) &&
     			(Character.isDigit(SSN.charAt(9))) &&
     			(Character.isDigit(SSN.charAt(10)));

     		// Display result
     		System.out.println(SSN + " is " + ((isValid) ? "a valid " : "an invalid ")+ "social security number");
   }
	}
