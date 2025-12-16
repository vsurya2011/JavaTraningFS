public class Sortzeroontwo {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2, 1, 0};
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }

        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// import java.util.Arrays;
// public class SortZeroOneTwo {
//     public static void main(String[] args) {
//          int a[]={0,2,1,2,0,1};
        // int c0=0,c1=0,c2=0;
        // for (int i=0;i<a.length;i++)
        // {
        //     if(a[i]==0)
        //     {
        //         c0++;
        //     }else if(a[i]==1)
        //     {
        //         c1++;
        //     }else{
        //         c2++;
        //     }
        // }
        // for(int i=0;i<c0;i++)
        // {
        //     a[i]=0;
        // }
        // for(int i=c0;i<c0+c1;i++)
        // {
        //     a[i]=1;
        // }
        // for(int i=c0+c1;i<a.length;i++)
        // {
        //     a[i]=2;
        // }
        // System.out.println(Arrays.toString(a));

        //Dutch national flag alg
    //     int low=0,mid=0,high=a.length-1;
    //     while(mid<=high)
    //     {
    //         if(a[mid]==0)
    //         {
    //             int temp=a[low];
    //             a[low]=a[mid];
    //             a[mid]=temp;
    //             low++;
    //             mid++;

    //         }else if(a[mid]==1){
    //             mid++;
    //         }else{
    //             int temp=a[high];
    //             a[high]=a[mid];
    //             a[mid]=temp;
    //             high--;
    //         }

    //     }
    //     System.out.println(Arrays.toString(a));
    // }
    
// }