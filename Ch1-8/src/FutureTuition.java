/*Exercise 5.7
 * university tuition = $10,000
 * increases 6% per year (in one year tuition = 10,600)
 * program computes tuition in 10 years time and the total cost of 4 years worth tuition after 10th year
 */
public class FutureTuition {

	public static void main(String[] args) {
		double tuition, increase, cost=0;
		tuition = 10000;//tuition cost at present
		increase = 0.06;//increase rate per year
		for (int year = 1; year <= 14; year++) {
			//calculate increase per year
			tuition *= (1 + increase);
		if (year ==10) {
			//display price of tuition in 10 years
			System.out.println("Tuition in ten years: $" + tuition);	
		}
		
		if (year >10) {
			//after the 10th year, start calculating total cost of 4 years of education
			cost += tuition;

        }
	}	//output total cost of 4 years of education in 10 years time
		System.out.println("Total cost for four years' worth of tuition after the tenth year: $" + cost);
}
}
//checked with https://vanguard.wealthmsi.com/collcost.php#results
