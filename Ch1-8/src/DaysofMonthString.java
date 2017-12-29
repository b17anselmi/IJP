//given three letter abbreviation for month and year, output number of days in the month
import java.util.Scanner;

public class DaysofMonthString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year, days;
		year = input.nextInt();
		System.out.println("Enter month abbreviation (i.e. Jan, Feb, etc):");
		String month= input.next();
		if(month == "Feb" && (year % 4 == 0)) {
			days = 29;
		}
		else if (month == "Feb" ) {
			days = 28;
		}

	
		else if (month == "April" ||month == "June" ||month == "September" ||month == "November") {
			days = 30;
		}
		else {
			days = 31;
		}
		System.out.println(month + " "+ year + " has/had " + days + " days");


	}

}
