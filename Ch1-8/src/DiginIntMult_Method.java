// Exercise 6.2, multiply the digits in an integer, i.e, 234 should return 24 because 2*3*4 = 24 and 1998 should return 1*9*9*8 = 648
import java.util.Scanner;
public class DiginIntMult_Method {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		long num = s.nextLong();
		s.close();
		System.out.println("The digits of " +num+" multiplied together is " + mulDigits(num));
	}
		public static int mulDigits(long n){
			int temp = (int)Math.abs(n);//take care of potential negatives
	        int mul = 1;
	        
	        while(temp != 0){
	            mul *= (temp % 10);
	            temp = temp / 10;
		}
	        return mul;
		}
	

}
