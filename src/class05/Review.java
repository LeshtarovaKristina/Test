package class05;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		  System.out.println("Please enter your name");
		 
		  String name=input.next();
		  System.out.println("Please enter your age");
		  
		  int age=input.nextInt();
System.out.println("Your name is "+name+" and your age is "+age);

        System.out.println("Please enter boolean value");
        boolean booleanValue=input.nextBoolean();
        System.out.println(booleanValue);

        double d=input.nextDouble();
        System.out.println(d);
        
        System.out.println("Please enter char value");
        char character=input.next().charAt(0);
        System.out.println(character);
	}

}
