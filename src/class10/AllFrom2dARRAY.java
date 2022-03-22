package class10;

public class AllFrom2dARRAY {

	public static void main(String[] args) {
		String[][] food= {
				
				{"RedBull","Burger","Steak","Fries"},
				{"Curry","Biriyani","Butter chicken"},
				{"Noodles","Pad thai","Tom yum"},
				{"pizza","pasta"}
	};
		//iterates over every array/ row
		for(int row=0; row<food.length; row++) {
			
			//iterate over every column of specified row 
			
			for (int col=0; col<food[row].length; col++) {
				
				//accessing elements
				System.out.println(food[row][col]);
			}
			
		}
          System.out.println("      ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP      ");
          //outer loops over each array inside 2D Array
          for(String[] cousine:food) {
        	  
        	  //inner loop over each element from selected array
        	  for(String f:cousine) {
        		  System.out.println(f+" ");
        	  }
        	  System.out.println();
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
	}

}
