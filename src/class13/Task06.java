package class13;

public class Task06 {
    //Task 6,Homework
	//Create  class Student that will have a method getGrade. 
	//Your method should accept the score of a student and return a grade:
	//score > 90 - A
	char grade(int score) {
		if(score>90) {
			return 'A';	
		}else if(score>80 && score<=90) {
			return 'B';
		}else if(score>70 && score<=80) {
			return 'C';
		}else if(score>50 && score<=70) {
			return 'D';
	}else {
		return 'F';
	}
	}
	public static void main(String[] args) {
		Task06 g=new Task06();
		System.out.println(g.grade(87));
	}

}
