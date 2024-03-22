package n234_palindrome_linked_list;

class Solution {

    public boolean isPalindrome(ListNode head) {

        int midLen = getLen(head) / 2;

        System.out.println(midLen);

        ListNode mid = head;

        while (midLen != 0) {
            mid = mid.next;
            midLen--;
        }

        System.out.println(mid.val);

        return true;
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