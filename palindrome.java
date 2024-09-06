import java.util.*;
import java.io.*;

public class Palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        if (sbr.toString().equals(str)) {
            System.out.print("The given string is a plaindrome");
        } else {
            System.out.print("The given string is not a palindrome");
        }
    }

}