package n143_reorder_list;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode head4 = new ListNode(5);
        ListNode head3 = new ListNode(4, head4);
        ListNode head2 = new ListNode(3, head3);
        ListNode head1 = new ListNode(2, head2);
        ListNode head = new ListNode(1, head1);

        System.out.println(head);
        solution.reorderList(head);
        System.out.println(head);

    }

}
