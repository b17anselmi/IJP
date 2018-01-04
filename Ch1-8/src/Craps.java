/*Exercise 6.30, make craps game 2 random dice rolls
 * sum = 2, 3, or 12 - loose
 * sum = 7 || 11 - win
 * else - points = sum, win when new sum == points
 */
import java.util.Random;
public class Craps {

	public static void main(String[] args) {
		System.out.println(craps());
		}

		public static String craps() {
		String result = "";
		int sum = rollsum();
		if (sum== 7 || sum==11) {
			result = "You win!";
			
		}
		else if (sum==2 || sum==3 || sum==12) {
			result = "You loose.";
		}
		else {
			do {
				int newsum=rollsum();
				if (newsum == sum) {
					result = "You win!";
				}
				else if (newsum ==7) {
					result = "You loose.";
				}
			}while(result == "");
		}
		return result;
	}	
	public static int rollsum() {
			Random r = new Random();
			int dice1= r.nextInt(6)+1;
			int dice2 =r.nextInt(6)+1;
			int sum = dice1+dice2;
			System.out.println(dice1 + " + " + dice2 + " = "+ sum );//display what is happening in the game
			return sum;
		}

	}



