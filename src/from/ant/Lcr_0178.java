package from.ant;

import java.util.Arrays;

public class Lcr_0178 {
    public int trainingPlan(int[] actions) {
        Arrays.sort(actions);
        for (int i = 0; i < actions.length; i+=3) {
            if(i < actions.length-2){
                if(actions[i]!=actions[i+1]){
                    return actions[i];
                }
            }
        }
        return actions[actions.length-1];
    }
}
