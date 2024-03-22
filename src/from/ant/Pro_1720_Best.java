package from.ant;

public class Pro_1720_Best {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            res[i + 1] = encoded[i] ^ res[i];
        }
        return res;
    }
}
