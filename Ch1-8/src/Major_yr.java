/*given an input, display the major and year of a college student
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 * 1, 2, 3, 4: Freshmen, Sophomore, Junior, Senior
 */
import java.util.Scanner;
public class Major_yr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter characters for major and year:");
		String info = sc.nextLine();
		char major = info.charAt(0);
		char year = info.charAt(1);
		String Major = "";
		switch(major) {
		case 'I': Major = "Information Management" ;break;
		case 'C': Major ="Computer Science"; break;
		case 'A': Major = "Accounting"; break;
		default:
			   System.out.println("Invalid input");
			   System.exit(0);
			   break;
		}
		String Year ="";
		switch (year) {
		case '1': Year = "Freshmen"; break;
		case '2': Year = "Sophomore"; break;
		case '3': Year = "Junior"; break;
		case '4': Year = "Senior"; break;
		default: System.out.println("Invalid input");System.exit(0);break;
		}
		System.out.println(Major + " "+ Year);

	}

}
