package n658_find_k_closest_elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 29/7/24
 * Time: 6:31 PM
 * Email: mdshamim723@gmail.com
 */

public class No658 {

    // Using sliding window
    public static List<Integer> findClosestElementsS(int[] arr, int k, int x) {

        List<Integer> res = new ArrayList<>();

        if (x < arr[0]) {

            for (int i = 0; i < k; i++) {
                res.add(arr[i]);
            }

            return res;
        }

        int s = 0, e = k - 1;

        while (e < arr.length - 1) {

            int a = arr[e];
            int b = arr[e + 1];

            int a1 = arr[s];

            if (b == a && b == a1) {
                s++;
                e++;
            } else if (Math.abs(b - x) < Math.abs(a - x)) {
                s++;
                e++;
            } else if (Math.abs(b - x) < Math.abs(a1 - x)) {
                s++;
                e++;
            } else {
                break;
            }

        }

        for (; s <= e; s++) {
            res.add(arr[s]);
        }

        return res;
    }

    // Using binary search and two pointer
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> res = new ArrayList<>();

        if (x < arr[0]) {

            for (int i = 0; i < k; i++) {
                res.add(arr[i]);
            }

            return res;
        }

        int index = binarySearch(arr, x);

        int i = index, j = index;

        while ((j - i + 1) < k) {

            if (i == 0) {
                j += k - 1;
                break;
            }

            if (j == arr.length - 1) {
                i = j - (k - 1);
                break;
            }

            int a = arr[i - 1];
            int b = arr[j + 1];

            if (Math.abs(a - x) <= Math.abs(b - x)) {
                i--;
            } else {
                j++;
            }

        }

        for (; i <= j; i++) {
            res.add(arr[i]);
        }

        return res;
    }

    private static int binarySearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + end >>> 1;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return end;
    }

    public static void main(String[] args) {

//        System.out.println(findClosestElements(new int[]{1, 3, 3, 4, 5, 7, 7, 8, 8, 8}, 6, 6));
        System.out.println(findClosestElements(new int[]{1, 1, 1, 10, 10, 10}, 1, 9));
        System.out.println(findClosestElements(new int[]{1, 1, 1, 10, 10, 10}, 2, 9));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 3, 3));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 3, 5}, 4, 3));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 3, 5}, 2, 3));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 1));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 6));
//        System.out.println(findClosestElements(new int[]{-4, 1, 2, 3, 4, 5}, 2, 3));
//        System.out.println(findClosestElements(new int[]{-4, 1, 2, 3, 4, 5}, 2, -2));

    }

}
