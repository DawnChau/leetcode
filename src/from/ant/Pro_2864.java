package from.ant;

public class Pro_2864 {
    public String maximumOddBinaryNumber(String s) {
        int oneCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            } else {
                zeroCount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < oneCount-1; i++) {
            sb.append('1');
        }
        for (int i = 0; i < zeroCount; i++) {
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}
