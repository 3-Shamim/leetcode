package n10_regular_expression_matching;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    /**
     * Can not support multiple pattern
     */
    public boolean isMatch1(String s, String p) {

        int sLen = s.length();
        int pLen = p.length();
        char starChar = '0';

        for (int i = 0; i < sLen; i++) {

            char c = s.charAt(i);
            char c1 = starChar == '0' ? p.charAt(i) : starChar;

            if (i == pLen - 1) {

                if (c1 == '.' || c == c1) {
                    if (sLen == pLen) {
                        break;
                    } else {
                        return false;
                    }
                }

                if (c1 == '*') {
                    starChar = p.charAt(i - 1);
                    c1 = starChar;
                }
            }

            if (c != c1 && c1 != '.') {
                return false;
            }

        }

        return true;
    }

    public boolean isMatch(String text, String pattern) {

        if (pattern.isEmpty()) {
            return text.isEmpty();
        }

        if (text.isEmpty()) {
            return false;
        }

        int tIndex = text.length() - 1;
        int pIndex = pattern.length() - 1;

        boolean result = true;
        boolean enableStar = false;

        while (true) {

            if (tIndex < 0) {

                if (!enableStar) {
                    if (pIndex >= 0) {
                        result = false;
                    }
                }

                break;
            }

            if (pIndex < 0) {
                result = false;
                break;
            }

            if (text.charAt(tIndex) == pattern.charAt(pIndex) || pattern.charAt(pIndex) == '.') {

                tIndex--;
                pIndex--;

            } else if (pattern.charAt(pIndex) == '*') {

                enableStar = true;

                char startChar = pattern.charAt(pIndex - 1);

                if (text.charAt(tIndex) == startChar || startChar == '.') {
                    tIndex--;
                } else {
                    pIndex -= 2;
                }

            } else {
                result = false;
                break;
            }

        }

        return result;
    }

//    public boolean isMatch(String text, String pattern) {
//
//        if (pattern.isEmpty()) {
//            return text.isEmpty();
//        }
//
//        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
//
//        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
//            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
//        } else {
//            return first_match && isMatch(text.substring(1), pattern.substring(1));
//        }
//    }

}

