package from.ant;

public class Pro_0067 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int size = Math.max(a.length(), b.length());
        int upgrade = 0;

        for (int i = 0; i < size; i++) {
            int a1 = 0;
            int b1 = 0;

            if (a.length() - i - 1 >= 0) {
                a1 = a.charAt(a.length() - i - 1) - '0';
            }

            if (b.length() - i - 1 >= 0) {
                b1 = b.charAt(b.length() - i - 1) - '0';
            }

            int res = a1 + b1 + upgrade;
            sb.append(res % 2);
            upgrade = (res / 2);
        }
        if (upgrade == 1) {
            sb.append(upgrade);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0067().addBinary("11", "1"));
    }
}
