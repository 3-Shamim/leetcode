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

        int len = citations.length;
        int start = 0, end = len;

        while (start < end) {

            int mid = start + end >>> 1;

            if (citations[mid] >= len - mid) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return len - start;
    }

    public static int hIndex2(int[] citations) {

        int hIndex = 1;

        for (int i = citations.length - 1; i >= 0; i--) {

            if (citations[i] >= hIndex) {
                hIndex++;
            } else {
                break;
            }

        }

        return hIndex - 1;
    }

    public static int hIndex1(int[] citations) {

        int min = Math.min(citations.length, citations[citations.length - 1]);
        int ans = 0;

        for (int i = 1; i <= min; i++) {

            int count = 0;

            for (int j = citations.length - 1; j >= citations.length - i; j--) {

                if (citations[j] >= i) {
                    count++;
                } else {
                    break;
                }

            }

            if (count == i) {
                ans = i;
            }


        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(hIndex(new int[]{0, 0}));
        System.out.println(hIndex(new int[]{0, 1}));
        System.out.println(hIndex(new int[]{2, 3}));
        System.out.println(hIndex(new int[]{2, 2}));
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
