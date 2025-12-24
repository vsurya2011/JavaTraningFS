public class Finalvaluevariable {
    public int FinalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String op : operations) {
            if (op.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
} 
    

