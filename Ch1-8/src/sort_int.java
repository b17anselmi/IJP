//sort 3 integers in descending order
import java.util.Scanner;

public class sort_int {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//probably wanted this done through loops, but an array is easier
		int[] tosort = new int[3];
		System.out.print("Enter 3 Integers");
		tosort[0]= input.nextInt();
		tosort[1]= input.nextInt();
		tosort[2]=input.nextInt();
		
		java.util.Arrays.sort(tosort);
		System.out.println(tosort.toString());
		
	}

}
