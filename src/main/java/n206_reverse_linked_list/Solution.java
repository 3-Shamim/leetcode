package n206_reverse_linked_list;

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode res = null;

        while (head != null) {
            res = new ListNode(head.val, res);
            head = head.next;
        }

        return res;
    }

}