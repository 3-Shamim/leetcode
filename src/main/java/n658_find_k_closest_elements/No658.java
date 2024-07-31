package n658_find_k_closest_elements;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 29/7/24
 * Time: 6:31 PM
 * Email: mdshamim723@gmail.com
 */

public class No658 {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> res = new ArrayList<>();

        if (x < arr[0]) {

            for (int i = 0; i < k; i++) {
                res.add(arr[i]);
            }

            return res;
        }

        int index = binarySearch(arr, x);

        int i = index, j = index + 1;

        while ((j - i) + 1 < k) {

            if (i <= 0) {
                j += k - 1;
                break;
//                j++;
//                continue;
            }

            if (j >= arr.length - 1) {
                i = j - k - 1;
                break;
//                i--;
//                continue;
            }

            int a = arr[i];
            int b = arr[j];

//            if (Math.abs(a - x) == Math.abs(b - x) && a == x) {
//                i--;
//                j++;
//            }

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
                start  = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return end;
    }

    public static void main(String[] args) {

//        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 3, 5}, 4, 3));
//        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1));
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 6));
        System.out.println(findClosestElements(new int[]{-4, 1, 2, 3, 4, 5}, 2, 3));
        System.out.println(findClosestElements(new int[]{-4, 1, 2, 3, 4, 5}, 2, -2));

    }

}
