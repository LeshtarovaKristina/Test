package Class16;
/* Task 1:
Create a String that will hold a sentence. Write a program to get a new String without any spaces.
 */
public class Task1 {
    public static void main(String[]args){
        String s="This is a sentance";
        String newStr=s.replace(" ","");
        System.out.println(newStr);


        /*Tak2:
Create a String that should be combination of letters, numbers and special characters.
Find out how many Alphanumeric characters are there in the String.
         */
        String s1="1234eyuetehADS123";
        System.out.println(s1.replaceAll("[^A-Za-z0-9]", "").length());
    }
}
