package n611_valid_triangle_number;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 29/7/24
 * Time: 6:31 PM
 * Email: mdshamim723@gmail.com
 */

public class No611 {

    public static int triangleNumber(int[] nums) {

        if (nums == null || nums.length < 3) {
            return 0;
        }

        int count = 0;

        Arrays.sort(nums);

        for (int c = nums.length - 1; c >= 2; c--) {

            int a = 0, b = c - 1;

            while (a < b) {

                if (nums[a] + nums[b] > nums[c]) {
                    count += b - a;
                    b--;
                } else {
                    a++;
                }

            }

        }

        return count;
    }

    // Using nested loop
    public static int triangleNumberNL(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i]) {
                        count++;
                    }

                }

            }

        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(triangleNumber(new int[]{2, 2, 3, 4}));
        System.out.println(triangleNumber(new int[]{4, 2, 3, 4}));

    }

}
