// Exercise 6.24, display current date and time
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateandTime {
	private static final DateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyy ");
		
	public static void main(String[] args) {
		Date date = new Date();
        System.out.println("The time and date is: "+sdf.format(date));
		
	}
}
