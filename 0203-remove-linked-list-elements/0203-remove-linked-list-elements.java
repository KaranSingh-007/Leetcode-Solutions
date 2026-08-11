class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(-1);
        ans.next = head;
        ListNode curr = ans;
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return ans.next;    
    }
}