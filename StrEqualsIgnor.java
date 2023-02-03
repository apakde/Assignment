package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrEqualsIgnor {
    public static void main(String[] args) {
        Scanner newsc = new Scanner(System.in);
        System.out.println("Enter two string:");
        String str1= newsc.nextLine();
        String str2= newsc.nextLine();
        System.out.println("String 1 and 2 are equal ignoring case?:"+ str1.equalsIgnoreCase(str2));
    }
}
//OUTPUT-
//Enter two string:
//JAVA
//java
//INPUT-
//String 1 and 2 are equal ignoring case?:true