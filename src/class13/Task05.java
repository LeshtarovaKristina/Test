package class13;

public class Task05 {
	//Task 5, Homework
	//Write a method to return whether given number is prime or not?
	
	String primeNumber(int num) {
		if(num>1) {
			for(int i=2;i<num;i++) {
			  if(num% i==0) {
				return num+" is not a prime number!";
			}
			}
		}else {
			return num+" is not a prime number!";
		}
		return num+" is a prime number!";
	}

	public static void main(String[] args) {
		Task05 primeNum=new Task05();
		System.out.println(primeNum.primeNumber(8));
		System.out.println(primeNum.primeNumber(3));
	}

}
