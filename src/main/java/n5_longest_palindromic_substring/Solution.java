package n5_longest_palindromic_substring;

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

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            if (res.length() > s.length() - i) {
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

        while (true) {

            if (start < 0 || end >= s.length()) {
                break;
            }

            if (s.charAt(start) != s.charAt(end)) {
                break;
            }

            if ((start - 1) < 0 || (end + 1) >= s.length()) {
                break;
            }

            start--;
            end++;

        }

        return s.substring(start, end);
    }

//    private String expand(String s, int start, int end) {
//
//        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
//            start--;
//            end++;
//        }
//
//        return s.substring(start + 1, end);
//    }

    public String longestPalindrome5(String s) {

        boolean[][] dp = new boolean[s.length()][s.length()];

        int startAt = 0;
        int endAt = 0;

        for (int y = 0; y < s.length(); y++) {

            for (int x = 0; x < s.length() - y; x++) {

                if (s.charAt(x) == s.charAt(y + x)) {

                    boolean palindrome = true;

                    int xPrevInd = x + 1;
                    int yPrevInd = (y + x) - 1;

                    if (y > 1) {
                        palindrome = dp[xPrevInd][yPrevInd];
                    }

                    dp[x][y + x] = palindrome;

                    if (palindrome && (y > (endAt - startAt))) {
                        startAt = x;
                        endAt = y + x;
                    }

                }

            }

        }

        return s.substring(startAt, endAt + 1);
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

