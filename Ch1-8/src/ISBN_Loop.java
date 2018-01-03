//Exercise 5.36, revision of exercise 3.9 using a loop to get ISBN
import java.util.Scanner;
public class ISBN_Loop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN: ");
		int isbn = input.nextInt();//get the first 9 digits
		int[] ISBN = new int[10]; //arrays make intuitive sense to me to store values
		//extract each digit
		int i =8, dev = 1, rem=10;
		do {//extract digit
			ISBN[i]=(isbn%rem)/dev;
			dev*=10;
			rem*=10;
			i--;
		}while (i>=0); //while the array index is within the bounds
		//calculate the 10th digit of the ISBN number
		int k =1;
		for(int j=0; j<=8; j++) {
			ISBN[9]+=ISBN[j]*(k);	
			k++;
		}
		ISBN[9]%=11;
		//display results
		if (ISBN[9]==10) {//when the checksum is 10, the last digit is X
			System.out.println("The ISBN-10 number is "+ ISBN[0]+ISBN[1]+ISBN[2]+ISBN[3]+ISBN[4]+ISBN[5]+ISBN[6]+ISBN[7]+ISBN[8]+"X");
		}
		else {//otherwise it's just whatever the checksum is
			System.out.println("The ISBN-10 number is "+ ISBN[0]+ISBN[1]+ISBN[2]+ISBN[3]+ISBN[4]+ISBN[5]+ISBN[6]+ISBN[7]+ISBN[8]+ISBN[9]);
		}		 
		 
	}

}
