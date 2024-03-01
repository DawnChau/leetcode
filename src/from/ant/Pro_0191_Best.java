package from.ant;

public class Pro_0191_Best {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // 兼容负数场景
            if (n % 2 == 1 || n % 2 == -1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0191_Best().hammingWeight((int) Long.parseLong("11111111111111111111111111111101", 2)));
    }
}
