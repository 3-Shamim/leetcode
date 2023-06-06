package n4_median_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;

        int total = l1 + l2;
        int i = 0;
        int j = 0;

        int[] mergedNums = new int[total];
        int index;

        while ((index = (i + j)) < total) {

            if (i < l1 && j < l2) {

                int n1 = nums1[i];
                int n2 = nums2[j];

                if (n1 < n2) {
                    mergedNums[index] = n1;
                    i++;
                } else {
                    mergedNums[index] = n2;
                    j++;
                }

            } else if (i < l1) {
                mergedNums[index] = nums1[i];
                i++;
            } else {
                mergedNums[index] = nums2[j];
                j++;
            }

        }

        return calculateMedian(total, mergedNums);

    }

    private double calculateMedian(int total, int[] mergedNums) {
        if (total % 2 == 0) {
            int mid = total / 2;
            return (mergedNums[mid] + mergedNums[mid - 1]) / 2.0;
        } else {
            int mid = (int) Math.floor(total / 2.0);
            return mergedNums[mid];
        }
    }

    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {

        List<Integer> mergedNums = new ArrayList<>(Arrays.stream(nums1).boxed().toList());
        mergedNums.addAll(Arrays.stream(nums2).boxed().toList());
        mergedNums.sort(Integer::compareTo);

        return calculateMedian(mergedNums.size(), mergedNums);

    }

    private double calculateMedian(int total, List<Integer> mergedNums) {
        if (total % 2 == 0) {
            int mid = total / 2;
            return (mergedNums.get(mid) + mergedNums.get(mid - 1)) / 2.0;
        } else {
            int mid = (int) Math.floor(total / 2.0);
            return mergedNums.get(mid);
        }
    }

}

