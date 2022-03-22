package class11;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?
		

		int[] arr= {10,20,90,50,70};
		//assuming first number is the largest number
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		//iterating through all the elements
		for(int elements:arr) {
			
			//checking if we have something even bigger if yes update the largest
			if(elements>largest) {
				largest=elements;
				largest=elements;
				
	
			}else if (elements>secondLargest && elements!=largest) {
				secondLargest=elements;
				
			}
		}
		System.out.println("The largest number is "+largest);
        System.out.println("The second largest number is "+secondLargest);
        
        
        
        
        
        
        System.out.println("******************************************************");
        
        int[] arr1= {10,20,90,50,70};
        Arrays.sort(arr1);
        System.out.println(arr1[arr.length-1]);
        System.out.println(arr1[arr.length-2]);
	}

}
