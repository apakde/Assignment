package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrTrim {
    public static void main(String[] args) {
        Scanner newa=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=newa.nextLine();
        String s2="java";
        System.out.println(s1.trim()+s2);
    }
}
//INPUT-
//Enter a string:
//hello string
//OUTPUT-
//hello stringjava