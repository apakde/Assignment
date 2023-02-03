package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrCharat {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = new1.nextLine();
        char ch = name.charAt(4);
        System.out.println("Character at 4 is:"+ch);
    }
}

//INPUT
//Enter a string:
//Hello Java
//OUTPUT-
//Character at 4 is:o