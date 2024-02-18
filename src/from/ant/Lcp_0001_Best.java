package from.ant;

public class Lcp_0001_Best {
    public int game(int[] guess, int[] answer) {
        int res = 0;
        int left = 0;
        int right = guess.length - 1;
        while (left <= right) {
            if (left == right) {
                res += (guess[right] == answer[right] ? 1 : 0);
            }else{
                res += (guess[right] == answer[right] ? 1 : 0);
                res += (guess[left] == answer[left] ? 1 : 0);
            }
            left++;
            right--;
        }
        return res;
    }
}
