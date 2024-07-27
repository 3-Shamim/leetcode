package n1539_Kth_missing_positive_number.n1351_count_negative_numbers_in_a_sorted_matrix;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

public class No1539 {

    // Binary search
    public static int findKthPositive(int[] arr, int k) {

        int start = 0, end = arr.length;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] - mid - 1 < k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end + k;
    }

    // Linear search
    public static int findKthPositiveLS(int[] arr, int k) {

        int count = 1;

        for (int num: arr) {

            int missing = num - count;

            if (missing >= k) {
                return count + k - 1;
            }

            count ++;

        }

        return count + k - 1;
    }

    // Linear search
    public static int findKthPositiveLS1(int[] arr, int k) {

        int count = 1;

        for (int num : arr) {

            if (num != count) {

                int missing = num - count;

                if (missing >= k) {
                    return count + k - 1;
                }

                k -= missing;

                count = num + 1;

            } else {

                count++;

            }

        }

        return count + k - 1;
    }

    public static void main(String[] args) {

        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 9));
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4}, 2));
        System.out.println(findKthPositive(new int[]{}, 2));

    }

}
