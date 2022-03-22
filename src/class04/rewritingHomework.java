package class04;

import java.util.Scanner;

public class rewritingHomework {

	public static void main(String[] args) {
		/*eligible to donate blood->18
		 * if yes->you have to be >=110lbs
		 * if not->can not accept such a patient!
		 */

		Scanner age=new Scanner(System.in);
		       System.out.println("How old are you?");
		       
		int age1=age.nextInt();
		       System.out.println("How much you weight?");
		int weight=age.nextInt();
		
        if (age1>=18) {
        	System.out.println("Congrats,you are eligible!");
        	
        
        if (weight>=110) {
        	System.out.println("You are fully eligible!");
        	
        }else if(weight<110) {
        	System.out.println("I am sorrry your weigh is too low!");
        }else {
        	System.out.println("Not eligible!");
        }
        

        	
        }
        
		
		
		
		
		
		
	}

}
