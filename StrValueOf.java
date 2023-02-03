package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrValueOf {
    public static void main(String[] args) {
        Scanner nws = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = nws.nextInt();
        String s1=String.valueOf(a);
        System.out.println(s1+10);
    }
}
//INPUT-
//Enter an integer:
//45
//OUTPUT-
//4510