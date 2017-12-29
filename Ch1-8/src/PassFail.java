/* given a grade, output pass || fail, program ends at input -1
 * exercise 5.1
 */
import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter score: ");
		double score=sc.nextDouble();
		//specify what input causes the program to end
		if(score==-1) {
			System.out.println("No numbers were entered except 0");
			System.exit(1);
		}
		
		int i = 0;//keeps program from running infinitely
		while(score!=-1 && i<1) {
			i++;//without this line, loop prints pass || fail infinitely
			if(score>=60) {
			System.out.println("Pass");
			}
			else {
			System.out.println("Fail");	
			}
	//close scanner	
	sc.close();
}

}
}
