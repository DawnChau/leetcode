package from.ant;

public class Pro_0059_Best {

    public int[][] generateMatrix(int n) {
        int[][] instruction = new int[][]{
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };

        int[][] matrix = new int[n][n];
        int x = 0;
        int y = 0;
        int direction = 0;
        for (int i = 1; i <= n * n; i++) {
            matrix[x][y] = i;
            int newX = x + instruction[direction % 4][0];
            int newY = y + instruction[direction % 4][1];
            // 该转向了
            if (newX < 0 || newX >= n || newY < 0 || newY >= n || matrix[newX][newY] != 0) {
                direction++;
                newX = x + instruction[direction % 4][0];
                newY = y + instruction[direction % 4][1];
            }

            x = newX;
            y = newY;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0059_Best().generateMatrix(3));
    }
}
