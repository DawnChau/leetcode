package from.ant;

public class Pro_1281_Best {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);

        int multi = 1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int sinlge = s.charAt(i) - '0';
            multi *= sinlge;
            sum += sinlge;
        }
        return multi - sum;
    }
}
