package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrConcat {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter two strings to concatenate:");
        String s1= new1.nextLine();
        String s2=new1.nextLine();
        s1=s1.concat(s2);
        System.out.println(s1);
    }
}

//INPUT:-
//Enter two strings to concatenate:
//Sachin
//Tendulkar
//OUTPUT-
//SachinTendulkar