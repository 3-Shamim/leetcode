package n41_first_missing_positive;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        boolean[] store = new boolean[n + 1];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                store[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!store[i]) {
                return i;
            }
        }

        return n + 1;
    }

    public int firstMissingPositive1(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int max = 0;

        for (int num : nums) {

            if (num < 1) {
                continue;
            }

            if (num > max) {
                max = num;
            }

            set.add(num);

        }

        int missingNumber = -1;

        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                missingNumber = i;
                break;
            }
        }

        if (missingNumber == -1) {
            return max + 1;
        }

        return missingNumber;
    }

}

