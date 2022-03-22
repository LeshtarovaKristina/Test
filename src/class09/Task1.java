package class09;

public class Task1 {

	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		//WAY 1
       char[] grade= new char[6];
       grade[0]='A';
       grade[1]='B';
       grade[2]='C';
       grade[3]='D';
       grade[4]='E';
       grade[5]='F';
       
       System.out.println(grade[1]);
       
       //WAY2
       char[] grade1= {'A', 'B', 'C', 'D', 'E', 'F'};
       
       //how many elements inside array?
       int size=grade1.length;//4 
       System.out.println("Number of elements is = "+size);
       
       //System.out.println(grade1[1]);
       
       for(int i=0; i<grade.length; i++) {
    	   
    	   System.out.print(grade[i]+" ");
       }
       System.out.println("-----------------------------");
       
       
      String[] cities= {"Washington","Boston", "Miami", "Los Angeles", "New York"};
      
      //always use< or >, not <= or >=
      
      //if value is Miami--> I want to live in Miami
      for (int a=0; a<cities.length; a++) {
    	  
    	  System.out.println(cities[a]+" ");
    	  
    	  if(cities[a].equals("Miami"))
    		  System.out.println("I want to live in Miami.");
      }
    		  
       
	}

}
