package class13;

public class MethodsDemo2 {
//create a method that takes an animal name and person name if name equals to
	//Teyfur and animal is Horse, print camel otherwise print horse
	
	void TeyfurAndHorse(String personName,String animalName) {
		if ("Teyfur".equals(personName) && "Horse".equals(animalName)) {
			System.out.println("This is a Camel");
		}else {
			System.out.println("This is a Horse");
		}
		
	}
	
	public static void main(String[] args) {
		
       MethodsDemo2 obj=new MethodsDemo2();
       obj.TeyfurAndHorse("Teyfur","Horse");
       obj.TeyfurAndHorse("Tarik","Horse");
       
	}

}
