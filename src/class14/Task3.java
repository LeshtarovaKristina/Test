package class14;

public class Task3 {
	/*
	 * Create a method that will say Hello in different language 
	 * based on the country that will passed when method is executed.
	 */
	String sayHello(String country) {
		country=country.toLowerCase();
		switch(country) {
		case"USA":
			return"Hello";
			
		case"France":
			return"Bonjour";
			
		case "Turkey":
			return"Merhaba";
			
		default:
			return"Unknown";
		}
	}
	
	public static void main(String[] args) {
		Task3 obj=new Task3();
		String country=obj.sayHello("USA");
      System.out.println(country);
	}

}
