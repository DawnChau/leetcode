package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_0202 {

    public boolean isHappy(int n) {
        Set<Long> longs = new HashSet<>();

        long temp = n;
        while (temp != 1 && !longs.contains(temp)) {
            longs.add(temp);
            temp = getRes(temp);
        }
        return temp == 1L;
    }

    private long getRes(long temp) {
        long sum = 0;
        while (temp != 0) {
            long digit = temp % 10;
            sum += digit * digit;
            temp = temp / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0202().isHappy(2));
    }
}
