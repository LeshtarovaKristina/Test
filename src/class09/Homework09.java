package class09;

public class Homework09 {

	public static void main(String[] args) {
		//Task 1
		// Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
       String cars[] ={"BMW", "Honda", "Toyota", "Mercedess","Lada", "Audi"};
       for(String car:cars) {
    	   System.out.print(car+" ");
       }  
    	   System.out.println("----------OR--------------");
    	String cars1[] ={"BMW", "Honda", "Toyota", "Mercedess","Lada", "Audi"};
    	for(int i=0; i<=cars1.length; i++) {
    		System.out.println(cars1[i]+" ");
    	}
	
       System.out.println("-----------------------------------");
       /*Task 2
        * Create an array of animals and store 5 elements into it.
        * Using 2 different loops print all elements from the array.
        */
       String animals[] = {"cat","dog", "mouse", "tiger", "lion"};
       for(String animal:animals) {
    	   System.out.print(animal+" ");
       }
       System.out.println("-----------------------------------");
       /*Task 3
        * Create an array on integers and 
        * calculate the sum of all elements in an array
        */
       int nums[] = {30, 50, 80};
       int sum=(nums[0]+nums[1]+nums[2]);
       System.out.print(sum);
       
       System.out.println("--------------OR ------------------");
       int nums1[] = {30, 50, 80};
       int size=nums1.length;
       int s=0;
       
       for(int i=0; i<size; i++) {
    	   sum+=nums1[i];
       }
    	  System.out.println("Sum of all elements in the array = "+s);
       
       System.out.println("-----------------------------------");
       
       /*Task 4
        *From an array of integer elements find the largest number.
        */
       int large=0;
       int num[] = {10,15,30,60};
       for(int x=0; x<num.length; x++) {
    	   if (num[x]>large) {
    		   large=num[x];
    	   }
       }
       
    	   System.out.println(large);
    	   
    	   System.out.println("------------------OR-----------------------");
    	   
    	   
    	   
    	   System.out.println("-----------------------------------");
    	   
    	   /*Task 5(two ways)
    	    * Create an array of names and store all names of your group.
    	    * Then print your name from that array. 
    	    * (use 2 different ways of creating an array).
    	    */

    	   String name[] = {"Ivan","Gloria","Petar","Kristina","Max"};
    	   
    	   System.out.println(name[3]);
    	   
    	   System.out.println("-----OR--------");
    	   String name1[] = {"Ivan","Gloria","Petar","Kristina","Max"};
   		name1[0]="Ivan";
   		name1[1]="Gloria";
   		name1[2]="Petar";
   		name1[3]="Kristina";
   		name1[4]="Max";
   		
   		System.out.println(name[3]);
     	   
    	   System.out.println("-----------------------------------");
    	   /*Task 6
    	    * Create an array of words: Java, Saturday, day, coding, is.
    	    * Print the following sentence using elements of array:
    	    * “Saturday is Java coding Day”. 
    	    */
    	String words[]= {"Java","Saturday", "day","coding","is"};
    	
    	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]+".");
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}

}
