import java.util.Scanner;
import java.util.Arrays;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of R and C:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int k=0;k<r;k++){
            for(int j=0;j<c;j++){
                b[k][j]=sc.nextInt();
            }
        }
        int mul[][]=new int[r][c];
        for(int k=0;k<r;k++){               
            for(int j=0;j<c;j++){
                mul[k][j]=0;
                for(int l=0;l<c;l++){
                    mul[k][j]+=a[k][l]*b[l][j];
                }
            }   
        }
        System.out.println("Multiplication of two matrix is:");
        for(int k=0;k<r;k++){
            for(int j=0;j<c;j++){
                System.out.print(mul[k][j]+" ");
            }
            System.out.println();
        }
    }   
}   