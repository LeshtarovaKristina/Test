package class13;

public class Task03 {
//Task03 Homework
	/*
	 * Create a method that will say Hello in different language 
	 * based on the country that will passed when method is executed.
	 */
	
	
	
	void c(String country) {
		if ("Bulgaria".equals(country)) {
			System.out.println("Zdravei!");
		}else if("USA".equals(country)){
			System.out.println("Hello!");
		}else {
			System.out.println("Unknown!");
		}
		
	}
	
	public static void main(String[] args) {
		
       Task03 obj=new Task03();
       obj.c("Bulgaria");
       obj.c("USA");
       obj.c("China");
       
		

	}

}
