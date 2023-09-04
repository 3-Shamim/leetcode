package n125_valid_palindrome;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.printf("E: %b\nA: %b\n", true, solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("-------------------------------------");
        System.out.printf("E: %b\nA: %b\n", false, solution.isPalindrome("race a car"));
        System.out.println("-------------------------------------");
        System.out.printf("E: %b\nA: %b\n", true, solution.isPalindrome(" "));
        System.out.println("-------------------------------------");
        System.out.printf("E: %b\nA: %b\n", true, solution.isPalindrome("/*.,;;''''' a1a1v1a1a  "));
        System.out.println("-------------------------------------");
        System.out.printf("E: %b\nA: %b\n", true, solution.isPalindrome("/*.,;;'''''   "));

    }

}
