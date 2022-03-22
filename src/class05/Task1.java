package class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		  /* let's ask user what is today day
         * 
         * based on the day let's define which class we have
         * 
         * if(monday or friday)--> there is no class today
         * else if(tuesday or wednesday)-->manual testing
         * else if (thursday)-->review class
         * else if(saturday or sunday)--> java class
         */
        Scanner testing=new Scanner (System.in); 
		
		System.out.println("what is the day today");
		String date= testing.nextLine();
		
		
		if (date.equalsIgnoreCase("monday") || date.equalsIgnoreCase("friday")) {
		
			System.out.println("I dont have class today");
		}
		else if (date.equalsIgnoreCase("Tuesday")|| date.equalsIgnoreCase("Wednesday"))	{
			System.out.println("I hava manual class today ");
			
		}else if (date.equalsIgnoreCase("thursday"))	{
				
			System.out.println("I have review day today");
				
		
				}else if (date.equalsIgnoreCase("Saturday")|| date.equalsIgnoreCase("Sunday"))	{
			System.out.println("I hava java class today ");
		}else {
		System.out.println("error");
		}
		
		
	}


        
        
        
        
        
        
	}


