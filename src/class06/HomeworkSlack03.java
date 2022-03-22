package class06;

import java.util.Scanner;

public class HomeworkSlack03 {

	public static void main(String[] args) {
		
		

		   Scanner l=new Scanner (System.in);
		   System.out.println("Do you need a loan?");
		 
		   boolean l1=l.nextBoolean();

		if(l1==true){
		 System.out.println("What is your credit score?");
		  
		 int score=l.nextInt();
		 String el=null;

		if(score<600){
		    el="Not eligible";
		  }else if (score>=600 && score<=700){
			  el="Maybe eligible";
		  }else if (score>=701 && score<=800){
			  el="Eligible";
				      }else if (score>800){
				el="Definitely eligible";
		 }
		 System.out.println("The eligibility is "+el);
		}else {
			System.out.println("Unknown");
		 }
		 
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
