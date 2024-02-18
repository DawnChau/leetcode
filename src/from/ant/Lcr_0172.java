package from.ant;

public class Lcr_0172 {

    public int countTarget(int[] scores, int target) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                count++;
            }
        }
        return count;
    }
}
