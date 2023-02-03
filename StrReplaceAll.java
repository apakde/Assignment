package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrReplaceAll {
    public static void main(String[] args) {
        Scanner nn=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=nn.nextLine();
        String replaceString=s1.replaceAll("a","e");
        System.out.println(replaceString);
    }
}
//INPUT-
//Enter a string:
//Java is a progamming language
//OUTPUT-
//Jeve is e progemming lenguege