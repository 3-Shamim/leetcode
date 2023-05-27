package n2_add_two_numbers;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution s = new Solution();

        ListNode listNode = s.addTwoNumbers(l1, l2);

        while (listNode != null) {

            System.out.println(listNode.val);

            listNode = listNode.next;
        }

    }

}
