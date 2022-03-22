package class13;

public class Task1 {
	//create a method that takes a person name and an animal name
		//if person name "Teyfur" and if animal is "Horse" it returns us "camel"
	
	String returnTheSameName(String name,String animalName) {
		if("Teyfur".equalsIgnoreCase(name)&&"Horse".equalsIgnoreCase(animalName)) {
		return "Camel";
	}else if("Horse".equals(animalName)) {
		return"Horse";
	}else {
		return "I don't know!";
	}
}
	public static void main(String[] args) {
        Task1 obj=new Task1();
        System.out.println(obj.returnTheSameName("Teyfur","Horse"));
        System.out.println(obj.returnTheSameName("Kristina","Cat"));

	}

}
