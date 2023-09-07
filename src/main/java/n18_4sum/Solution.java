package n18_4sum;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {

    /* Note
     *   This is not accepted on leetcode because of sum exceed the 'long'.
     * */
    public List<List<Integer>> fourSum1(int[] nums, int target) {

        Arrays.sort(nums);
        int len = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                for (int k = j + 1; k < len - 1; k++) {
                    for (int l = k + 1; l < len; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            result.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }

    public List<List<Integer>> fourSum2(int[] nums, int target) {

        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            BigInteger currentTarget = BigInteger.valueOf(target).subtract(BigInteger.valueOf(nums[i]));

            for (int j = i + 1; j < nums.length; j++) {

                int s = j + 1;
                int e = nums.length - 1;

                while (s < e) {

                    BigInteger sum = BigInteger.valueOf(nums[j]).add(BigInteger.valueOf(nums[s])).add(BigInteger.valueOf(nums[e]));
                    if (sum.equals(currentTarget)) {
                        result.add(List.of(nums[i], nums[j], nums[s], nums[e]));
                        s++;
                    } else if (sum.compareTo(currentTarget) < 0) {
                        s++;
                    } else {
                        e--;
                    }

                }

            }

        }

        return new ArrayList<>(result);
    }

    public List<List<Integer>> fourSum3(int[] nums, int target) {

        int length = nums.length;
        Map<BigInteger, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {

                BigInteger sum = BigInteger.valueOf(nums[i]).add(BigInteger.valueOf(nums[j]));
                map.put(sum, List.of(i, j));

            }
        }

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {

                BigInteger sum = BigInteger.valueOf(nums[i]).add(BigInteger.valueOf(nums[j]));
                List<Integer> index = map.get(BigInteger.valueOf(target).subtract(sum));

                if (index != null) {

                    Set<Integer> numSet = new HashSet<>();
                    numSet.add(i);
                    numSet.add(j);
                    numSet.add(index.get(0));
                    numSet.add(index.get(1));

                    if (numSet.size() == 4) {
                        result.add(
                                Stream.of(nums[i], nums[j], nums[index.get(0)], nums[index.get(1)])
                                        .sorted()
                                        .collect(Collectors.toList())
                        );
                    }
                }

            }
        }

        return new ArrayList<>(result);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        int length = nums.length;
        Map<BigInteger, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {

                BigInteger sum = BigInteger.valueOf(nums[i]).add(BigInteger.valueOf(nums[j]));
                map.put(sum, List.of(i, j));

            }
        }

        Set<List<Integer>> resultIndex = new HashSet<>();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {

                BigInteger sum = BigInteger.valueOf(nums[i]).add(BigInteger.valueOf(nums[j]));
                List<Integer> index = map.get(BigInteger.valueOf(target).subtract(sum));

                if (index != null) {

                    Integer k = index.get(0);
                    Integer l = index.get(1);

                    if (i != k && i != l && j != k && j != l) {
                        resultIndex.add(List.of(i, j, k, l));
                    }

                }

            }
        }

        return resultIndex.stream().map(v -> {
            List<Integer> values = new ArrayList<>();
            values.add(nums[v.get(0)]);
            values.add(nums[v.get(1)]);
            values.add(nums[v.get(2)]);
            values.add(nums[v.get(3)]);
            Collections.sort(values);
            return values;
        }).distinct().collect(Collectors.toList());
    }

}