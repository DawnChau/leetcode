package from.ant;

public class Lcr_0182 {
    public String dynamicPassword(String password, int target) {
        char[] chars = password.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = target; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        for (int i = 0; i < target; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
