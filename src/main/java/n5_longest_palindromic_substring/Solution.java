package n5_longest_palindromic_substring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public String longestPalindrome(String s) {

        int length = s.length();

        String res = "";

        int position1 = 0;
        int position2 = length - 1;

        int pointer1 = 0;
        int pointer2 = position2;

        while (true) {

            if (s.charAt(pointer1) != s.charAt(pointer2)) {
                pointer1 = position1;
                position2--;
                pointer2 = position2;
            } else {

                if (position1 == length - 1) {

                    String value = s.substring(position1, position2 + 1);

                    if (value.length() > res.length()) {
                        res = value;
                    }

                    break;
                } else {

                    if (position1 == position2) {

                        String value = s.substring(position1, position2 + 1);

                        if (value.length() > res.length()) {
                            res = value;
                        }

                        position1++;
                        pointer1 = position1;

                        position2 = length - 1;
                        pointer2 = position2;

                        if (res.length() > (position2 + 1 - position1)) {
                            break;
                        }

                    } else {

                        String value = s.substring(position1, position2 + 1);

                        if (value.length() % 2 == 0) {
                            if (pointer1 + 1 == pointer2) {

                                if (value.length() > res.length()) {
                                    res = value;
                                }

                                position1++;
                                pointer1 = position1;

                                position2 = length - 1;
                                pointer2 = position2;

                                if (res.length() > (position2 + 1 - position1)) {
                                    break;
                                }

                                continue;
                            }
                        } else {
                            if (pointer1 == pointer2) {

                                if (value.length() > res.length()) {
                                    res = value;
                                }

                                position1++;
                                pointer1 = position1;

                                position2 = length - 1;
                                pointer2 = position2;

                                if (res.length() > (position2 + 1 - position1)) {
                                    break;
                                }

                                continue;
                            }
                        }

                        pointer1++;
                        pointer2--;

                    }

                }

            }

        }

        return res;
    }

    public String longestPalindrome1(String s) {

        int length = s.length();

        Set<String> visited = new HashSet<>();
        String res = "";

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j <= length; j++) {

                if (res.length() > length - i) {
                    break;
                }

                String value = s.substring(i, j);

                if (!visited.contains(value)) {

                    visited.add(value);

                    boolean isPalindrome = isPalindrome(value);

                    if (isPalindrome) {

                        if (value.length() > res.length()) {
                            res = value;
                        }

                    }

                }
            }
        }

        return res;
    }

    public String longestPalindrome2(String s) {

        Set<String> subSet = new HashSet<>();

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                subSet.add(s.substring(i, j));
            }
        }

        for (String value : subSet) {

            boolean isPalindrome = isPalindrome(value);

            if (isPalindrome) {

                if (value.length() > res.length()) {
                    res = value;
                }

            }
        }


        return res;
    }

    public String longestPalindrome3(String s) {

        Set<String> subSet = new HashSet<>();

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String value = s.substring(i, j);
                subSet.add(value);
            }
        }

        List<String> sortedSet = subSet.stream().sorted((o1, o2) -> Integer.compare(o2.length(), o1.length())).toList();

        for (String value : sortedSet) {

            boolean isPalindrome = isPalindrome(value);

            if (isPalindrome) {
                res = value;
                break;
            }

        }

        return res;
    }

    public String longestPalindrome4(String s) {

        int length = s.length();
        String res = "";

        for (int i = 0; i < length; i++) {

            if (res.length() > (length - i)) {
                break;
            }

            String expand = expand(s, i, i);

            if (expand.length() > res.length()) {
                res = expand;
            }

            String expand1 = expand(s, i, i + 1);

            if (expand1.length() > res.length()) {
                res = expand1;
            }

        }

        return res;
    }

    private String expand(String s, int start, int end) {

        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return s.substring(start + 1, end);
    }

    public String longestPalindrome5(String s) {

        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if (j >= i) {

                    if (s.charAt(i) == s.charAt(j)) {

                        dp[i][j] = true;

                        int lastIndexI = i > 0 ? i - 1 : i;
                        int lastIndexJ = i > 0 ? i - 1 : i;
                        System.out.printf("DP: %d-%d - %b", lastIndexI, lastIndexJ, dp[lastIndexI][lastIndexJ]);

                    }

                    System.out.printf("Substring: %d - %d - %s\n", i, j, s.substring(i, j+1));
                }

            }

        }

        System.out.println(Arrays.deepToString(dp));

        return null;
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

