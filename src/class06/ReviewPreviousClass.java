package class06;

import java.util.Scanner;

public class ReviewPreviousClass {

	public static void main(String[] args) {
		/*Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		 * 
		 * 
		 */
		
		
Scanner day=new Scanner(System.in); 
		
		System.out.println("Please enter numerical value of today’s day.");
		
		int whatDay= day.nextInt();
		
		if (whatDay>=1 && whatDay<=5) {
			System.out.println("It is a weekday.");
		}
		else if (whatDay==7 || whatDay==6) {
			System.out.println("It is weekend.");
			
		}
			
		else {
			System.out.println("Invalid day");
		}
		
		
		/*
		 *  Write a program that will read three inputs of scores (quiz, mid term, and final scores)
		 *   and determine the grade based on the following rules: 

if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
		 */
		
		
		Scanner x=new Scanner(System.in);
	    System.out.println("Quiz score");
	    
	    
	    int x1=x.nextInt();
	    System.out.println("Mid term");
	    
	    int x2=x.nextInt();
	    System.out.println("Final score");
	    
	    int x3=x.nextInt();
	    
	    int x4=((x1+x2+x3)/3);
	    System.out.println(x4);
	    
			if(x4>90) {
				System.out.println("Grade A");
			}else if(x4>=70 && x4<=90) {
				System.out.println("Grade B");
			}else if(x4>=50 && x4<70) {
				System.out.println("Grade C");
			}else if(x4<50) {
				System.out.println("Grade F");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
