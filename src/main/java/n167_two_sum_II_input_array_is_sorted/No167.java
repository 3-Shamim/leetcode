package n167_two_sum_II_input_array_is_sorted;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

public class No167 {

    // Two pointer
    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {

            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }

        }

        return new int[0];
    }

    // Linear search with extra space
    public static int[] twoSumLS(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int remains = target - numbers[i];

            Integer remainsIndex = map.get(remains);

            if (remainsIndex != null) {
                return new int[]{remainsIndex + 1, i + 1};
            } else {
                map.put(numbers[i], i);
            }

        }

        return new int[0];
    }

    // Bruteforce
    public static int[] twoSumBF(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }

            }

        }

        return new int[0];
    }

    // Bruteforce with binary search
    public static int[] twoSumBFAndBS(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int j = binarySearch(numbers, target - numbers[i]);

            if (j != -1) {
                return new int[]{i + 1, j + 1};
            }

        }

        return new int[0];
    }

    private static int binarySearch(int[] numbers, int target) {

        int start = 0, end = numbers.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == numbers[mid]) {
                return mid;
            } else if (target > numbers[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
        System.out.println(Arrays.toString(twoSum(new int[]{0, 1}, 1)));

    }

}
