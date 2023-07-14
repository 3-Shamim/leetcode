package n10_regular_expression_matching;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public boolean isMatch(String s, String p) {

        int sLen = s.length();
        int pLen = p.length();
        char star = '0';

        for (int i = 0; i < sLen; i++) {

            char c = s.charAt(i);
            char c1 = star == '0' ? p.charAt(i) : star;

            if (i == pLen - 1) {

                if (c1 == '.' || c == c1) {
                    if (sLen == pLen) {
                        break;
                    } else {
                        return false;
                    }
                }

                if (c1 == '*') {
                    star = s.charAt(i - 1);
                }
            }

            if (c != c1 && c1 != '.') {
                return false;
            }

        }

        return true;
    }

}

