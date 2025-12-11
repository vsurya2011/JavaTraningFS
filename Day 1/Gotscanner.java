import java.util.Scanner;

public class Gotscanner {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number: ");  
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number:");
        int c = sc.nextInt();
        if(a > b && a > c) { 
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if(b > a && b > c) {
            System.out.println(b + " is greater than " + a + " and " + c);
        } else {
            System.out.println(c + " is greater than " + a + " and " + b);
        }
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
