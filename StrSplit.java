package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrSplit {
    public static void main(String[] args) {
        Scanner new1=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=new1.nextLine();
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
//INPUT-
//Enter a string:
//My name is Khan
//OUTPUT-
//My
//name
//is
//Khan