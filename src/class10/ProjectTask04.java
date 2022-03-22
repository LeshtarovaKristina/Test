package class10;

public class ProjectTask04 {

	public static void main(String[] args) {
		/*Create a 2D array of integers.
		 * Develop a program which will calculate the sum of 
		 * even and odd numbers for that array.
		 * 
		 */

		int num[][]= {
				{2,4,6,5,8,7},
				{13,21,37,19,62,69},
		};
		int sumEven=0;
		int sumOdd=0;
		for(int x=0; x<num.length;x++) {
			for(int y=0; y<num[x].length;y++) {
				if(num[x][y]%2==0) {
					sumEven=sumEven+num[x][y];
				}else {
					sumOdd=sumOdd+num[x][y];
				}
			}
		}
		System.out.println("The sum of even numbers is = "+sumEven);
		System.out.println("The sum of odd numbers is = "+sumOdd);
	}
}

