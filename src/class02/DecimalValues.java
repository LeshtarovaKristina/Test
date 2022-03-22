package class02;

public class DecimalValues {

	public static void main(String[] args) {
		double A1=100;
		double A2=3;
		
		double sum=A1+A2;
		double sub=A1-A2;
		double div=A1-A2;
		double mul=A1*A2;
		
		
		System.out.println("The"+" "+"summery of 2 numbers"+" "+A1+" and "+A2+" "+"is equal to"+" "+sum);
		System.out.println("The"+" "+"subtract of 2 numbers"+" "+A1+" and "+A2+" "+"is equal to"+" "+sub);
		System.out.println("The"+" "+"division of 2 numbers"+" "+A1+" and "+A2+" "+"is equal to"+" "+div);
		System.out.println("The"+" "+"multiply of 2 numbers"+" "+A1+" and "+A2+" "+"is equal to"+" "+mul);
		
		//Task 2
		double A3=3.9d;
		double square=A3*A3;
		
		System.out.println("The square of"+A3+"is"+square);
		
		//Task 3
		int width=5;
		int height=8;
		
		int perimeter=2*(width+height);
		int area=width*height;
		
		System.out.println("The perimeter of a ractangle with width"+width+ "and height"+perimeter+"and the area is"+area);
	}

}
