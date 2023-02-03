package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrToLowercase {
    public static void main(String[] args) {
        Scanner news=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=news.nextLine();
        String lower=s1.toLowerCase();
        System.out.println(lower);
    }
}
//INPUT-
//Enter a string:
//CAMEL
//OUTPUT-
//camel