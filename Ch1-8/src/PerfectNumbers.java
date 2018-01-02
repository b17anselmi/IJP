//exercise 5.33, find 4 perfect numbers (equal sum of factors) between 0 and 10,000
public class PerfectNumbers {

	public static void main(String[] args) {
		int sum=0, total =0;
		for(int num = 1; num<=10000; num++) {
			for (int f =1; f<num; f++) {//starting at 1, test all whole numbers except the numerator
				if (num%f==0) { 
					sum+=f;//if the integer is a factor of the number, add it to the sum of factors
				}				
			}
			if (num==sum) {//if sum of factors is the number
				System.out.println(num + " is a perfect number.");//print it
				total++;//and record that it found another perfect number
			}
			sum = 0;//reset the sum of the factors
		}
		System.out.println("The total number of perfect numbers is: " + total);
	}

}
