// Exercise 7.18, use bubble sort algorithm to sort an array of 10 doubles
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 doubles: ");
		double[] toSort= new double[10];
		for (int i=0; i<10; i++) {//get values from user
			toSort[i]=s.nextDouble();
		}
		s.close();
		System.out.println("Sorted array: ");
		Bubble(toSort);//invoke method
		int i=0;
        do {
        	System.out.println(toSort[i]); //print out the sorted elements
        	i++;
        	}while(i<=toSort.length);

	}
	public static void Bubble(double arr[]) {
		int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        
	}

}
