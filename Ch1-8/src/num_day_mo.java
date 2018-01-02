//have user input number of month
import java.util.Scanner;

public class num_day_mo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the month and the year: ");
		int month, year, days;
		month= input.nextInt();
		year = input.nextInt();
		
		if(month == 2 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
			days = 29;
		}
		else if (month == 2 ) {
			days = 28;
		}

	
		else if (month == 4 ||month == 6 ||month ==9 ||month == 11) {
			days = 30;
		}
		else {
			days = 31;
		}
		System.out.println(month + " "+ year + " has/had " + days + " days");

}
}
