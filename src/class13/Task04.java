package class13;

public class Task04 {
//Task 4 Homework
	//Create a method createEmail(). Based on values of users name, 
	//lastName and email type, your method should return complete email Address.
	
	String createEmail(boolean email,String firstName,String lastName, String emailType) {
		if(email) {
			return(firstName+lastName+emailType);
		}else {
			return("Unknown!");
		}
	}
	public static void main(String[] args) {
		Task04 obj=new Task04();
		System.out.println(obj.createEmail(true,"kristina","leshtarova","@gmail.com"));
		

	}

}
