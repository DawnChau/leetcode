package from.ant;

public class Pro_0861_Best {
    public int matrixScore(int[][] grid) {

        // 第一列不是1的都进行翻转
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                flip(grid[i]);
            }
        }

        // 如果这一列1比0少，翻转
        for (int i = 0; i < grid[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < grid.length; j++) {
                sum += grid[j][i];
            }
            if (sum < (grid.length + 1) / 2) {
                for (int j = 0; j < grid.length; j++) {
                    if (grid[j][i] == 0) {
                        grid[j][i] = 1;
                    } else {
                        grid[j][i] = 0;
                    }
                }
            }
        }

        // 求和
        int totalSum = 0;
        int factor = 1;
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = 0; j < grid.length; j++) {
                sum += grid[j][i];
            }
            totalSum += (sum * factor);
            factor *= 2;
        }
        return totalSum;
    }

    private void flip(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }
}
