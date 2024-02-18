package from.ant;

public class Lcr_0173_Best {

    public int takeAttendance(int[] records) {
        int sum = (records.length) * (records.length+1) / 2;
        for (int i = 0; i < records.length; i++) {
            sum -= records[i];
        }
        return sum;
    }
}
