package class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		System.out.println("----------WHILE CHECK CONDITION BEFORE EXECUTION------");
		
		int num=10;
		
		while(num<=3) {// is more used than do while
			System.out.println("Hello");//5 times print
		}
		
		System.out.println("-------------DO WHILE CHECKS THE CONDITION AFTER EXECUTION-------------------");
        int num1=10;
        
        do {//is less used than while
        	System.out.println("Hello");
        	num1++;
        	
        }while(num1<=3);
        
        System.out.println("I want to print numbers from 1 to 30 using do while loop");
        
        int num2=1;
        
        do {
        	System.out.print(num2);
        	num2++;
        	
        }while (num2<=30);
	}

}
