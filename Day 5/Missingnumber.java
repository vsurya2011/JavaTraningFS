
public class Missingnumber {
    public static void main(String[] args){
        int N=5;
        int a[]={1,2,4,5};
        int Sum=N*(N+1)/2;
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        System.out.println(Sum-sum1);
    }
    
}