package n1498_number_of_subsequences_that_satisfy_the_given_sum_condition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

public class No1498 {

    public static int numSubseq(int[] nums, int target) {

        List<Integer> path = new ArrayList<>();

//        subseq(nums, 0, path);

        return subsequences(nums, 0, path, 0, target);

    }

    private static void subseq(int[] nums, int i, List<Integer> path) {

        if (i == nums.length) {

            System.out.println(path);

            return;
        }

        subseq(nums, i + 1, path);

        path.add(nums[i]);

        subseq(nums, i + 1, path);

        path.remove(path.size() - 1);

    }


    private static int subsequences(int[] nums, int i, List<Integer> path, int c, int t) {

        if (i == nums.length) {

            if (!path.isEmpty()) {

                if (path.get(0) + path.get(path.size() - 1) <= t) {
                    return c + 1;
                }

                return c;
            }

        } else {

            c = subsequences(nums, i + 1, path, c, t);

            path.add(nums[i]);

            c = subsequences(nums, i + 1, path, c, t);

            path.remove(path.size() - 1);

        }

        return c;
    }

    public static void main(String[] args) {

        System.out.println(numSubseq(new int[]{3, 5, 6, 7}, 9));
        System.out.println(numSubseq(new int[]{3, 3, 6, 8}, 10));
        System.out.println(numSubseq(new int[]{2, 3, 3, 4, 6, 7}, 12));

    }

}
