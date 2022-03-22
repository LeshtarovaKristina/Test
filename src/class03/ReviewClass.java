package class03;

public class ReviewClass {

	public static void main(String[] args) {
		
		String dayTime="morning";

		int date =22;

		String month="January";

		//Today is morning of January 22.

		//+ used to attach String to anything

		String sentence="Today is "+ dayTime+ " of "+month+" "+date;
		System.out.println(sentence);
		
		
		//Short Hand Operators      +; -; *; /; %
		
		int num=100;
		num= num+100;
		System.out.println(num);
		
		num+=100; //this exact means--> this num=num+100
		System.out.println(num);
		
		num-=20;
		System.out.println(num);//280
		
		num/=10;// shorter way of num=num/10
		System.out.println(num);//28
		
		num%=3;
		System.out.println(num);
		
		
	
		
		
		
		

	}

}
