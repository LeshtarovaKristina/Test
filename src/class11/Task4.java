package class11;

public class Task4 {

	public static void main(String[] args) {
		//Create the 2D array
		//Develop a program that will identify /print the even numbers only.
		//Store Even and Odd numbers in the 2D array
        //Access the elements
		//check the if element is even if it is add it to sumEven variable
		//check the if element is odd if it is add it to oddEven variable
		//print the values of both variables
		
		int[][] array2D= {
				{2,3,4},
				{5,6},
				{12,6,8},
				};
		int sumEven=0;
		int sumOdd=0;
		for(int[] row:array2D) {
			
			for (int element:row) {
				if(element%2==0) {
				    sumEven+=element;
				}else {
					sumOdd+=element;
				}
			}
		}
              System.out.println("Sum of Even numbers "+sumEven);
              System.out.println("Sum of Odd numbers "+sumOdd);
	}

}
