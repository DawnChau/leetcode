package from.ant;

public class Pro_1476 {
}

class SubrectangleQueries {

    private int[][] rectangle = null;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                this.rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }
}
