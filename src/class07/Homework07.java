package class07;

public class Homework07 {

	public static void main(String[] args) {
		//Print numbers from 1 to 100 in 1 line with space
 for (int a=1; a<=100; a++) {
	 System.out.print(a+" ");
 }
 System.out.println("-----------------------------------------------");
        //Print numbers from 100 to 1
 for (int b=100; b>=1; b--) {
	 System.out.println(b+" ");
 }
 
 System.out.println("-----------------------------------------------");

 
	   //Print even numbers from 20 to 1
 for (int c=20; c>=1; c--) {
	 if(c%2==0) {
     	System.out.println(c+" ");
	}

 
 }
 System.out.println("-------------------------------------------------");
 //Print odd numbers between 20 and 50
 for (int d=21; d<=49; d=d+2) {
	 System.out.println(d);
 }
	}
}

