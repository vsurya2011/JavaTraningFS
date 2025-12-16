public class PatternletQ {
    public static void main(String[] args){
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(j==0&&i!=5||j==4&&i!=5||i==0&&j!=5||i==4&&j!=5||i==5&&j==5||i==3&&j==3||i==2&&j==2)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}