import java.util.Arrays;
import java.util.Comparator;

/**
 * 本质上是LIS
 */
public class Pro_435 {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0)
            return 0;
        Arrays.sort(intervals, new IntervalComparator());

        int[] dp = new int[intervals.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[i].start >= intervals[j].end) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return intervals.length - res;
    }

    public static void main(String[] args) {
        Interval a = new Interval();
        a.start = 1;
        a.end = 2;
        Interval[] arr = new Interval[1];
        arr[0] = a;
        new Pro_435().eraseOverlapIntervals(arr);
    }
}

class IntervalComparator implements Comparator<Interval> {

    @Override
    public int compare(Interval o1, Interval o2) {
        if (o1.start != o2.start)
            return o1.start - o2.start;
        else
            return o1.end - o2.end;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
