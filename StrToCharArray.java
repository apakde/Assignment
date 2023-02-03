package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrToCharArray {
    public static void main(String[] args) {
        Scanner news=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1= news.nextLine();
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++) {
            System.out.print(ch[i]+" ");
        }
    }
}
//INPUT-
//Enter a string:
//javatpoint
//OUTPUT-
//j a v a t p o i n t