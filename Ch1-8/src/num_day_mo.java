//have user input number of month
import java.util.Scanner;

public class num_day_mo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the month and the year: ");
		int month, year, days;
		month= input.nextInt();
		year = input.nextInt();
		//boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		
		/*switch (month) {
		case 1: String Month = "January"; break;
		case 2: String Month = "February"; break;
		case 3: Month = "March"; break;
		case 4: Month = "April"; break;
		case 5: Month = "May"; break;
		case 6: Month = "June"; break;
		case 7: Month = "July"; break;
		case 8: Month = "August"; break;
		case 9: Month = "September"; break;
		case 10: Month = "October"; break;
		case 11: Month = "November"; break;
		case 12: Month = "December"; break;
		}*/
		
		
		if(month == 2 && (year % 4 == 0)) {
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
