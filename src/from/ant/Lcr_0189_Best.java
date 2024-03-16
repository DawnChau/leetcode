package from.ant;

public class Lcr_0189_Best {

    public int mechanicalAccumulator(int target) {
        // 使用短路来实现if else
        boolean x = (target > 0) && (target += mechanicalAccumulator(target - 1)) > 0;
        return target;
    }

}
