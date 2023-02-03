package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrLastIndex {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=n.nextLine();
        int index=s1.lastIndexOf('a');
        System.out.println("Character 'a' is last present at:"+index);
    }
}
//INPUT-
//Enter a string:
//java is a language
//OUTPUT-
//Character 'a' is last present at:15