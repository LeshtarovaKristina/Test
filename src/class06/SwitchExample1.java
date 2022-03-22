package class06;

public class SwitchExample1 {

	public static void main(String[] args) {
	
		char choice='l';
		String answer;
		
		switch (choice) {
		
		case 'y':
		 answer="Yes";
		 break;
		case 'n':
		 answer="No";
		 break;
		case 'm':
	     answer="Maybe";
	     break;
	    default://default is like else in the if statements
	    	answer="Unknown";
	    
		}
      System.out.println(answer);
      
      System.out.println("---------------------------------------------------------------------");
      /*
       * declare a variable to store a car
       * based on the value define the country of origin
       */
      
      String car="LADA";
      
      String country;
      
      switch (car.toLowerCase()) {//stringName.toLowerCase()    stringName.toUpperCase()
      
      case "BMW":
    	  country="Germany";
    	  break;
      case "Ford":
    	  country="USA";
    	  break;
      case "Lada":
    	  country="Russia";
    	  break;
      case "Toyota":
    	  country="Japan";
    	  break;
    	  default:
    		  country="Invalid";
    	  
      }
      System.out.println(car+" is from "+country+" country");
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
