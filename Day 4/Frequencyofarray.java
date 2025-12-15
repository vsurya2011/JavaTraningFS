public class Frequencyofarray {
    public static void main(String[] args){
        int a[] ={ 1,2,2,3,4,5,5,6,7,7,8,1};
        boolean[] isVisited=new boolean[a.length];
        for (int i=0;i<a.length;i++){
            if(isVisited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    isVisited[j]=true;
                }
            }
            if(count>0){
                System.out.println(a[i]+" - "+count);
            }
        }

    }
    
}
