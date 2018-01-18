//Exercise 7.5, given 10 integers, count the number of evens and odds, program ends on 0
import java.util.Scanner;
public class EvensOdds {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		
		int[] inputs = new int[10];
		int n=1, c=0;
		do {
			n = s.nextInt();	
			inputs[c]=n;
			c++;
		}while (c<=9);
		s.close();
		EvenOdds(inputs);
	}
	public static void EvenOdds(int[] l) {
		int i=0, evens=0, odds=0;
		do {
			if(l[i]%2==0) {
				evens++;}
			else {
				odds++;}
			i++;
		}while(i<=l.length);
		System.out.printf("%s%d%s%d%s", "There are ", evens, " even numbers and ", odds, " odd numbers.");
	}

}//out of bounds exception ln 10, not sure why 
