package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrEndsWith {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1= new1.nextLine();
        System.out.println("String ends with 't':"+s1.endsWith("t"));
        System.out.println("String ends with 's':"+s1.endsWith("s"));
    }
}
//INPUT-
//Enter a string:
//Computers
//OUTPUT-
//String ends with 't':false
//String ends with 's':true