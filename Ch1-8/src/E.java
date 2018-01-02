/*Exercise 5.26 Calculate e using series below at n = 10000, 20000, 100000
 * e = 1+1/1!+ 1/2! + 1/3! + . . . + i/n!
 */
public class E {

	public static void main(String[] args) {
		double e = 1, f =1;
		int n=1;//because the series starts at 1, that is our bottom limit
		while(n<=100000) {//100000 is the top limit
			f/= n;//factorial
			e+=f;
			if (n == 10000) {
			    System.out.println("e at n = 10000 = " + e);
			   } else if (n == 20000) {
			    System.out.println("e at n = 20000 = " + e);
			   } else if (n == 100000) {
			    System.out.println("e at n = 100000 = " + e);
			   }
			n++;
		}
		System.out.println('\n'+"Check = " + Math.E);

	}

}
