package n436_find_right_interval;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class No436 {

    public static int[] findRightInterval(int[][] intervals) {

        int[] ans = new int[intervals.length];

        Map<Integer, Integer> map = new HashMap<>();

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

            int endI  = intervals[i][1];

            if (endI > max) {
                ans[i] = -1;
                continue;
            }

            if (map.containsKey(endI)) {
                ans[i] = map.get(endI);
                continue;
            }

            binarySearch(endI, max, map, endI);

        }

        return ans;
    }

    private static int binarySearch(int start, int end, Map<Integer, Integer> map, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > mid) {
                start = mid + 1;
            } else {

                end = mid;
            } else

        }

        return start;
    }

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

        System.out.println(Arrays.toString(findRightInterval(new int[][]{{1, 2}})));
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{3, 4}, {2, 3}, {1, 2}})));
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{1, 4}, {2, 3}, {3, 4}})));

    }

}
