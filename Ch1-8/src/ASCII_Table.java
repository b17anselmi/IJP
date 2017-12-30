//From ! to ~ is from 33 to 126 decimal ASCII code
public class ASCII_Table {

	public static void main(String[] args) {
		  for(char i = '!' ; i <= '~'; i++ ){
		    
		   System.out.print(i + " ");//print each character
		   
		   if ((i-32)%10 == 0) {//'!' has a decimal value of 33
		   System.out.println("");//for every 9 characters we want to go to the next line
		   }
		    
		  }

	}

}
