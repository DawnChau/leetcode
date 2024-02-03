package from.ant;

public class Pro_3019 {
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
        System.out.println(new Pro_3019().countKeyChanges("AaAaAaaA"));
    }
}
