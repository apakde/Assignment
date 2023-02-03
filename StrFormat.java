package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrFormat {
    public static void main(String[] args) {
        String str1 = String.format("%d", 21);
        String str2 = String.format("%s", "Hello Java");
        String str3 = String.format("%f", 12.12);
        String str4 = String.format("%x", 231);
        String str5 = String.format("%c", 'h');
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
//OUTPUT-
//21
//Hello Java
//12.120000
//e7
//h