package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrToUppercase {
    public static void main(String[] args) {
        Scanner news=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=news.nextLine();
        String upper=s1.toUpperCase();
        System.out.println(upper);
    }
}
//INPUT-
//Enter a string:
//camel
//OUTPUT-
//CAMEL