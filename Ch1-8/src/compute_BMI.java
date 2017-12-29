/*calculate BMI given user height and weight in lbs and inches
 * BMI = weight(kg)/height**2(m)
 * 1 lbs= 0.45359237 kg
 * 1 in = 0.0254 m
 */
import java.util.Scanner;

public class compute_BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ask for an store height
		System.out.println("Enter heigth in inches: ");
		double height = input.nextDouble();
		//ask for and store weight
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		//because bmi is calculated using metric, we need to convert before anything else
		double heightm = height*0.0254;
		double weightkg= weight*0.45359237;
		
		//now we will calculate bmi
		double BMI= weightkg/Math.pow(heightm, 2);
		System.out.println("Your BMI is: " + BMI);

	}

}
