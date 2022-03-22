package class05;

import java.util.Scanner;

public class Homework1to6 {

	public static void main(String[] args) {
    /*6. Write a program for user to enter his/hers birth month. Based on the month define the season.
         Example: if user is born in March, April, May → season =“Spring” 
         if user is born in June, July, August → season =“Summer”  etc ...
     */
		
		Scanner season=new Scanner(System.in);
		System.out.println("Which month you have been born?");
		
		String month=season.nextLine();
		 if (month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
			 System.out.println("Spring");
		 }else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			 System.out.println("Summer");
		 }else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
		     System.out.println("Autum");
		 }else if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
			 System.out.println("Winter");
		 }
		 
		 
		 }
		
		
	}



