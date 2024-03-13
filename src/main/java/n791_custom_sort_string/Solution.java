package n791_custom_sort_string;

import java.util.Arrays;

class Solution {

    public String customSortString(String order, String s) {

        int[] orderChar = new int[26];
        int[] charCount = new int[26];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            orderChar[c - 97] = 1;
        }

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (orderChar[c - 97] == 1) {
                charCount[c - 97] += 1;
            } else {
                result.append(c);
            }

        }

        for (int i = 0; i < order.length(); i++) {

            char c = order.charAt(i);

            int count = charCount[c - 97];

            if (count > 0) {
                result.append(String.valueOf(c).repeat(count));
            }

        }


        return result.toString();
    }

}