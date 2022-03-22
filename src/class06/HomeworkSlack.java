package class06;

import java.util.Scanner;

public class HomeworkSlack {

	public static void main(String[] args) {
		/*Task 2:(using if staement)
		 * 
		 * HW:  Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
            Please complete this assignment in 2 ways: using if statement and switch case.
		 */
	
		Scanner cal=new Scanner(System.in);
		
		System.out.println("Enter number one:");
	           int num1=cal.nextInt();
	           
	    System.out.println("Enter number two:");
               int num2=cal.nextInt();
	    System.out.println("Please enter the operatior, you are willing to use(exp:+, -, /, *):");
               char operator=cal.next().charAt(0);
        
        int result=0;
           
           if(operator=='+') {
        	result=num1+num2;
        	
           }else if(operator=='-'){
            result=num1-num2;
        
	       }else if(operator=='/'){
	    	result=num1/num2;  
	          
	       }else if(operator=='*') {
	    	result=num1*num2;
	       }else {
	    	  System.out.println("Invalid");
	       }
          System.out.println(num1+" "+operator+" "+num2+" = "+result);
}
}
