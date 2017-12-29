/*calculate BMI given user height and weight in lbs and inches
 * BMI = weight(kg)/height**2(m)
 * 1 lbs= 0.45359237 kg
 * 1 in = 0.0254 m
 */

import java.util.Scanner;

public class rev_BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ask for an store height feet
		double feet, inches, height, weight, heightm, weightkg, BMI;
		//ask for and store weight
		System.out.println("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.println("Enter feet: ");
		feet = input.nextDouble()*12;
		System.out.println("Enter inches: ");
		inches = input.nextDouble();
		height = feet+inches;
		
		//because bmi is calculated using metric, we need to convert before anything else
		heightm = height*0.0254;
		weightkg= weight*0.45359237;
		
		//now we will calculate bmi
		BMI= weightkg/Math.pow(heightm, 2);
		System.out.println("Your BMI is: " + BMI);
		
		//also display what bmi means
		if (BMI < 18.5) {
			System.out.println("Underweight");
		}
		else if (BMI < 25) {
			System.out.println("Normal");
		}
		else if (BMI < 30) {
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
	}

}
