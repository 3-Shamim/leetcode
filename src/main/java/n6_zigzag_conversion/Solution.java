package n6_zigzag_conversion;

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

    public String convert(String s, int numRows) {

        if (numRows <= 1) {
            return s;
        }

        int len = s.length();
        int count = 1;
        int counter = 1;

        String[] groups = new String[numRows];
        Arrays.fill(groups, "");

        for (int i = 0; i < len; i++) {

            String value = groups[count - 1];
            groups[count - 1] = value + s.charAt(i);

            if (count == numRows) {
                counter = -1;
            }

            if (count == 1) {
                counter = 1;
            }

            count = count + counter;

        }

        String result = "";

        for (String group : groups) {
            result = result + group;
        }

        return result;
    }

}

