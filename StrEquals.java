package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrEquals {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = newscan.nextLine();
        String s2 = newscan.nextLine();
        System.out.println("S1 is equal to S2?:"+s1.equals(s2));
    }
}
//INPUT-
//Enter two strings:
//hello
//help
//OUTPUT-
//S1 is equal to S2?:false