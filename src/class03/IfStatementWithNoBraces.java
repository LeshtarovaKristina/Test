package class03;

public class IfStatementWithNoBraces {

	public static void main(String[] args) {
		boolean weekend=true;
		
		if (weekend) 
			System.out.println("I have java classes at Syntax");
			else 
			System.out.println("I might have other classes or day off");
			System.out.println("I will enjoy this day");
		
		System.out.println("End of the code");
		
		
		
		//if else if
		int day=6;
		if(day==1) {
			System.out.println("Today is Monday");
		}else if (day==2) {
			System.out.println("Today is Tuesday");
		}else if (day==3) {
			System.out.println("Today is Wednesday");
		}else if (day==4) {
			System.out.println("Today is Thursday");
		}else if (day==5) {
			System.out.println("Today is Friday");
		}else if (day==6) {
			System.out.println("Today is Saturday");
		}else if (day==7) {
			System.out.println("Today is Sunday");
			
		}else {
System.out.println("Invalid week day");	

		}
		
	
			
		}
		
		

	}


