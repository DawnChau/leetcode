package from.ant;

public class Pro_1442 {
    public int countTriplets(int[] arr) {
        int ans = 0;


        for (int k = 1; k < arr.length; k++) {
            for (int i = 0; i < k; i++) {
                int a = arr[i];
                int b = calcXOR(arr, i + 1, k);
                for (int j = i + 1; j <= k; j++) {
                    if (a == b) {
                        ans++;
                    }
                    a ^= arr[j];
                    b ^= arr[j];
                }
            }
        }
        return ans;
    }

    private int calcXOR(int[] arr, int start, int end) {
        int res = 0;
        for (int i = start; i <= end; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
