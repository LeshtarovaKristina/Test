package class12;

public class Dogg {
	//atributes
	String furColor;
	String eyeColor;
	int age;
	char gender;
	
	//behaviour
	
	void run(){
		System.out.println("The dog is running...");
	}
	void eating() {
		System.out.println("The dog is eating");
	}
	void play() {
		System.out.println("The dog is playing");
	}

	public static void main(String[] args) {
		/*
		 * Create a Dog Class and create 3 different objects of it:
		 *  Husky, Bulldog, Labrador  with specific  attributes and behaviors.
		 */
		
		//objects
		Dogg Huskey=new Dogg();
		Dogg Bulldog=new Dogg();
		Dogg Labrador=new Dogg();
		
		Huskey.run();
		Bulldog.eating();
		Labrador.play();
		
		

	}

}
