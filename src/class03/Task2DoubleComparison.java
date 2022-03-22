package class03;

public class Task2DoubleComparison {

	public static void main(String[] args) {
		
		//Task 1
		double x=50.2;
		double y=25.2;
		if(x>y) {
			System.out.println("Double value "+x+" is "+" larger than "+y);
		}else {
			System.out.println("80");
		}
		
		//Task 2
//Tempreture check
		int temp=50;
		if(temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will NOT freeze with temperature"+" "+55);
		}
		
		//Task3
//Expected and Actual hours
		double expectedHours=7.15;
	    double actualHours=20.30;
	    
	    if (expectedHours>actualHours) {
	    	System.out.println("You will love the course and you will succeed.");
	    }else {
	    	System.out.println("Course will be hard for you!");
	    }
	    
	    //exp task
	    /*
	     * wew need to declare a boolean variable hungry yes or no
	     * 
	     * if we are hungry-> I am going to eat
	     * otherwise-> I am going to drink a tea
	     */
	    
	     boolean hungry=true;
	     if(hungry==true) {
	    	 System.out.println("I am going to eat ");
	    	 
	     }else {
	    	 System.out.println("I am going to drink a tea.");
	     } 
	     
	     /*define a variable to store a browser
	      * 
	      * if browser is chrom-> we are executing tests on chrome
	      * otherwise-> I am not executing any test cases
	      */
	     
	     String browser="chrome";
	     //Always use .equals to compare 2 strings!!!!!
	     if (browser.equals("chrome") ) {
	    	 System.out.println("We are executing tests on chrome");
	    	  } else {
	    		  System.out.println("We are not executing any test cases!");
	    	  }
	     
	     
	     //More if statement
	     /*
	      * Define a variable to store a value of day
	      * 
	      * if day is Saturday--> I am having java class today
	      * otherwise -->I don't know which class I have
	      */
	     
	     String day="Monday";
	     if (day.equals("Monday")) {
	    	 System.out.println("I am having java class today.");
	    	 System.out.println("I am very exited!");
	    	 System.out.println("I am going to have fun with my class mates!");
	     }else {
	    	 System.out.println("I don't know which class I have.");
	     }
	     
	     
	     
	     
	     
	}

}
