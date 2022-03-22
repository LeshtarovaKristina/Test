package class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create an array on int values using a scanner and calculate 
		 * the sum of all stored elements in that array
		 */
		//Pseudo programming
		//1) Take the size of the Array using scanner class from the user 
		//2) create an array of above size
		//3) fill the array with elements from the user using scanner class
		//4) sum all the elements of the array
		//5) A class that helps us take the input from the keyboard
		
		Scanner scanner=new Scanner(System.in);
		//prompt the user for the size
         System.out.println("Please enter the size of the array");
         //take the size from the user and store it in the size variable
         int size=scanner.nextInt();
         //print out the size
         System.out.println("Size of the array "+size);
         //2) create an array of above size
         int [] array=new int[size];
         //3) fill the array with elements from the user using scanner class
         System.out.println("Please enter "+size+" elements.");
         for(int i=0; i<size; i++) {
        	 System.out.println("Please enter the element for index "+i);
        	 array[i]=scanner.nextInt();
         }
         
         //print out the elements of an array with out a loops
         System.out.println(Arrays.toString(array));
         
         
         //4) sum all the elements of the array
         int sum=0;
         for (int x=0; x<array.length; x++) {
        	 sum=sum+array[x];
         }
        System.out.println("Sum of array elements is "+sum);
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
