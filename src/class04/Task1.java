package class04;

public class Task1 {

	public static void main(String[] args) {
		//Task 1
		/*
		 * Write a program to store a boolean value of whether user has diploma or not. If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .
		 */
		
		boolean diploma=true;
		
		if(diploma) {
			System.out.println("Congratulations!!!!!");
			
			double gpa=3.5;
			if(gpa>=3.5) {
				System.out.println("You are eligible for scolarship!");
			}else {
				System.out.println("You should have studied harder!");
			}
			
		}else {
			System.out.println("Get a degree!");
		}
	 
		
		
		//Task2
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. Once user decides to buy a house, if price of the house is larger than 50000 than user will take a loan, otherwise user will pay cash.
		 */
		double mortgageRate= 2.5;
		double mortgagePrice= 145000;
		
		if(mortgageRate>4.5) {
			System.out.println("We won't buy the house!");
		}else {
			System.out.println("Consider buying!");  
			
			if(mortgagePrice >50000) {
				
				System.out.println("You should take a loan!");
		}else {
			System.out.println("You can pay cash");
		}
			
	    //Task3- Donor
			int age=21;
			
			if(age>=18) {
				System.out.println("Eligible to donate blood.");
				int weight=140;
				if(weight>=110) {
					System.out.println("You can be a donor.");
				}else {
					System.out.println("Can not accept such a patient.");
				}
			
			}else {
				System.out.println("Not eligible to donate blood.");
			}
			
		
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
}

