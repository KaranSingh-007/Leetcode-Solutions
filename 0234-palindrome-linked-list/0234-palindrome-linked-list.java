class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode sptr = head;
        ListNode fptr = head;

        while (fptr != null && fptr.next != null) {
            sptr = sptr.next;
            fptr = fptr.next.next;
        }

        if (fptr != null) {
            sptr = sptr.next;
        }

        sptr = reverseList(sptr);

        fptr = head;

        while (sptr != null) {
            if (sptr.val != fptr.val) {
                return false;
            }

            sptr = sptr.next;
            fptr = fptr.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}