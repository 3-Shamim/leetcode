package n274_h_index;

import java.util.Arrays;

class Solution {

    public int hIndex(int[] citations) {

        int len = citations.length;

        int[] temp = new int[len + 1];

        for (int citation : citations) {
            if (citation >= len) {
                temp[len]++;
            } else {
                temp[citation]++;
            }
        }

        int sum = 0;
        for (int j = temp.length - 1; j >= 0; j--) {

            sum += temp[j];

            if (j <= sum) {
                return j;
            }

        }

        return 0;
    }

    public int hIndex1(int[] citations) {

        Arrays.sort(citations);

        int i = 0;
        int hIndex = 1;

        while (i < citations.length && hIndex <= (citations.length - i)) {

            int v = citations[i];

            if (v < 1) {
                i++;
                continue;
            }

            if (hIndex <= v && hIndex <= (citations.length - i)) {

                if (hIndex == v) {
                    i++;
                }
                hIndex++;

            } else {
                i++;
            }

        }

        return hIndex - 1;
    }

}