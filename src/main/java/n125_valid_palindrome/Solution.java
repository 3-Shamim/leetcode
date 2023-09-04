package n125_valid_palindrome;

class Solution {

    public boolean isPalindrome(String v) {

        v = v.toLowerCase();
        v = v.replaceAll("[^a-z0-9]", "");
        v = v.trim();

        int s = 0;
        int e = v.length() - 1;

        while (s < e) {

            if (v.charAt(s) != v.charAt(e)) {
                return false;
            }

            s++;
            e--;
        }

        return true;
    }

}