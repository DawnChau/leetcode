package from.ant;

public class Pro_1672_Best {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int cnt = 0;
            for (int i1 : accounts[i]) {
                cnt += i1;
            }
            max = Math.max(cnt, max);
        }
        return max;
    }
}
