import java.util.*;
public class MergeIntervalsInsert {
    public static class Interval {
        int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
     }
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        int start = newInterval.start;
        int end = newInterval.end;

        int i = 0;
        // Add intervals that come before the newInterval
        while (i < intervals.size() && intervals.get(i).end < start) {
            result.add(intervals.get(i));
            i++;
        }

        // Merge overlapping intervals with newInterval
        while (i < intervals.size() && intervals.get(i).start <= end) {
            start = Math.min(start, intervals.get(i).start);
            end = Math.max(end, intervals.get(i).end);
            i++;
        }

        result.add(new Interval(start, end));

        // Add remaining intervals after the newInterval
        while (i < intervals.size()) {
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }
}
