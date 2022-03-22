package class05;

import java.util.Scanner;

public class PossibleIssues {

	public static void main(String[] args) {
		// next() vs nextLine();
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter temperature");//Capturing value using next
		
		String temp=scan.next();//nextInt();nextDouble();nextBoolean();next().charAt(0);
		System.out.println(temp);
		
		scan.nextLine();
		
		System.out.println("Plese enter City");//Capturing values using nextLine
		
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of program");
		
		
		
		
	}

}
