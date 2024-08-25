package n2300_successful_pairs_of_spells_and_potions;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 20/8/24
 * Time: 9:13 PM
 * Email: mdshamim723@gmail.com
 */

public class No2300 {

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] ans = new int[spells.length];

        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {

            int index = binarySearch(potions, success, spells[i]);

            ans[i] = potions.length - index;

        }

        return ans;
    }

    private static int binarySearch(int[] arr, long target, int m) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

           if (target > ((long) arr[mid] * m)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return start;
    }

    public static int[] successfulPairs1(int[] spells, int[] potions, long success) {

        int[] ans = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {

            int count = 0;

            for (int potion : potions) {

                if (((long) spells[i] * potion) >= success) {
                    count++;
                }

            }

            ans[i] = count;

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16)));

    }

}
