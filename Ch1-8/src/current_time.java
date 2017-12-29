//display current time given an input offset from GMT
import java.util.Scanner;

public class current_time {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the offset from GMT: ");
		int offset = input.nextInt();

		// Obtain the total milliseconds since the midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since the midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    int currentSecond = (int)(totalSeconds % 60);

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    int currentMinute = (int)(totalMinutes % 60);


	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    int GMTHour = (int)(totalHours % 24);
	    
	   //take gmt hour and find current time using offset
	    int currentHour = GMTHour+offset;
	    //however we have to plan for our negative numbers, and can use a loop to do that
	    if (currentHour <=0) {
	    	currentHour+=12;
	    }

	    // Display results
	    System.out.println("Current time is " + GMTHour + ":" + currentMinute + ":" + currentSecond + " GMT"+"\n");
	    System.out.println("Current time at your location is:" + currentHour+ ":" + currentMinute + ":" + currentSecond);

	}

}
