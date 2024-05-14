package from.ant;

public class Pro_1572_Best {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            mat[i][i] = 0;
            sum += mat[i][mat[0].length - 1 - i];
        }
        return sum;
    }
}
