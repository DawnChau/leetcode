package from.ant;

public class Pro_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations) {
            if (operation.equals("--X") || operation.equals("X--")) {
                res--;
            } else if (operation.equals("++X") || operation.equals("X++")) {
                res++;
            }
        }
        return res;
    }
}
