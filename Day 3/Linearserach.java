public class Linearserach {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        int target=70;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in the array");
        }
    }
}
//time complexity: O(n)