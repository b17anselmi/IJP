import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN: ");
		int[] ISBN = new int[10];
		ISBN[0]= input.nextInt();
		ISBN[1]= input.nextInt();
		ISBN[2]= input.nextInt();
		ISBN[3]= input.nextInt();
		ISBN[4]= input.nextInt();
		ISBN[5]= input.nextInt();
		ISBN[6]= input.nextInt();
		ISBN[7]= input.nextInt();
		ISBN[8]= input.nextInt();
		ISBN[9]= (ISBN[0]*1+ISBN[1]*2+ISBN[2]*3+ISBN[3]*4+ISBN[4]*5+ISBN[5]*6+ISBN[6]*7+ISBN[7]*8+ISBN[8]*9)%11;
		if (ISBN[9]==10) {
			System.out.println("The ISBN-10 number is "+ ISBN[0]+ISBN[1]+ISBN[2]+ISBN[3]+ISBN[4]+ISBN[5]+ISBN[6]+ISBN[7]+ISBN[8]+"X");
		}
		else {
			System.out.println("The ISBN-10 number is "+ ISBN[0]+ISBN[1]+ISBN[2]+ISBN[3]+ISBN[4]+ISBN[5]+ISBN[6]+ISBN[7]+ISBN[8]+ISBN[9]);
		}


	}

}
