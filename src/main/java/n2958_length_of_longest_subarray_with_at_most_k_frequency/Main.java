package n2958_length_of_longest_subarray_with_at_most_k_frequency;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.maxSubarrayLength(new int[]{1, 2, 3, 1, 2, 3, 1, 2}, 2));
        System.out.println(solution.maxSubarrayLength(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 1));
        System.out.println(solution.maxSubarrayLength(new int[]{5, 5, 5, 5, 5, 5, 5}, 4));
        System.out.println(solution.maxSubarrayLength(new int[]{5, 5, 5, 5, 5, 6, 7, 7, 8, 9, 8, 2, 1, 3}, 4));
        System.out.println(solution.maxSubarrayLength(new int[]{1, 2, 2, 2}, 2));

    }

}
