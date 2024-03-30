package from.ant;

public class Pro_1551 {

    public int minOperations(int n) {
        int sum = n * n;
        int avg = sum / n;
        int stepCount = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 2 * i - 1;
            if (temp >= avg) {
                break;
            }
            stepCount += (avg - temp);
        }
        return stepCount;
    }
}
