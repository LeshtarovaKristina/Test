package class05;

import java.util.Scanner;

public class NewTask {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */
	
		// *** HOW TO DEBUG ***
	
				Scanner in = new Scanner(System.in);
				
				System.out.println("Please enter 3 numbers to find the largest one!");
					
				int num1=in.nextInt();
				System.out.println("What is your next number?");
				int num2=in.nextInt();
				System.out.println("What is your last number?");
				int num3=in.nextInt();
				
				if(num1>num2) {
					if(num1>num3) {
						System.out.println(num1+" is the largest number");
					}else {//num2 is larger than numner1
						if(num2>num3) {
							System.out.println(num2+" is the largest number");
						}else {
							System.out.println(num3+" is the largest number");
						}
					}
				}

	}

}
