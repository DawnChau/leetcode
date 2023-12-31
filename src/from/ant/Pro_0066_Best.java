package from.ant;

public class Pro_0066_Best {
    public int[] plusOne(int[] digits) {

        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[i]++;
            }

            digits[i] = digits[i] + carry;

            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;

        }
        if (carry == 0) {
            return digits;
        } else {
            int[] res = new int[digits.length + 1];
            res[0] = carry;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }

    }
}
