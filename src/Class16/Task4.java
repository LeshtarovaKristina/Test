package Class16;

public class Task4 {
    public static void main(String[]args) {
        /*Task4:
         How would you reverse a String word by word? for example
		// input=>"Sunday is great"
		// output=>taerg si yadnuS
*/
        //One way:
        // String s="Sunday is great";
        //String [] strArray=s.split(" ");
        //for (int i=0; i<strArray.length; i++){
        //System.out.println(task4.reverseString(strArray[i]+" "));

        String s = "Sunday is great";
        Task4 task4 = new Task4();
        //System.out.println(task4.reverseString(s));

        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(task4.reverseString(strArray[i] + " "));
        }
    }
        String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
          StringBuilder stringBuilder=new StringBuilder(inputString);
          stringBuilder.reverse();
          return stringBuilder.toString();
    }
}
