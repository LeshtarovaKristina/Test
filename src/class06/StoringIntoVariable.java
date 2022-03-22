package class06;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {

		Scanner x=new Scanner(System.in);
	    System.out.println("Quiz score");
	    
	    
	    int x1=x.nextInt();
	    System.out.println("Mid term");
	    
	    int x2=x.nextInt();
	    System.out.println("Final score");
	    
	    int x3=x.nextInt();
	    
	    int score=((x1+x2+x3)/3);
	    
	    
	    char grade;
	    
			if(score>=90) {
				grade='A';
			}else if(score>=70 && score<=90) {
				grade='B';
			}else if(score>=50 && score<70) {
				grade='C';
			}else {
				grade='F';
			}
			
          System.out.println("Your grade is "+grade);
          
          //if your grade is Aor B-->you are a good student
          //otherwise-->you should study more
          
          if(grade=='A' || grade=='B') {
        	  System.out.println("You are a great student");
          }
	}

}
