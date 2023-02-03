package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrReplace {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter a string and substring to replace a word:");
        String s1=n1.nextLine();
        String s2=n1.nextLine();
        String replace=s1.replace("is",s2);
        System.out.println(replace);
    }
}
//INPUT-
//Enter a string and substring to replace a word:
//My name is John
//was
//OUTPUT-
//My name was John