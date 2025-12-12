import java.util.Arrays;
import java.util.Scanner;
public class Thirdday {
    public static void main(String[] args) {
        //1.Arrays:
        // collection of similar data items
        // easy to declere once than multiple elements
        // need to use import java.util.Arrays; for some functions
        // Decleration:
        int[] arr={2,4,6,8,10};
        int len=arr.length;
        System.out.println(arr[0]); // to print a single element

        for(int i=0; i< len; i++){          //to print all the values of an array
            System.out.println(arr[i]);
        }

        System.out.println(arr); // to print the address [I@251a69d7

        for(int value:arr){            //for each loop
            System.out.println(arr);
        }

        System.out.println(Arrays.toString(arr));     //    for printing the whole

        // to take from the user

        int n=5;
        int[] arra=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n ; i++){
            arra[i]=sc.nextInt();
        }
        //sc.close();

        System.out.println(Arrays.toString(arra)); 


        //size of an array cannot be :
        // 0 , negative (-1), "a"

        // program to give even numbers
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0; i<size ; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The even Numbers are:");
        for(int i=0; i<size ; i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }


    }
    
}