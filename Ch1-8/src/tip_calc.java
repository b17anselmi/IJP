import java.util.Scanner;

public class tip_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        // first we have to get the cost of the meal
        System.out.println("Enter total cost: ");
        double cost= input.nextDouble();
        
        //now we have to ask what percentage people would like to tip
        System.out.println("Enter the percent you would like to tip: ");
        double prcnt = input.nextInt();
        //turn percentage into a decimal
        double dec = prcnt*0.01;
        double total = cost+cost*dec;
        System.out.println("If you leave a " + prcnt + "% tip, on " + cost + ", your total amount will be " + total);
        
	}

}
