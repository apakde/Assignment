package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrCharAt {
    public static void main(String[] args) {
        Scanner news = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1= news.nextLine();
        char ch = s1.charAt(4);
        System.out.println("Character at position 4 is:"+ch);
    }
}
//INPUT-
//Enter a string:
//Hello Java
//OUTPUT-
//Character at position 4 is:o