package Class16;

public class Task5 {
    public static void main(String[] args) {
        /*Task 5:
   How would you check if String is palindrome or not? aba=> true
                                                       Abbc =>false
 */
        Task5 task=new Task5();
        System.out.println(task.isPalindrome("abv"));
        System.out.println(task.isPalindrome("Abbc"));

    }

    boolean isPalindrome(String inputStr) {
        String reversedStr=reverseString(inputStr);//reversing a word
        return reversedStr.equals(inputStr);//checking if words are the same



    }
    String reverseString(String inputString) {
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
