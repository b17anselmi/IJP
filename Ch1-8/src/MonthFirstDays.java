/*Exercise 5.28 given a year and the first day of the week of that year, display the first day of each month in that year
 *  January 1, 2013 is Tuesday
 *  ...
 *  December 1, 2013 is Sunday
 *  I'd like to use Zeller's congruence for this, but it's not working as nicely as I'd like
 */
import java.util.Scanner;
public class MonthFirstDays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year, day, month = 1, len;//initiate variables, month = 1 because we're starting with January
		System.out.println("Enter year and day number (i.e. Sunday = 0, Monday = 1, Tuesday = 2, etc.)");
		year = s.nextInt();
		day = s.nextInt();
		s.close();
		do{
			// find length of months
			if(month == 2 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
				len = 29;
			}
			else if (month == 2 ) {
				len = 28;
			}

		
			else if (month == 4 ||month == 6 ||month ==9 ||month == 11) {
				len = 30;
			}
			else {
				len = 31;
			}
			 String Month="", Day="";
			   //associate month number with Month name
			   switch (month) {
			   case 1:
			    Month = "January";
			    break;
			   case 2:
			    Month = "February";
			    break;
			   case 3:
			    Month = "March";
			    break;
			   case 4:
			    Month = "April";
			    break;
			   case 5:
			    Month = "May";
			    break;
			   case 6:
			    Month = "June";
			    break;
			   case 7:
			    Month = "July";
			    break;
			   case 8:
			    Month = "August";
			    break;
			   case 9:
			    Month = "September";
			    break;
			   case 10:
			    Month = "October";
			    break;
			   case 11:
			    Month = "November";
			    break;
			   case 12:
			    Month = "December";
			    break;
			   }
			 
			   // Calculate day of the week
			   day = (day) % 7;
			   switch (day) {//associate day number with Day name
			   case 1:
			    Day = "Monday";
			    break;
			   case 2:
			    Day = "Tuesday";
			    break;
			   case 3:
			    Day = "Wednesday";
			    break;
			   case 4:
			    Day = "Thursday";
			    break;
			   case 5:
			    Day = "Friday";
			    break;
			   case 6:
			    Day = "Saturday";
			    break;
			   case 0:
			    Day = "Sunday";
			    break;
			   }
			 
			   System.out.println(Month + " 1st, " + year + " is " + Day);//results 
			   day += len;//get the next month's 1st day number by adding the length of the current month to the current day
			   month++;//go to the next month
			  }while(month<=12);//end loop after all 12 months
	}

}
