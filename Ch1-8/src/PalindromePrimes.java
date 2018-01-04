// 6.26 display first 120 numbers that are prime and palindromic 
public class PalindromePrimes {

	public static void main(String[] args) {
		
		int c =0,i =0;
		do{
		if (PalidromeInt.isPalindrome(i)&& Prime(i)) {//I already created a method to check if a number is palindromic or not, 
			System.out.printf("%10d", i);
            c++;
            if (c % 10 == 0 && i != 0) System.out.println();
		}
		i++;
		}while(c<=120);
	}

	public static boolean Prime(long n) {
		if (n<2) return false;
		for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
		
		return true;
	}

}
