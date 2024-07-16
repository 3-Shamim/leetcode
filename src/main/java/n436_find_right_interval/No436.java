package n436_find_right_interval;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class No436 {

    // Using builtin tree map
    public static int[] findRightIntervalTM(int[][] intervals) {

        int[] ans = new int[intervals.length];

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {

            if (intervals[i][0] > max) {
                max = intervals[i][0];
            }

            if (intervals[i][0] < min) {
                min = intervals[i][0];
            }

            map.put(intervals[i][0], i);

        }

        for (int i = 0; i < intervals.length; i++) {

            int endI = intervals[i][1];

            if (endI > max) {
                ans[i] = -1;
                continue;
            }

            if (map.containsKey(endI)) {
                ans[i] = map.get(endI);
                continue;
            }

            Integer key = map.ceilingKey(endI);

            ans[i] = map.get(key);

        }

        return ans;
    }

    // Using linear inside binary search O(nlog(n))
    public static int[] findRightInterval(int[][] intervals) {

        int[] ans = new int[intervals.length];

        Map<Integer, Integer> map = new HashMap<>();

        int[] allStart = new int[intervals.length];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {

            if (intervals[i][0] > max) {
                max = intervals[i][0];
            }

            if (intervals[i][0] < min) {
                min = intervals[i][0];
            }

            map.put(intervals[i][0], i);
            allStart[i] = intervals[i][0];

        }

        Arrays.sort(allStart);

        for (int i = 0; i < intervals.length; i++) {

            int endI = intervals[i][1];

            if (endI > max) {
                ans[i] = -1;
                continue;
            }

            if (map.containsKey(endI)) {
                ans[i] = map.get(endI);
                continue;
            }

            int value = binarySearch(0, allStart.length, allStart, endI);

            ans[i] = map.get(value);

        }

        return ans;
    }

    private static int binarySearch(int start, int end, int[] allStart, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == allStart[mid]) {
                return mid;
            } else if (target > allStart[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return allStart[start];
    }

    // Bruteforce O(n^2)
    public static int[] findRightIntervalBF(int[][] intervals) {

        int[] ans = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {

            ans[i] = -1;

//            int startI = intervals[i][0];
            int endI = intervals[i][1];

            for (int j = 0; j < intervals.length; j++) {

                int startJ = intervals[j][0];
//                int endJ = intervals[j][1];

                if (startJ >= endI) {

                    if (ans[i] == -1 || startJ < intervals[ans[i]][0]) {
                        ans[i] = j;
                    }

                }

            }

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findRightInterval(new int[][]{{4, 5}, {2, 3}, {1, 2}})));
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{1, 2}})));
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{3, 4}, {2, 3}, {1, 2}})));
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{1, 4}, {2, 3}, {3, 4}})));

    }

}
