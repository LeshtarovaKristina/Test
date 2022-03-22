package class04;
/*
 * to import in mac:cmd+shift+o
 */

import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
		
		//1.Create Scanner and assign to a variable
		Scanner scan=new Scanner(System.in);
		
		//2.specify instructions
		System.out.println("Please enter the country where you are from .");
		
		//3.we need to capture String value-->use next();
		String country=scan.next();
		System.out.println("You are from "+country);
		
		//if you are from USA-->you speak English
		//    if you are from France-->you speak french
		if(country.equals("USA")) {
			System.out.println("You speak english");
		
	}else if (country.equals("France")) {
		System.out.println("You speak french");
	}else {
		System.out.println("I do not know which language you speak");
		
		
		
		
		
		
		
		
		
		
		
		

	}
	}
}



