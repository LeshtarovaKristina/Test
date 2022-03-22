package class04;

import java.util.Scanner;

public class rewritingHomework2 {

	public static void main(String[] args) {
		/*Do you have a diploma?
		 * if yes->congrats and what is your GPA?
		 *        If>=4-> getting scolarship
		 *        if<=4-> you need to study harder
		 * if you do not have a diploma->You should get one!
		 * 
		 */
      Scanner diploma=new Scanner(System.in);
         System.out.println("Do you have a diploma?");
         String answer=diploma.nextLine();
         
         
      if(answer.equals("yes")) {
        	 System.out.println("What is your GPA?");
        	 
         int gpa=diploma.nextInt();
         if (gpa>=4) {
        	 System.out.println("You are eligible for scolarship!");
         }else if (gpa<=4) {
        	 System.out.println("You have to study harder!");
      }else
        	 System.out.println("You need to get one!");
         }
         
         
         
         
         
	}

}
