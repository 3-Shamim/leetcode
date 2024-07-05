package n33_search_in_rotated_sorted_array;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 21/6/24
 * Time: 9:04 AM
 * Email: mdshamim723@gmail.com
 */

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{1, 3, 5, 6}, 5));
        System.out.println(solution.search(new int[]{1, 3, 5, 6}, 2));
        System.out.println(solution.search(new int[]{1, 3, 5, 6}, 7));
        System.out.println(solution.search(new int[]{1, 3, 5, 8}, 7));

    }

}
