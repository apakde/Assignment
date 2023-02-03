package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrIntern {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=n1.nextLine();
        String s2=s1;
        String s3=s1.intern();
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
//INPUT-
//Enter a string:
//helloo
//OUTPUT-
//true
//true