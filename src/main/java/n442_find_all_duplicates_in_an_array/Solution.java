package n442_find_all_duplicates_in_an_array;

import java.util.*;

class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicateNums = new ArrayList<>();

        boolean[] store = new boolean[nums.length + 1];

        for (int num : nums) {

            if (store[num]) {
                duplicateNums.add(num);
            }

            store[num] = true;

        }

        return duplicateNums;
    }

    public List<Integer> findDuplicates4(int[] nums) {

        List<Integer> duplicateNums = new ArrayList<>();

        for (int num : nums) {

            int index = Math.abs(num) - 1;

            if (nums[index] < 0) {
                duplicateNums.add(index + 1);
            }

            nums[index] = -nums[index];

        }

        return duplicateNums;
    }

    public List<Integer> findDuplicates3(int[] nums) {

        List<Integer> duplicateNums = new ArrayList<>();

        int[] counter = new int[nums.length + 1];

        for (int num : nums) {

            if (counter[num] > 0) {
                duplicateNums.add(num);
            }
            counter[num] += 1;
        }

        return duplicateNums;
    }

    public List<Integer> findDuplicates2(int[] nums) {

        List<Integer> duplicateNums = new ArrayList<>();

        HashMap<Integer, Integer> store = new HashMap<>();

        for (int num : nums) {

            Integer storedValue = store.get(num);

            if (storedValue != null) {
                duplicateNums.add(num);
            } else {
                store.put(num, num);
            }

        }

        return duplicateNums;
    }

    public List<Integer> findDuplicates1(int[] nums) {

        List<Integer> duplicateNums = new ArrayList<>();

        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {

            if (!unique.add(num)) {
                duplicateNums.add(num);
            }

        }

        return duplicateNums;
    }

}