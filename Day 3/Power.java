// import java.util.Scanner;
// public class Power{
//     public static void main(String[] args){
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter the base number:");
//     int base= sc.nextInt();
//     System.out.println("Enetr the power number:");
//     int power= sc.nextInt();
//     int result=1;
//     for(int i=1;i<=power;i++){
//         result=result*base;
//     }
//     System.out.println(base+" raised to the power "+power+" is: "+result);
// }
// }
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base number:");
        double base= sc.nextInt();
        System.out.println("Enetr the power number:");
        int power= sc.nextInt();
        double box=1;
        if(power < 0){
            base = 1/base;
            power = -power;
        }
        if(power ==0){
            System.out.println(box)
        }
    }
}