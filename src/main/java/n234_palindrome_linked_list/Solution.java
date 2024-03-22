package n234_palindrome_linked_list;

class Solution {

    public boolean isPalindrome(ListNode head) {

        ListNode first = head;
        ListNode slow = head; // Mid

        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
        }

        ListNode current = slow;
        ListNode prev = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        slow = prev;

        boolean palindrome = true;

        while (head != null && slow != null) {

            if (head.val != slow.val) {
                palindrome = false;
                break;
            }

            head = head.next;
            slow = slow.next;

        }

        return palindrome;
    }

    public boolean isPalindrome1(ListNode head) {

        ListNode reverseHead = null;

        String n1 = "";

        while (head != null) {
            n1 += head.val;
            reverseHead = new ListNode(head.val, reverseHead);
            head = head.next;
        }

        String n2 = "";

        while (reverseHead != null) {
            n2 += reverseHead.val;
            reverseHead = reverseHead.next;
        }

        return n1.equals(n2);
    }

    private ListNode getMiddle(ListNode head) {

        ListNode first = head;
        ListNode slow = head;

        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode getMiddleOne(ListNode head) {

        int midLen = getLen(head) / 2;

        ListNode mid = head;

        while (midLen != 0) {
            mid = mid.next;
            midLen--;
        }

        return mid;
    }

    private int getLen(ListNode head) {

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

}