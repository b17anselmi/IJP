//Sum elements of a multidimensional array
import java.util.Scanner;
public class Mult_D_Sum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter elements of a 4x4 array: ");
		int i=0, j=0;
		int [][] arr= new int[4][4];
		do {
			System.out.println("Enter array row " + (j+1) + " element: ");
			arr[i][j]=s.nextInt();
			i++; j++;
		}while(i<4&&j<4);
		do{
			System.out.println(arr[i][j]);
			i++; j++;
			}while(i<4&&j<4);
		}

	}


