package from.ant;

public class MianShi_0106 {
    public String compressString(String S) {
        if(S.length() == 0){
            return S;
        }
        char[] ch = S.toCharArray();

        int count = 1;
        StringBuilder sb = new StringBuilder();
        Character cur = ch[0];
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == cur) {
                count++;
            } else {
                sb.append(cur);
                sb.append(count);
                count = 1;
                cur = ch[i];
            }
        }
        sb.append(cur);
        sb.append(count);

        if (sb.length() < S.length()) {
            return sb.toString();
        } else {
            return S;
        }
    }

    public static void main(String[] args) {
        System.out.println(new MianShi_0106().compressString("aabcccccaa"));
    }
}
