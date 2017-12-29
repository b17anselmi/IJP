// generate license plate number number in the format LLLDDDD  (L - capital letter, D - digit)
public class GenerateLiscensePlate {

	public static void main(String[] args) {
		char[] letters = new char[3];
		letters[0] = (char) ((int)(Math.random()*26+65));
		letters[1] = (char) ((int)(Math.random()*26+65));
		letters[2] = (char) ((int)(Math.random()*26+65));
		   
		int numbers =  (int)(Math.random()*10000);
		System.out.println("The plate number is " + letters[0] + letters[1] +letters[2] + numbers);
		
		

	}

}
