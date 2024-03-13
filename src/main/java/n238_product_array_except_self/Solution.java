package n238_product_array_except_self;

import java.util.Arrays;

class Solution {

    public int[] productExceptSelf2(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        int s = 0;
        int e = nums.length - 1;

        while (s < nums.length) {

            prefix[s] = s == 0 ? nums[s] : prefix[s - 1] * nums[s];
            postfix[e] = s == 0 ? nums[e] : postfix[e + 1] * nums[e];

            s++;
            e--;
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(postfix));

        for (int i = -1; i < nums.length - 1; i++) {

            int pre = 1;
            int post = 1;

            if (i != -1) {
                pre = prefix[i];
            }

            if (i != nums.length - 2) {
                post = postfix[i + 2];
            }

            nums[i + 1] = (pre * post);

        }

        return nums;
    }


    public int[] productExceptSelf(int[] nums) {

        int[] values = new int[nums.length + 1];

        values[0] = 1;
        int s = 1;

        while (s < values.length) {
            values[s] = values[s - 1] * nums[s - 1];
            s++;
        }

        System.out.println(Arrays.toString(values));

        int lastCal = 1;

        for (int i = values.length - 2; i > 0; i--) {

            values[i] = values[i] * lastCal;

            lastCal = lastCal * nums[i];

            System.out.printf("%d - %d\n", i, lastCal);

        }

        System.out.println(Arrays.toString(values));


        return nums;
    }

}