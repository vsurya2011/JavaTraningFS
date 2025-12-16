// product of matrix
import java.util.Arrays;
public class Fifthday {
    public static void main(String[] args){
        int a[]={1,2,3};
        int b[]={1,2,3,4,5};
        int max=(a.length > b.length)? a.length : b.length;
        int c[] = new int[max];
        int min=(a.length < b.length)? a.length : b.length;
        for(int i=0;i<min;i++){
            c[i]=a[i]*b[i];
        }
        for(int i=min;i<max;i++){
            if(a.length > b.length){
                c[i]=a[i];
            }else if(b.length > a.length){
                c[i]=b[i];
            
            }
            
        }
        System.out.println(Arrays.toString(c));
    }
}
        // Method
    //     public class Hello {
    // public static void main(String[] args) {

        //write a program to sort 0's 1's and 2's
        //write a program to find the missing number
        //write a program to find the single element in an array but the array consist of duplicate elements but 1 element appears once
        //Write a program to find the target two sum.




        //Methods:
            /*
        
             1.Static method --> only main method
             2.Non - Static method
            */

            //void --> no need to return a value

        //Variables:
              /*
                  1.local variables
                  2.static variables
                  3.instance variables 
             */
        //instance variables:
            //AKA Global variables/fields
            //can be used anywhere once declered once
            // int a; --> default value =0
            // String name; --> default value=null
        
//     }
    
// }