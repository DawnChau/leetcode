package from.ant;

public class Lcr_0128_Best {

    public int stockManagement(int[] stock) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < min) {
                min = stock[i];
            }
        }
        return min;
    }
}
