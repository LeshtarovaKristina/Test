package class10;

import java.util.Scanner;

public class ProjectTask06 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */
        
	   int num=13;
	   boolean isPrime=true;
	   
	   for(int x=2;x<num/2; x++) {
		   if(num%1==0) {
			   isPrime=false;
			   break;
		   }
	   	 }
		if(isPrime) {
			System.out.println(num+" is a Prime number!");
		}else {
			System.out.println("Not a prime number!");
		}
	}

}
