package class14;

public class StringDemo1 {

	public static void main(String[] args) {
		String name="Shahima";//Awlays use this one it is shorter
		
		String name2=new String("Shahima");
		
		System.out.println(name);
		System.out.println(name2.length());
		
		System.out.println(name.length());//this formula calculates how many letters there are in the name Shahima!
		
		System.out.println("*********************************");
//Example 2:
		
		String name1=new String("SHASHIMA in all uppercase ");
		String newName=name1.toLowerCase();
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
		System.out.println(name+name2);//you should always prefer this method to perform concatenation
        System.out.println(name.concat(name2));
        name="";
        System.out.println(name.isEmpty());
        //System.out.println(name.isBlank()); doesn't work because java is not updated!The output will be False
        
}
}