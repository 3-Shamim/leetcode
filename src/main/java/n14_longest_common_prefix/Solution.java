package n14_longest_common_prefix;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public String longestCommonPrefix2(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        char pattern = '~';
        String smallStr = "";
        StringBuilder builder = new StringBuilder();

        for (String str : strs) {

            if (str.isEmpty()) {
                return "";
            }

            if (smallStr.isEmpty()) {
                smallStr = str;
            } else {

                if (str.length() < smallStr.length()) {
                    smallStr = str;
                }

            }

            builder.append(str).append(pattern);

        }

        String allWords = builder.toString();

        int position = 0;
        int currentWordPrefixCount = 0;
        int prefixCount = smallStr.length();
        boolean wordBreak = false;

        for (int i = 0; i < allWords.length(); i++) {

            if (allWords.charAt(i) == pattern) {
                position = 0;
                wordBreak = false;

                if (prefixCount > currentWordPrefixCount) {
                    prefixCount = currentWordPrefixCount;
                }

                if (i < allWords.length() - 1) {
                    currentWordPrefixCount = 0;
                }

                continue;
            }

            if (position >= smallStr.length()) {
                continue;
            }

            if (wordBreak) {
                continue;
            }

            if (smallStr.charAt(position) == allWords.charAt(i)) {
                currentWordPrefixCount++;
            } else {
                wordBreak = true;
            }

            position++;

        }

        return smallStr.substring(0, prefixCount);
    }


    public String longestCommonPrefix1(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String result = "";

        for (int i = 0; i < strs[0].length(); i++) {

            String prefix = strs[0].substring(0, i + 1);

            for (int j = 1; j < strs.length; j++) {

                boolean match = strs[j].startsWith(prefix);

                if (!match) {
                    return result;
                } else {
                    if (j + 1 == strs.length) {
                        result = prefix;
                    }
                }

            }

        }


        return result;
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        Map<String, Integer> allPossiblePrefix = new HashMap<>();

        for (String str : strs) {

            for (int i = 0; i < str.length(); i++) {

                String prefix = str.substring(0, i + 1);

                Integer integer = allPossiblePrefix.getOrDefault(prefix, 0);
                allPossiblePrefix.put(prefix, integer + 1);

            }

        }

        AtomicReference<String> result = new AtomicReference<>("");

        allPossiblePrefix.forEach((key, value) -> {

            if (strs.length == value) {
                if (key.length() > result.get().length()) {
                    result.set(key);
                }
            }

        });

        return result.get();
    }

}

