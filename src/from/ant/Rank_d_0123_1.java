package from.ant;

public class Rank_d_0123_1 {

    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c || b + c <= a || c + a <= b || a - b >= c || b - c >= a || c - a >= b) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        }
        if (a == b || b == c || c == a) {
            return "isosceles";
        }

        return "scalene";
    }
}
