//Exercise 5.45, compute mean and standard deviation of 10 input numbers
import java.util.Scanner;
public class Mean_SD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double [] data = new double[10];//creating an array to store values
		double sum=0;
		for (int i=0; i< data.length;i++) {
			data[i]= s.nextDouble();
			sum+=data[i];//add input to the sum of the inputs
		}
		s.close();
		double mean = sum/10;//get the average of numbers
		
		System.out.println("Mean = "+mean);
		
		double SDsum=0;
		for (int k=0;k<=9; k++) {
			SDsum+=Math.pow((data[k]- mean), 2);//get
		}
		
		double SDmean = SDsum/(data.length-1);
		double StandDev = Math.pow(SDmean, 0.5);
		
		System.out.println("Standard Deviation  = " + StandDev);
//off by 0.2, probably math error
		//maybe should be 10-1, give it a try
	}

}
