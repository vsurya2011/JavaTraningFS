public class Minvalarr {
    public static void main(String[] args){
        int a[]={90,23,45,67,25};
        int min=a[0];
        int max=a[0];
        //iterate
        for(int i=0; i < a.length;i++){
            if (a[i]< min){
                min = a[i];
            }
            else if(a[i]> max){
                max = a[i];
            }
        }
        System.out.println(min+" is the min value and "+max+" is the max value");
    }
}
