//Exercise 6.3, test if input integers are palindromes
import java.util.Scanner;
public class PalidromeInt {

	public static void main(String[] args) {
		System.out.println("Enter an ingeger: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		if (isPalindrome(num)) {
		System.out.println(num + " is a palindrome.");
		}
		else {
		System.out.println(num + " is not a palindrome.");
		}
	}
	public static int reverse(int number) {
		int rev = 0, digit;
		do {
			digit = number%10;//extract digit in ones place
			rev = rev*10+ digit;//move previously extracted digits up to next 10s place, and add new digit to ones place
			number/=10;//revise input number to exclude ones place digit we extracted
		}while(number !=0);//stop once all digits have been extracted from input number
	
		return rev;
	}
	public static boolean isPalindrome(int number) {
		return number == reverse(number);//return true if the numbers are the same
	}

}
