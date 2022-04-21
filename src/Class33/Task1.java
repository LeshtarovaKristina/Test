package Class33;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
How would I handle InputMismatchException? Input Mismatch
Exception where user enters mismatch value then programmer expected
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(scanner.nextInt());
        }catch(InputMismatchException inputMismatchException){
            System.out.println("Please enter the correct type of data");
        }
    }
}
