package from.ant;

public class Pro_2079_Best {
    public int wateringPlants(int[] plants, int capacity) {
        int res = 1;
        int curCap = capacity;
        curCap -= plants[0];
        for (int i = 1; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                res += i * 2;
            }
            res++;
            curCap -= plants[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 3};
        System.out.println(new Pro_2079_Best().wateringPlants(nums, 5));
    }
}
