//Exercise 7.3, given digits between 1-50, count how many times each digit occurs, terminate when 0 entered
import java.util.Scanner;
public class CountOccurances1dArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter integers between 1-50: ");
		int n=1, c=0;
		int[] inputs = new int[50];
		while (n!=0) {
			n = s.nextInt();	
			inputs[c]=n;
			c++;
			
		}
		s.close();
counts(inputs);
	}
	public static void counts(int[] list) {
        for (int i = 1; i <= 50; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count ++;
            }
            if (count != 0)
                System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");
        } 
    }

}
