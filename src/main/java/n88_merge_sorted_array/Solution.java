package n88_merge_sorted_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n < 1) {
            return;
        }

        if (m < 1) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        List<Integer> values = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            int a = nums1[i];
            int b = nums2[j];

            values.add(Math.min(a, b));

            if (a < b) {
                i++;
            } else {
                j++;
            }

        }

        if (i < m) {
            for (int k = i; k < m; k++) {
                values.add(nums1[k]);
            }
        }

        if (j < n) {
            for (int k = j; k < n; k++) {
                values.add(nums2[k]);
            }
        }

        for (int index = 0; index < values.size(); index++) {
            nums1[index] = values.get(index);
        }

    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {

        if (n < 1) {
            return;
        }

        if (m < 1) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        System.arraycopy(nums2, 0, nums1, m, n);

        Arrays.sort(nums1);

    }

}