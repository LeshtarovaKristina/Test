package class15;

public class StringDemo3 {

	public static void main(String[] args) {
		String name="How @you @guys Camel";
     System.out.println(name.indexOf("@"));
     System.out.println(name.indexOf("Horse"));
     
     //advance we can ignore it for naow
     System.out.println(name.indexOf("@",8+1));//ignores everything up to @ and starts counting after that !
     System.out.println(name.indexOf("@",name.indexOf("@")+1));
	}

}
