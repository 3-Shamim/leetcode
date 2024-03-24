package n287_find_the_duplicate_number;

import java.util.*;

class Solution {

    public int findDuplicate(int[] nums) {

        boolean[] store = new boolean[nums.length];

        for (int num : nums) {

            if (store[num]) {
                return num;
            }

            store[num] = true;

        }

        return -1;

    }

    public int findDuplicate1_1(int[] nums) {

        int[] data = new int[nums.length];

        System.arraycopy(nums, 0, data, 0, nums.length);

        for (int num : data) {

            int index = Math.abs(num);

            if (data[index] < 0) {
                return index;
            }

            data[index] = -data[index];

        }

        return -1;

    }

    public int findDuplicate1(int[] nums) {

        for (int num : nums) {

            int index = Math.abs(num);

            if (nums[index] < 0) {
                return index;
            }

            nums[index] = -nums[index];

        }

        return -1;

    }

    public int findDuplicate2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            Integer v = map.get(num);

            if (v != null) {
                return num;
            } else {
                map.put(num, num);
            }

        }

        return -1;
    }

    public int findDuplicate3(int[] nums) {

        Arrays.sort(nums);

        // We can also use binary search logic here
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }

        }

        return -1;
    }

    public int findDuplicate4(int[] nums) {

        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {

            if (!unique.add(num)) {
                return num;
            }

        }

        return -1;
    }

    public int findDuplicate5(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return nums[i];
                }

            }

        }

        return -1;

    }

}