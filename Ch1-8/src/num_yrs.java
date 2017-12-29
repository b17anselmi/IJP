//when given a number of minutes, calculate the number of years and days
//test - 1,000,000,000 minutes should be 1902 years and 214 days
import java.util.Scanner;

public class num_yrs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of minutes: ");
		int in_minutes, years, days, min_yr,min_day, rem_min;
		in_minutes = input.nextInt();
		//calculate minutes in a year (525600 from irb) and minutes in a day pretending I don't know already (1440)
		min_day= 60*24;
		min_yr= min_day*365;
	//now for the real calculation
		years = in_minutes/min_yr;
		//the previous line gave us the whole number of years we can get out of our minute input
		//now we need to know how much is leftover
		rem_min =in_minutes % min_yr;
		//and finally we need to take the remaining minutes and see how many days they make up
		days = rem_min/min_day;
		//the exercise didn't ask, but we can also find out how much how many minutes are leftover with the commented out code below
		//double minutes = rem_min%min_day;
		
		//and finally we can display the output
		System.out.println(in_minutes + " minutes is approximately " + years + " years and " +days + " days.");
		//System.out.println(in_minutes + " minutes is approximately " + years + " years and " +days + " days with " + minutes + " minutes remaining." );
		

	}

}
