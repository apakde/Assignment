package Assignment_ARRAYS.Assignment;

import java.util.Scanner;

public class StrCompareTo {
    public static void main(String[] args) {
        Scanner news = new Scanner(System.in);
        System.out.println("Enter two strings to compare:");
        String s1 = news.nextLine();
        String s2 = news.nextLine();
        System.out.println(s1.compareTo(s2));
    }
}

//INPUT -
//Enter two strings to compare:
//Hello
//Hellp
//OUTPUT -
//-1