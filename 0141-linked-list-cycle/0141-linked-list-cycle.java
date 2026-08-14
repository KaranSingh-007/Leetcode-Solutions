public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode sptr = head;
        ListNode fptr = head;
        while(sptr != null && fptr != null && fptr.next != null){
            sptr = sptr.next;
            fptr = fptr.next.next;
            if(sptr == fptr){
                return true;
            }
        }
        return false;
    }
}