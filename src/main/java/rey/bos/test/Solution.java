package rey.bos.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {

    enum Weekday {
        Monday, Tuesday, Wednesday, Thursday, Friday
    }

    record HourRange(int start, int end) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof HourRange hourRange)) return false;
            return start == hourRange.start && end == hourRange.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }

    static void printBusinessHours(Map<Weekday, List<HourRange>> storeHours) {
        // TODO
        for (Weekday currDay : Weekday.values()) {
            List<HourRange> hours = storeHours.get(currDay);
            String result;
            if (hours == null) {
                result = "Closed";
            } else {
                hours = merge(hours);
                result = hours.stream().map(h -> h.start + "-" + h.end).collect(Collectors.joining(", "));
            }
            System.out.println(currDay + ": " + result);
        }
    }

    private static List<HourRange> merge(List<HourRange> hours) {
        List<HourRange> copyHours = new ArrayList<>(hours);
        List<HourRange> result = new ArrayList<>();
        for (int i = 1; i < copyHours.size(); i++) {
            HourRange first = copyHours.get(i - 1);
            HourRange second = copyHours.get(i);
            HourRange merge = null;
            if (first.end >= second.start) {
                merge = new HourRange(first.start, Math.max(first.end, second.end));
            }
            if (merge != null) {
                copyHours.set(i, merge);
            } else {
                result.add(first);
            }
        }
        result.add(copyHours.get(copyHours.size() - 1));
        return result;
    }

    public static void main(String[] args) {
        Map<Weekday, List<HourRange>> test = Map.of(
            Weekday.Monday, List.of(new HourRange(10, 12), new HourRange(12, 21)),
            Weekday.Tuesday, List.of(new HourRange(10, 12), new HourRange(10, 12)),
            Weekday.Wednesday, List.of(new HourRange(10, 12)),
            Weekday.Friday, List.of(new HourRange(10, 12), new HourRange(10, 11), new HourRange(11, 13))
        );
        printBusinessHours(test);
    }

}
