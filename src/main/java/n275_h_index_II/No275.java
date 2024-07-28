package n275_h_index_II;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/7/24
 * Time: 9:57 PM
 * Email: mdshamim723@gmail.com
 */

public class No275 {

    public static int hIndex(int[] citations) {

        int hIndex = 1;

        for (int i = 0; i < citations.length; i++) {

            if (citations[i] >= hIndex) {

                if (citations.length - i == hIndex) {
                    return hIndex;
                }

                if (citations.length - i < hIndex) {
                    break;
                }

                if (citations[i] > hIndex) {
                    i--;
                }

                hIndex++;

            }

        }

        return 0;
    }

    public static int hIndex1(int[] citations) {

        int max = citations[citations.length - 1];

        for (int i = 1; i <= max; i++) {

            int count = 0;

            for (int j = 0; j < citations.length; j++) {

                if (citations[j] >= i) {
                    count = citations.length - j;
                    break;
                }

            }

            if (count == i) {
                return i;
            }

        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(hIndex(new int[]{1, 2, 3}));
        System.out.println(hIndex(new int[]{0, 1, 3, 5, 6}));
        System.out.println(hIndex(new int[]{1, 2, 100}));
        System.out.println(hIndex(new int[]{1, 1, 100}));
        System.out.println(hIndex(new int[]{1, 2, 6, 7, 9}));
        System.out.println(hIndex(new int[]{6}));
        System.out.println(hIndex(new int[]{0}));
        System.out.println(hIndex(new int[]{6, 6, 6, 6}));
        System.out.println(hIndex(new int[]{6, 6, 6, 6, 6, 6}));
        System.out.println(hIndex(new int[]{1, 1, 1, 1, 1, 1, 2, 2}));
        System.out.println(hIndex(new int[]{0, 0, 0, 0, 1, 1, 1, 2, 2}));

    }

}
