package class04;

import java.util.Scanner;

public class MoreExample {

	public static void main(String[] args) {  
		
	Scanner in=new Scanner (System.in);
	System.out.println("Please enter your full name.");
	//if you need to capture more than one word than 1 word->use nextline();
    String name= in.nextLine();
    
    System.out.println(name);
    
	
	}

}
