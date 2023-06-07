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

    public String longestPalindrome2(String s) {

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

    public String longestPalindrome1(String s) {

        Set<String> visited = new HashSet<>();

        String res = null;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String value = s.substring(i, j);

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

