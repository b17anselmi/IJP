//a combination of exercise 5.37 and 5.38 using .toBinaryString(int) and .toOctalString(int) for practice
import java.util.Scanner;
public class Binary_Octal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = s.nextInt();
		s.close();
		System.out.println(Integer.toBinaryString(num));//input number in binary
		System.out.println(Integer.toOctalString(num));// input number in base 8

	}

}
