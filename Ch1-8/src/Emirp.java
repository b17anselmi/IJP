// Exercise 6.27, display first 120 primes that's palindrome is also a prime (i.e. 17 and 71 are primes, so they are emirps)
public class Emirp {

	public static void main(String[] args) {
		int c =0,i =0;
		do{
		if (emirp(i)) { 
			System.out.printf("%10d", i);
            c++;//count printed items
            if (c % 10 == 0 && i != 0) System.out.println();//next line after 10 items printed
		}
		i++;
		}while(c<=120);

	}
	public static boolean emirp(long n) {//create a method to test if emirp==true using other methods
		if ((!PalidromeInt.isPalindrome(n)&&(PalindromePrimes.Prime(n))&&PalindromePrimes.Prime(PalidromeInt.reverse(n)))) 
		return true;
		else {
			return false;
		}
		
	}

}
