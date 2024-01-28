package from.ant;

public class Rank_0382_1 {
    public int countKeyChanges(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        char temp = Character.toLowerCase(chars[0]);
        int res = 0;
        for (char aChar : chars) {
            if (Character.toLowerCase(aChar) != temp) {
                res++;
            }
            temp = Character.toLowerCase(aChar);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Rank_0382_1().countKeyChanges("AaAaAaaA"));
    }
}
