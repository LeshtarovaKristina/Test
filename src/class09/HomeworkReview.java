package class09;

public class HomeworkReview {

	public static void main(String[] args) {
		for (int i=1; i<=4; i++) {
			System.out.println("A");
			//break;
			
			System.out.println("B");
		}
  
		System.out.println("--------------------------------------------");
		
		for (int i=1; i<=3; i++) {//outer loop controls number of complete iterations of inner loop
			
			for(int j=1; j<=3; j++) {
				System.out.println("Hello");//inner loop always depends on outer loop
				break;
			}
			
			System.out.println("Good Morning");
			break;
		}
		System.out.println("----------------------------------------------");
		
		for(int i=0; i<=3; i++) {
			
			
			for (int j=1; j<=4; j++) {
				
				if (j==2) {
					continue;
					//break; CE:
				}
				System.out.println("Good Morning");
			}
			System.out.println("Hello");
		}
		
		
	}

}
