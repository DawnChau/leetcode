package from.ant;

public class Pro_2391 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int gCount = getCount(garbage[0], 'G');
        int pCount = getCount(garbage[0], 'P');
        int mCount = getCount(garbage[0], 'M');
        int gTime = 0;
        int pTime = 0;
        int mTime = 0;
        int time = 0;
        for (int i = 1; i < garbage.length; i++) {
            time += travel[i - 1];
            if (garbage[i].contains("G")) {
                gCount += getCount(garbage[i], 'G');
                gTime = time;
            }
            if (garbage[i].contains("P")) {
                pCount += getCount(garbage[i], 'P');
                pTime = time;
            }
            if (garbage[i].contains("M")) {
                mCount += getCount(garbage[i], 'M');
                mTime = time;
            }
        }
        return gCount + pCount + mCount + gTime + pTime + mTime;
    }

    private int getCount(String garbage, char g) {
        int count = 0;
        for (char c : garbage.toCharArray()) {
            if (c == g) {
                count++;
            }
        }
        return count;
    }
}
