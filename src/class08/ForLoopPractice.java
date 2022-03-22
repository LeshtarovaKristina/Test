package class08;

public class ForLoopPractice {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
            System.out.println(" MULTIPLICATION TABLE ");
            
            /* 3X1=3
             * 3X2=6
             * 3X3=9
             * 
             * 
             * 3x =30
             */
            
            int num=3;
            int result;
            
            for(int i=1; i<=10; i++) {
            	result=num*i;
            	System.out.println(num+" x "+i+" = "+result);
            }
            
                System.out.println("-WHAT IS THE OUTPUT?-");
            
            for (int i=0; i<=10;i+=3) {
            	System.out.println(i+" ");
            }
            
               System.out.println("-WHAT IS THE OUTPUT?-");
            
            int sum=0;
            
            for (int i=1; i<=5; i++) {
            	sum+=i;//sum=sum+i
            
               //System.out.println(sum) - if syso is inside the block of code 
                                        // we are getting 5 answers
            System.out.println(sum);//if syso is outside the block of code, answer is only 1
            
            }
            System.out.println("-What is the output?-");
            
           int value=1;
           
           for (int i=1; i<4; i++) {
        	   value*=i;
           }
           System.out.println(value);
            
            System.out.println("-----------------------------------------");
            /*
             * I want to find out the sum of all even and all
             * odd numbers from the range 1 to 50
             */
            
            //even:
            int summEven=0;
            int sumOdd=0;
            
        for(int i=1; i<=50; i++) {
        	if (i%2==0) {
        		summEven=summEven+i;
        		
        	//odd:	
        	}else {
        		sumOdd=sumOdd+i;
        	}
        }
        System.out.println("The sum of all even numbers is "+summEven+
        		" and the sum of all odd numbers is "+sumOdd);    
	}

}
