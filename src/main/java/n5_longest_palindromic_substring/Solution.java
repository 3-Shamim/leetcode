package n5_longest_palindromic_substring;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public String longestPalindrome(String s) {

        Set<String> subSet = new HashSet<>();
        Set<String> visited = new HashSet<>();

        String res = null;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                subSet.add(s.substring(i, j));
            }
        }

        for (String value : subSet) {

            if (!visited.contains(value)) {

                visited.add(value);

                boolean isPalindrome = isPalindrome(value);

                if (isPalindrome) {

                    if (res == null) {
                        res = value;
                    } else if (value.length() > res.length()) {
                        res = value;
                    }

                }

            }

        }

        return res;
    }

    private static boolean isPalindrome(String value) {

        int length = value.length();
        int start = 0;
        int end = length - 1;

        while (true) {

            if (value.charAt(start) != value.charAt(end)) {
                return false;
            }

            if (length % 2 == 0) {
                if (start + 1 == end) return true;
            } else {
                if (start == end) return true;
            }

            start++;
            end--;

        }
    }

    private static boolean isPalindrome1(String value) {
        StringBuilder builder = new StringBuilder(value);
        return builder.reverse().toString().equals(value);
    }

}

