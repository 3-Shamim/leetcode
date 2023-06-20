package n13_roman_to_integer;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    private static final HashMap<Character, Integer> hashMap = new HashMap<>();

    static {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
    }

    public int romanToInt(String s) {

        int result = 0;

        for (int length = s.length() - 1; length >= 0; length--) {

            char c = s.charAt(length);

            Integer current = hashMap.get(c);

            if (length > 0) {

                char c1 = s.charAt(length - 1);

                Integer next = hashMap.get(c1);

                if (next < current) {
                    current = current - next;
                    length--;
                }

            }

            result += current;

        }

        return result;
    }


}

