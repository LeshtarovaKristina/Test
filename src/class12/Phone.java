package class12;
public class Phone {
	//Create a Class “Phone”. Create 3 Objects of it:
	//iPhone, Pixel, Nokia with specific  attributes and behaviors.

	
	//atributes
	String color;
	String processor;
	int year;
	//behaviours
	void ring() {
		System.out.println("Phone is ringing...");
	}
	void vibrate() {
		System.out.println("Phone is vibrating ");
	}
	void makeNoise() {
		System.out.println("Phone is making noise");
	}
	void printCompleteInfo() {
		System.out.println("color"+color);
		System.out.println("year"+year);
	}
	
	public static void main(String[] args) {
		//objects
	Phone iPhone=new Phone();
	iPhone.color="Gold";
	iPhone.processor="i7";
	iPhone.year=2021;
	
	iPhone.ring();
	iPhone.vibrate();
	iPhone.makeNoise();
	
	iPhone.printCompleteInfo();
	
	
	
	Phone Pixel=new Phone();
	Pixel.color="Black";
	Pixel.processor="i8";
	Pixel.year=2022;
	
	Pixel.ring();
	Pixel.vibrate();
	Pixel.makeNoise();
	
	
	Phone Nokia=new Phone();
	Nokia.color="White";
	Nokia.processor="S32";
	Nokia.year=2020;
	
	Nokia.ring();
	Nokia.vibrate();
	Nokia.makeNoise();
	
	
	
	

	}

}
