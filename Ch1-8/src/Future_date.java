/*prompt user to enter the day's number (Sunday = 0, Monday = 1, etc), how many days from today 
 * output today is ... and future day is ...
 */
import java.util.Scanner;

public class Future_date {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter today's day: ");
		int day, fut_day;
		day = input.nextInt();
		System.out.print("Enter the number of days eleapsed since today: ");
		fut_day = (day + input.nextInt()) % 7;		
		
		//now we have to turn our numbers into strings for both today and future day
		String today = "", future = "";
		
		if (day == 0) {
			today = "Sunday";
		}
		else if (day ==1) {
			today = "Monday";
			
		}
		else if (day ==2) {
			today = "Tuesday";
			
		}
		else if (day ==3) {
			today = "Wednesday";
			
		}
		else if (day ==4) {
			today = "Thursday";
			
		}
		else if (day ==5) {
			today = "Friday";
			
		}
		else if (day ==6) {
			today = "Saturday";
			
		}
		else if (fut_day ==0) {
			future = "Sunday";
			
		}
		else if (fut_day ==1) {
			future = "Monday";
			
		}
		else if (fut_day ==2) {
			future = "Tuesday";
			
		}
		else if (fut_day ==3) {
			future = "Wednesday";
			
		}
		else if (fut_day ==4) {
			future = "Thursday";
			
		}
		else if (fut_day ==5) {
			future = "Friday";
			
		}
		else if (fut_day ==6) {
			future = "Saturday";
			
		}
		//and now finally we can output our results
		System.out.println("Today is "+ today + " and the future day is "+ future);
		input.close();
		}
		//program is doing what it's supposed to, but for some reason getting an initialization error even though I specifically made them strings on line 17

	}
//also this is a disgustingly long program, there has to be a way to cut it down by at least half

