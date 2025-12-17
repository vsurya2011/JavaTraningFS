import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
public class CountVowels {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // //System.out.println("Enter a string:");
        // int a=sc.nextInt();
        // sc.nextLine();
        // String s=sc.nextLine();
        // System.out.println(a+" "+s);
     
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word:");
        String str=sc.nextLine();
        int count = 0;
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
    
