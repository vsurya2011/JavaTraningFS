import java.util.Arrays;
public class Binarysearch {
    public static void main(String[] args) {
        int[] a={34,12,5,67,23,89,2};
        Arrays.sort(a);
        boolean isFound=false;
        int k=23;
        int low=0, high = a.length-1;
        while(low<=high){
            int mid=low+(high-low/2);
            if(a[mid]==k){
                isFound=true;
            }
            else if(a[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        if(isFound){
            System.out.println("Element found in the array");
        }
        
    }
}
