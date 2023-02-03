package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrIndexOf {
    public static void main(String[] args) {
        Scanner n2=new Scanner(System.in);
        System.out.println("Enter a string and a substring:");
        String s1=n2.nextLine();
        String s2=n2.nextLine();
        int index=s1.indexOf(s2);
        System.out.println("Index of substring:"+index);
    }
}
//INPUT-
//Enter a string and a substring:
//This is intellij for Java
//for
//OUTPUT-
//Index of substring:17