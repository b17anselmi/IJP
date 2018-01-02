//revision of listing 2.10 (pg 86) to compute change when inputed as a string
import java.util.Scanner;
public class ComputeChangeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//get information needed
		System.out.println("Enter amount: ");
		String amount = sc.nextLine();
		sc.close();
		
		//parse information
		int dollars, cents;
		dollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
	    cents = Integer.parseInt(amount.substring( amount.indexOf('.')+1));
	    
	    //make remaining necessary calculations
	    int quarters, dimes, nickles;
	    quarters = cents/25;
	    cents = cents%25;
	    //dimes is computing incorrectly
	    dimes= cents/10;
	    cents=cents%10;
	    nickles = cents/5;
	    cents = cents%5;//remaining cents are the number of pennies
	    
	    //results
	    System.out.println("Your amount " + amount + " consists of:" + '\n'+'\t'+dollars + " dollars" +'\n'+'\t'+quarters + " quarters "); 
	    //dimes isn't tabbing in
	    System.out.println('\t'+ dimes + " dimes"+'\n'+'\t'+ nickles + " nickels"+'\n'+'\t'+ cents + " pennies"); 
	}

}
