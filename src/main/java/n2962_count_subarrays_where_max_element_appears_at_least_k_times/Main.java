package n2962_count_subarrays_where_max_element_appears_at_least_k_times;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.countSubarrays(new int[]{1, 3, 2, 3, 3}, 2));
        System.out.println(solution.countSubarrays(new int[]{1, 4, 2, 1}, 3));
    }

}
