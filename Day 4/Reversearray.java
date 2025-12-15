import java.util.Scanner;
public class Reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
/* int a[]={1,2,3,4,5};
int start =0,end=a.length-1;
while(start<end)
{
int temp=a[start];
a[start]=a[end];
a[end]=temp;
start++;
end--;
}
S;ystem.out.println(Arrays.toString(a)); */