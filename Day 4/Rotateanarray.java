// import java.util.Scanner;

// public class Rotateanarray{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the square matrix: ");
//         int n = sc.nextInt();
//         int[][] matrix = new int[n][n];
//         System.out.println("Enter elements of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Original Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         int[][] rotatedMatrix = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 rotatedMatrix[j][n - 1 - i] = matrix[i][j];
//             }
//         }
//         System.out.println("Rotated Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(rotatedMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
import java.util.Scanner;
import java.util.Arrays;
public class Rotateanarray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int a[] =new int[size];
        for (int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        if(k % size !=0){
        for(int j=0;j<k;j++){
            int first = a[0];
            for(int i=0;i<size-1;i++){
                a[i]=a[i+1];
            }
            a[size-1]=first;
        }
        }
        System.out.println(Arrays.toString(a));
    }
}