package n3_longest_substring_without_repeating_characters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public int lengthOfLongestSubstring(String input) {

        int tick = 0;
        int max = 0;
        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {

            char charAt = input.charAt(i);

            if (!characterSet.isEmpty() && characterSet.contains(charAt)) {

                i = tick;
                tick++;

                int size = characterSet.size();

                if (size > max) {
                    max = size;
                }

                characterSet = new HashSet<>();

            } else {
                characterSet.add(charAt);
            }
        }

        int size = characterSet.size();

        if (size > max) {
            max = size;
        }

        return max;
    }

    public int lengthOfLongestSubstring1(String input) {

        int max = 0;
        int startPosition = 0;
        String currentSubString = null;

        for (int i = 0; i < input.length(); i++) {

            if (currentSubString != null && currentSubString.contains(String.valueOf(input.charAt(i)))) {
                startPosition = startPosition + 1;
                i = startPosition;
            }

            currentSubString = input.substring(startPosition, i + 1);

            int currentSubStringLen = currentSubString.length();

            if (currentSubStringLen > max) {
                max = currentSubStringLen;
            }

        }

        return max;
    }

    public List<String> substringWithoutRepeatedChar(String s) {

        List<String> list = new ArrayList<>();

        int startPosition = 0;
        String currentSubString = null;

        for (int i = 0; i < s.length(); i++) {

            if (currentSubString != null && currentSubString.contains(String.valueOf(s.charAt(i)))) {
                startPosition = startPosition + 1;
                i = startPosition;
            }

            currentSubString = s.substring(startPosition, i + 1);

            list.add(currentSubString);

        }

        return list;
    }

}
