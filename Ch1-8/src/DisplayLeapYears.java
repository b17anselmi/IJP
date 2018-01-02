// Exercise 5.27, display leap years from 2014-2112, 10 per line, separated by 1 space
public class DisplayLeapYears {

	public static void main(String[] args) {
		int year = 2014,linefeed = 0;//initiate starting year and placeholder variable for how many years are printed
		do {
			
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				
				System.out.printf("%d%s",year, " ");//print the leap year followed by a space
				linefeed++;//add to linefeed every time a year is printed
				if(linefeed % 10 ==0) {
					System.out.println();//every 10 years printed, go to the next line
					}
			}
			year++;
			
		}while(year<=2114);//upper year limit 

	}

}
