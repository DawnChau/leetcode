package from.ant;

public class Pro_2894_Best {

    public int differenceOfSums(int n, int m) {

        int notDivide = 0;
        int divied = 0;
        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                divied+=i;
            } else {
                notDivide+=i;
            }
        }
        return notDivide - divied;
    }
}
