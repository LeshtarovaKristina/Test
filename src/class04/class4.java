package class04;

public class class4 {

	public static void main(String[] args) {
	//write a program to check wheather number is positive or negative
		int num = -9;
		if (num < 0) {
			System.out.println("The number "+ num +" is Negative");
		} else if (num>0){
			System.out.println(" The number " + num +" is Positive");
		}else {
			System.out.println("The number is "+num);
		}
	
	
	
	//Write a Java program to check weather number is eaven or odd
	
	num=10;
	if (num % 2 ==0)
	System.out.println("This "+num+" is an even Number");
else {
	System.out.println("The "+num+" is an Odd Number");
}
	
	
	//Nested if
	boolean vaccine=true;
	int dose=2;
	
	
	 
	if(vaccine) {
		System.out.println("How many doses you have?");
		
		if(dose==1) {
			System.out.println("You need another shot!");
		
	}else {
		System.out.println("You are fully vaccinated.");
	}
	}
	System.out.println("------------------------------------------------------------------");
	
	/*declare a variable for allergy
	 * 
	 * if you have allergy-->
	 *                       if you have pollen
	 *                       if you have peanut
	 *                       if you have wheat
	 * if no allergy--> you are lucky
	 */
	boolean allergy=false;
	
	if (allergy) {//outer if
		System.out.println("Let's check what allergies you have");
		String allergyType="pollen";
		//nested if->always has a dependency on outer if.
		//outer if MUST be true in order for nasted if to be checked 
		
    if(allergyType.equals("pollen")) {
    	System.out.println("Please stay at home when trees are blooming.Take medicines!");
       }else if(allergyType.equals("peanut")) {
    	System.out.println("Please do not eat food that contains nuts. Take medication B.");
       }else if(allergyType.equals("gluten")) {
    	System.out.println("Please follow gluten free diet.Take medicine C.");
    
	   }else {
		System.out.println("I don't know what suggestion to give you!");
	   }
	}else {
		System.out.println("You are lucky!");
     }
	
	
   }
}






