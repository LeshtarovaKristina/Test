package class13;

import java.util.Scanner;

public class MethodsDemo1 {
    //void is type of method that don't return anything whan called
	//checEvenOdd is the name of the method
	//()we use to pass info from outside
	//int number this is parameter that we can pass to this method when called
	//we can use this variable inside the logic of method
	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
			
		}else {
			System.out.println("Odd");
		}
		
	}
	void edward(boolean isRaining) {
		if(isRaining) {
			System.out.println("I am staying home");
		}else {
			System.out.println("Let's go for a walk");
		}
	}
	
	
	//Task:  create a method to check a name if name is Teyfur it prints send memes otherwise
	//if the name is Maha prints I am a doctor 
	//otherwise prints I don't know you
	
	void checkPerson(String name ) {
		if ("Teyfur".equals(name)) {
			System.out.println("Memer");
		}else if ("Maha".equals(name)) {
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown");
		}
		
	}
	public static void main(String[] args) {
		MethodsDemo1 object1=new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
        object1.edward(false);
        
        object1.checkPerson("Teyfur");
        object1.checkPerson("Maha");
        object1.checkPerson("Kristina");
        
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        //int number2=object1.checkEvenOdd(120);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
