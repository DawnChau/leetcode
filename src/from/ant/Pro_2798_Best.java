package from.ant;

public class Pro_2798_Best {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                res++;
            }
        }
        return res;
    }
}
