package n8_string_integer_atoi;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("   -42"));
        System.out.println(solution.myAtoi("   +42"));
        System.out.println(solution.myAtoi("   -0032"));
        System.out.println(solution.myAtoi("   +0032"));
        System.out.println(solution.myAtoi("4193 with words"));
        System.out.println(solution.myAtoi("               -4193 with words"));
        System.out.println(solution.myAtoi("     -4193 with words"));
        System.out.println(solution.myAtoi(" asdf    -4193 with words"));
        System.out.println(solution.myAtoi("-1"));
        System.out.println(solution.myAtoi("20000000000000000000"));
        System.out.println(solution.myAtoi("+-12"));

    }

}
