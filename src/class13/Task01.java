package class13;

public class Task01 {
	//Task01 Homework
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	int parameters(int num1,int num2) {
		if (num1>num2) {
			return num1;
		
		}else {
			return num2;
		}
	}
	


	public static void main(String[] args) {
		Task01 obj=new Task01();
		//obj.parameters(6, 7);
		System.out.println(obj.parameters(6, 7)+" is the largest!");

	}

}
