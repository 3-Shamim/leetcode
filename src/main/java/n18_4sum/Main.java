package n18_4sum;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(solution.fourSum2(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(solution.fourSum(new int[]{2, 2, 2, 2, 2}, 8));
        System.out.println(solution.fourSum2(new int[]{2, 2, 2, 2, 2}, 8));
        System.out.println(solution.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
        System.out.println(solution.fourSum2(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
        System.out.println(solution.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5}, -11));
        System.out.println(solution.fourSum2(new int[]{1,-2,-5,-4,-3,3,3,5}, -11));
        System.out.println(solution.fourSum(new int[]{-4,-3,-2,-1,0,0,1,2,3,4}, 0));
        System.out.println(solution.fourSum2(new int[]{-4,-3,-2,-1,0,0,1,2,3,4}, 0));
        System.out.println(solution.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
        System.out.println(solution.fourSum2(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));

    }

}
