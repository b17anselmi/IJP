//Exercise 6.32, play craps game from 6.30 15000 times and display probability of winning 
public class CrapsProbs {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 15000; i++) {
			if (Craps.craps() == "You win!")
				count++;
		}
		double probs = (count/15000.0)*100;
		System.out.println("Number of winning games: " + count + '\n' + "Probability of winning = " + probs + "%");

	}

}
