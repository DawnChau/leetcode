package from.ant;

public class Pro_1409 {
    public int[] processQueries(int[] queries, int m) {
        int[] mArray = new int[m];
        for (int i = 1; i <= m; i++) {
            mArray[i - 1] = i;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = find(mArray, queries[i]);
            ans[i] = index;
            adjest(index, mArray);
        }
        return ans;
    }

    private void adjest(int index, int[] mArray) {
        int temp = mArray[index];
        for (int i = index; i > 0; i--) {
            mArray[i] = mArray[i - 1];
        }
        mArray[0] = temp;
    }

    private int find(int[] mArray, int query) {
        for (int i = 0; i < mArray.length; i++) {
            if (mArray[i] == query) {
                return i;
            }
        }
        return -1;
    }
}
