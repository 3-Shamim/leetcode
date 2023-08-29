package n17_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    private final static Map<Character, String> STRING_MAP = new HashMap<>();

    static {
        STRING_MAP.put('2', "abc");
        STRING_MAP.put('3', "def");
        STRING_MAP.put('4', "ghi");
        STRING_MAP.put('5', "jkl");
        STRING_MAP.put('6', "mno");
        STRING_MAP.put('7', "pqrs");
        STRING_MAP.put('8', "tuv");
        STRING_MAP.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> combinations = new ArrayList<>();

        recursion(digits, 0, "", combinations);

        return combinations;
    }


    private void recursion(String digits, int depth, String c, List<String> combinations) {

        String current = STRING_MAP.get(digits.charAt(depth));

        for (int i = 0; i < current.length(); i++) {

            if (depth < digits.length() - 1) {
                recursion(digits, depth + 1, c + current.charAt(i), combinations);
            } else {
                combinations.add(c + current.charAt(i));
            }

        }

    }

}