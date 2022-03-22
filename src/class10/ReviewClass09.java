package class10;

public class ReviewClass09 {
	//Task 3(HW) Create an array on integers and calculate the sum of all elements in an array

	public static void main(String[] args) {
		int[] numbers= {15,45,10,32};
		int size=numbers.length;
		int sum=0;
		for(int i=0; i<size; i++) {
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements in the array = "+sum);
		
		sum=0;
		for(int num:numbers) {
			sum+=num;
		}
       System.out.println("Sum of all elements in the array = "+sum);
       //Task 4(HW)
       //From an array of integer elements find the largest number.
       
       int [] number= {15, 45, 10, 32};
       
       int largest=number[0];
       for(int n=0; n<number.length; n++) {
    	   if (number[n]>largest) {
    		   largest=number[n];
    	   }
       }
       System.out.println(largest);
       
       largest=number[0];
       
       for (int num:number) {
    	   if (num>largest) {
    		   largest=num;
    	   }
       }
       
       System.out.println(largest);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
