package from.ant;

public class Lcr_0139 {
    public int[] trainingPlan(int[] actions) {
        int index = 0;
        for (int i = 0; i < actions.length; i++) {
            if (actions[i] % 2 == 1) {
                mySwap(actions, i, index++);
            }
        }
        return actions;
    }

    private void mySwap(int[] actions, int i, int index) {
        if (i == index) {
            return;
        }
        int temp = actions[i];
        actions[i] = actions[index];
        actions[index] = temp;
    }
}
