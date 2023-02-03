package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrIsEmpty {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=n1.nextLine();
        System.out.println("String is empty?:"+s1.isEmpty());
    }
}
//INPUT-
//Enter a string:
//Hello
//OUTPUT-
//String is empty?:false