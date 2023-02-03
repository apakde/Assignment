package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrStartsWith {
    public static void main(String[] args) {
        Scanner new1=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=new1.nextLine();
        System.out.println("String starts with 'A'?:"+s1.startsWith("A"));
        System.out.println("String starts with 'J'?:"+s1.startsWith("J"));
    }
}
//INPUT-
//Enter a string:
//Abra-cadabra
//OUTPUT-
//String starts with 'A'?:true
//String starts with 'J'?:false