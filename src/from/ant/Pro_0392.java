package from.ant;

public class Pro_0392 {
    public boolean isSubsequence(String s, String t) {

        int leftS = 0;
        int leftT = 0;
        int rightS = s.length() - 1;
        int rightT = t.length() - 1;
        while (leftS <= rightS && leftT <= rightT) {
            if (leftT == rightT && leftS != rightS) {
                return false;
            }
            if (t.charAt(leftT) == s.charAt(leftS)) {
                leftS++;
            }
            if (t.charAt(rightT) == s.charAt(rightS)) {
                rightS--;
            }
            leftT++;
            rightT--;
        }
        return leftS > rightS;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0392().isSubsequence("bb", "hbd"));
    }
}
