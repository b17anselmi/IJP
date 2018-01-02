//Exercise 5.29, display calendar of year given year and week day of first month
import java.util.Scanner;
public class DisplayCalendar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year, day;
		System.out.println("Enter year and day number (i.e. Sunday = 0, Monday = 1, Tuesday = 2, etc.)");
		year = s.nextInt();
		day = s.nextInt();
		s.close();
		
		int month = 1, len;
		//get month lengths
		while (month<=12) {
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
			   System.out.println('\n'+ "\t"+Month + " "+ year + '\n' +"-----------------------------" +'\n'+" Sun Mon Tue Wed Thu Fri Sat" +'\n');//print headings
			   //formatting
			   for (int i = 0; i<day; i++) {
				   System.out.print("    ");
			   }
			   for (int i = 1; i <= len; i++)
	            {
	                if (i < 10) {
	                    System.out.print("   " + i);
	                } else {
	                    System.out.print("  " + i);
	                }
	                if ((i + day) % 7 == 0) {
	                    System.out.println();
	                }
	            }
	            System.out.println();
	            day = (day + len) % 7;//get first day of next month
			month++;//go to next month
		}

	}

}
