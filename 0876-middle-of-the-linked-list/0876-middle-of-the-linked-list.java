class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode sptr = head;
        ListNode fptr = head;
        while(sptr != null && fptr != null && fptr.next != null){
            sptr = sptr.next;
            fptr = fptr.next.next;
        }
        return sptr;
    }
}