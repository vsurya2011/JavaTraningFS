public class Gothreen {
    public static void main(String[] args) {
        int a=5, b=10, c=15;
        if((a>b)&&(b>c)) {
            System.out.println("a is greater than b and c");
        } else if((b>c)&&(b>a)) {
            System.out.println("b is greater than a and c");
        } else {
            System.out.println("c is greatest");
        }
    }
}