package n162_find_peak_element;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

/*
 * LeetCode: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */

public class No162 {

    // Solve with linear search
    public static int findPeakElement1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return i;
            }

        }

        return arr.length - 1;
    }

    // Solve with binary search
    public static int findPeakElement(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }

    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{0, 1, 0}));
        System.out.println(findPeakElement(new int[]{0, 1, 2}));
        System.out.println(findPeakElement(new int[]{0, 2, 1, 0}));
        System.out.println(findPeakElement(new int[]{0, 10, 5, 2}));
        System.out.println(findPeakElement(new int[]{0, 4, 8, 10, 9, 7, 5, 2, 1}));
        System.out.println(findPeakElement(new int[]{1, 2, 5, 9, 11, 2, 1}));
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));

    }

}
