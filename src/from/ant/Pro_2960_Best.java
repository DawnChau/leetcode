package from.ant;

public class Pro_2960_Best {

    public int countTestedDevices(int[] batteryPercentages) {
        int cnt = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if(batteryPercentages[i] - cnt > 0){
                cnt++;
            }
        }
        return cnt;
    }
}
