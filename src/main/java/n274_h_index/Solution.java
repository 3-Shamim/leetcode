package n274_h_index;

import java.util.Arrays;

class Solution {

    public int hIndex(int[] citations) {

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