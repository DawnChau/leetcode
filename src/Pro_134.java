/**
 * 计算加油能否跑完一圈
 */
public class Pro_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int remain = 0;
        int debt = 0;

        for (int i = 0; i < gas.length; i++) {
            remain += gas[i] - cost[i];
            if (remain < 0) {
                debt += remain;
                start = i + 1;
                remain = 0;
            }
        }
        return remain + debt >= 0 ? start : -1;
    }
}
