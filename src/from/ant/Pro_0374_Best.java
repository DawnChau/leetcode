package from.ant;

public class Pro_0374_Best {

    int pick = 6;

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = start + (end - start) / 2;
        int ans = guess(mid);
        while (ans != 0) {
            if (ans == -1) {
                end = mid;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
            ans = guess(mid);
        }
        return mid;
    }

    int guess(int num) {
        if (num == pick) {
            return 0;
        }

        if (num > pick) {
            return -1;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0374_Best().guessNumber(10));
    }
}
