package n2_add_two_numbers;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class Solution {

    private ListNode push(ListNode head, int v) {

        ListNode new_node = new ListNode(v);

        if (head == null) {
            head = new_node;
            return head;
        }

        new_node.next = head;

        head = new_node;

        return head;
    }


    private ListNode reverse(ListNode result) {
        ListNode p = null;
        ListNode c = result;
        ListNode n;

        while (c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;

        int credit = 0;

        while (l1 != null || l2 != null) {

            int v1 = 0;
            int v2 = 0;

            if (l1 != null) {
                v1 = l1.val;
            }

            if (l2 != null) {
                v2 = l2.val;
            }

            int sum = v1 + v2 + credit;

            if (sum > 9) {
                credit = 1;
                sum = sum % 10;
            } else {
                credit = 0;
            }

            result = push(result, sum);

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

        }

        if (credit > 0) {
            result = push(result, credit);
        }

        result = reverse(result);

        return result;
    }

}

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
