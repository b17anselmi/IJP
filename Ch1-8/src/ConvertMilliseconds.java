// Exercise 6.25, convert input milliseconds to hours:minutes:seconds
import java.util.Scanner;
public class ConvertMilliseconds {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter milliseconds: ");
		long value = s.nextLong();
		s.close();
		System.out.println(Milleconv(value));
	}
	public static String Milleconv(long milli) {
		String hrs_min_sec="";//initialize string to store info to be displayed
		long tsec,sec, tmin, min, hrs;
		tsec = milli/1000;//convert milliseconds to seconds
		sec =tsec%60;//get the number of seconds in the hour
		tmin = tsec/60;//convert remaining seconds to minutes
		min=tmin%60;//number of minutes in hour
		hrs = tmin/60;//remaining digits are the number of hours
		hrs_min_sec = hrs + ":"+ min + ":"+sec;//store info in one variable
		return hrs_min_sec;
	}

}
