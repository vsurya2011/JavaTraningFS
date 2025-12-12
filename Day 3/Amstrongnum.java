import java.util.Scanner;
public class Amstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:"); 
         int n=sc.nextInt();
         int num = n;
         int sum = 0;
         int digits = 0;
        
         while (n != 0) {
             n /= 10;
             digits++;
         }
         n = num; 
         while (n != 0) {
             int digit = n % 10;
             sum += Math.pow(digit, digits);
             n /= 10;
         }
         
         if (sum == num) {
             System.out.println(num + " is an Armstrong number.");
         } else {
             System.out.println(num + " is not an Armstrong number.");
         }
    }
}
