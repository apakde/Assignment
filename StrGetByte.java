package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrGetByte {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter a series of alphabets:");
        String s1=n1.nextLine();
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
    }
}
//INPUT-
//Enter a series of alphabets:
//GHIJ
//OUTPUT-
//71
//72
//73
//74