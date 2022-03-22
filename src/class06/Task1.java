package class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it.
		 * Once values are capured print which language user speaks.
		 */
      Scanner x=new Scanner(System.in);
      System.out.println("Which country are you from?");
		 
      String y=x.nextLine();
      String language;
      
      switch(y.toUpperCase()) {
      case"USA":
    	  language="English";
    	  break;
      case"BULGARIA":
    	  language="Bulgarian";
    	  break;
      case"GERMANY":
    	  language="German";
    	  default:
    		  language="Invalid";
    		 
      }
      
        x.close();
        System.out.println("In "+y+" people speak "+language);
		
	}

}
