package from.ant;

//8 10 ->40
public class Pro_3021 {
    public long flowerGame(int n, int m) {
        long oddN = (n + 1) / 2;
        long evenN = n / 2;
        long oddM = (m + 1) / 2;
        long evenM = m / 2;
        return oddN * evenM + oddM * evenN;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_3021().flowerGame(10000, 10000));
    }
}
