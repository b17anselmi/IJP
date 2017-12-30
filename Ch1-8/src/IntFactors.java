//given an integer, display smallest factors in increasing order
import java.util.Scanner;
public class IntFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = s.nextInt();
		s.close();
		int f=2;//all integers are divisible by 1, and initiating at 0 would break things (domain errors)
		do {
			if (num%f==0) {//if our factor goes perfectly into the number
				System.out.println(f+", ");//print it
				num/=f;//and update the number
			}
			else {f++;}//otherwise, test the next integer
		}while (num/f != 1);
		System.out.println(num);//print the final largest factor, the final prime
	}
//test: 120 should display 2, 2, 2, 3, 5
}
