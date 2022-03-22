package class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		 boolean likeJava=true;
	     boolean understandJava=true;
	     
	     if(likeJava && understandJava) {
	    	 System.out.println("Awsome");

	     }
	     
	         System.out.println("End of code");
	     
	     //WE WANT TO COMPARE 3 NUMBERS
	         /* if               num1 >num2 && num1>num3 -->num1 is the largest
	          * what if(else if) num2>num1 && num2>num3 -->num2 is the largest
	          * what if          num3>num1 && num3>num2--> num3 is the largest
	          */
	     int num1=100;
	     int num2=2000;
	     int num3=300;
	      
	     if (num1>num2 && num1>num3) {
	    	 System.out.println(num1+" is the largest");
	     }else if (num2>num1 && num2>num3) {
	    	 System.out.println(num2+" is the largest");
	     }else if(num3>num1 && num3>num2) {
	    	 System.out.println(num3+" is the largest");
	     }
	     
	     
	     
	     
	     
	     

	}

}
