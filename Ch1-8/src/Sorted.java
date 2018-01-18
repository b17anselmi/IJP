//Exercise 7.19, method to test if an array is already in descending order
import java.util.Arrays;
import java.util.Scanner;
public class Sorted {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 10 doubles: ");
		double[] toSort= new double[10];
		for (int i=0; i<10; i++) {//get values from user
			toSort[i]=s.nextDouble();
		}
		s.close();
		System.out.println(isSorted(toSort));//results
	}
	public static boolean isSorted(double arr[]) {
		double[] temp = new double[arr.length];
		for(int i=0; i<10; i++) {//copy input array into a temporary array which can be sorted
			temp[i]=arr[i];
		}
		BubbleSort.Bubble(temp);//sort the copy
		if (Arrays.equals(arr, temp)) {//test copy and original equivalence 
			return true;
			}
		else{
			return false;//if their not equal, then the input array was not sorted
			}
	}

}
