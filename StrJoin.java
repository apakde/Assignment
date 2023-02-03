package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrJoin {
    public static void main(String[] args) {
        Scanner n3=new Scanner(System.in);
        System.out.println("Enter 3 strings to join:");
        String s1=n3.nextLine();
        String s2=n3.nextLine();
        String s3=n3.nextLine();
        String joinStr=String.join("-",s1,s2,s3);
        System.out.println(joinStr);
    }
}
//INPUT-
//Enter 3 strings to join:
//this
//is
//java
//OUTPUT-
//this-is-java