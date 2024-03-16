package from.ant;

public class Pro_1689 {
    public int minPartitions(String n) {
        int res = 0;
        char[] ch = n.toCharArray();
        for (char c : ch) {
            res = Math.max(c - '0', res);
        }
        return res;
    }
}
