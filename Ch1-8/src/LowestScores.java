/*Exercise 5.9
 * given number of students, each student name, and each student score, display lowest two scoring students
 */
import java.util.Scanner;
public class LowestScores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt(); //number of students
		double low =100,secondlow=100; //initialize the lowest scores as the highest
		String lowname="", seclowname="";
		for (int i=0; i<n; i++) {
			System.out.print("Enter name and score of student (" + (i + 1)
				     + "):");
			String name= sc.next();
			double score = sc.nextDouble();
			
			if (score < low) {
                if (lowname != null) {
                    seclowname = lowname;
                    secondlow = low;
                }
                lowname = name;
                low = score;
            } 
			else if (score < secondlow) {
                seclowname = name;
                secondlow = score;
            }
			
		}
		sc.close();
		 System.out.println("Lowest student " + lowname + "'s score is " + low);
	     System.out.println("Second lowest student " + seclowname + "'s score is " + secondlow);

	}

}
