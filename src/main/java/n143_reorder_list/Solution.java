package n143_reorder_list;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public void reorderList(ListNode head) {

        List<ListNode> data = new ArrayList<>();

        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            data.add(temp);
        }

        int len = data.size();

        int i, j;

        i = len / 2;
        j = len / 2;

        if (len % 2 == 0) {
            i -= 1;
        }

        while (i >= 0 && j < len) {

            if (i == j) {

                head = data.get(i);

            } else {

                ListNode listNode = data.get(i);
                ListNode listNode1 = data.get(j);

                listNode1.next = head;
                listNode.next = listNode1;

                head = listNode;
            }

            i--;
            j++;

        }

    }

    /*
    * Not update head properly
    * */
    public void reorderList1(ListNode head) {

        List<Integer> data = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            data.add(temp.val);
            temp = temp.next;
        }

        int len = data.size();

        int i, j;

        i = len / 2;
        j = len / 2;

        if (len % 2 == 0) {
            i -= 1;
        }

        while (i >= 0 && j < len) {

            if (i == j) {
                temp = new ListNode(data.get(i));
            } else {
                temp = new ListNode(data.get(i), new ListNode(data.get(j), temp));
            }

            i--;
            j++;

        }

        head.next = temp.next;

    }

}