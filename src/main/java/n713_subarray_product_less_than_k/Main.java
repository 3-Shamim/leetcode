package n713_subarray_product_less_than_k;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0));
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3}, 19));
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{100, 100, 100}, 100));

    }

}
