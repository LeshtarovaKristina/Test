package class07;

import java.util.Scanner;

public class ReviewClass2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 2 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("Please enter one of these operator: +, -, *, / ");
		char op=input.next().charAt(0);

		int result = 0;

		if (op=='+') {
			result = num1 + num2;
		} else if (op=='-') {
			result = num1 - num2;
		} else if (op=='*') {
			result = num1 * num2;
		} else if (op=='/') {
			result = num1 / num2;
		} else {
			System.out.println("Invalid entry");
		}

		System.out.println(result);
	}

}
