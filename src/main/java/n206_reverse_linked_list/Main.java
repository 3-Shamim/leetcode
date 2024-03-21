package n206_reverse_linked_list;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode l2 = new ListNode(2);
        ListNode head = new ListNode(1, l2);

        System.out.println(solution.reverseList(head));

    }

}
