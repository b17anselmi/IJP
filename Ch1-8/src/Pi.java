//Exercise 5.25 Calculate pi at 10000, 20000, and 100000 using series
public class Pi {

	public static void main(String[] args) {
		double pi = 0;
		int n = 1;
		do {
			pi += Math.pow(-1, n + 1) / (2 * n - 1);//set up the series
			if (n == 10000) {
			    System.out.println("Pi at n = 10000 = " + pi*4);
			   } 
			else if (n == 20000) {
			    System.out.println("Pi at n = 20000 = " + pi*4);
			   } 
			else if (n == 100000) {
			    System.out.println("Pi at n = 100000 = " + pi*4);
			   }
			n++;
		}while (n<=100000);//100000 was the top limit we were told to compute to

		   System.out.println('\n'+"Pi in Java is " + Math.PI);

	}

}
