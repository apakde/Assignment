package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrGetChar {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = n1.nextLine();
        char[] ch = new char[10];
        try{
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}
    }
}
//INPUT-
//Enter a String:
//Hello Javatpoint.This is intellij
//OUTPUT-
//Javatpoint