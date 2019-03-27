import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 合并区间
 */
public class Pro_056 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        Collections.sort(intervals, new IntervalComparator());
        int start = 0;
        for (int i = 0; i < intervals.size(); i++) {
            if (i < start)
                continue;
            Interval temp = intervals.get(i);
            for (int j = i + 1; j < intervals.size(); j++) {
                if (intervals.get(j).start <= temp.end)
                    temp.end = Math.max(intervals.get(j).end, temp.end);
                else {
                    start = j;
                    break;
                }
                start = intervals.size();
            }
            res.add(temp);
        }
        return res;
    }
}
