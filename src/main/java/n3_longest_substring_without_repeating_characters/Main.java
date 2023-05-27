package n3_longest_substring_without_repeating_characters;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        String[] inputs = {"abcabcbb", "bbbbb", "pwwkew", "dvdf"};

        Solution solution = new Solution();

        for (String input : inputs) {

            System.out.println(input);
            int result = solution.lengthOfLongestSubstring(input);
//            List<String> result = solution.substringWithoutRepeatedChar(input);
            System.out.println(result);

        }

    }

}
