package from.ant;

public class Pro_1605_Best {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] ans = new int[rowSum.length][colSum.length];

        int i = 0;
        int j = 0;

        while (i < rowSum.length && j < colSum.length) {
            ans[i][j] = Math.min(rowSum[i], colSum[j]);
            rowSum[i] -= ans[i][j];
            colSum[j] -= ans[i][j];
            if(rowSum[i] == 0){
                i++;
            }
            if(colSum[j] == 0){
                j++;
            }
        }

        return ans;
    }
}
