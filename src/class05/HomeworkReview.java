package class05;

import java.util.Scanner;

public class HomeworkReview {

	public static void main(String[] args) {
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into
		 *  celsius and print “The temperature is the city __ is __"
		 */
          Scanner input=new Scanner(System.in);
          System.out.println("Please enter your city:");
		
          String city=input.nextLine();
          
          System.out.println("Please enter your temperature ");
		
		  int farenheight,celsius;
		  farenheight=input.nextInt();
		  
		 celsius=((farenheight-32)*5)/9;
		 System.out.println("The temperature in "+city+" is "+celsius);
		
		
	}

}
