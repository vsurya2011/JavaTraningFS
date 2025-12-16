import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:"); 
         int n=sc.nextInt();
        int count = 0;
        if (n == 0) {
            System.out.println("The number " + n + " has 1 digit.");
            return; 
        }
        if (n < 0) {
            n = -n;
        }
        while (n != 0) {
            n /= 10; 
            count++;  
        }

        System.out.println("Number of digits: " + count);
    }
}
