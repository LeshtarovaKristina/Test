package class15;

public class Task1 {
//Username and Password cannot be  empty, if so→ message=
	//”Username and Password cannot be empty”.
	/*
	 * Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.
	 */
	public static void main(String[] args) {
	
		System.out.println("*****************************************************");
		String userName="Asel";
		String password="pass1234Asel";
		String confirmedPassword="pass1234Asel";
		Task1 task1=new Task1();
		task1.checkUserNamePassword(userName, password, confirmedPassword);
	}
	
	void checkUserNamePassword(String userName,String password,String confirmedPassword) {
		
		if(userName.isEmpty()  || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else {
		
			if(password.length()<8) {
				System.out.println("Password is too short");
			}else {
				if(password.contains(userName)){
					System.out.println("Password cannot contain username");
				}else {
					if(password.equals(confirmedPassword)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match");
					}
				}
			}
		}
		
	}
}
			
