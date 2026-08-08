public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int length1 = getLength(headA);
        int length2 = getLength(headB);

        if (length1 > length2) {
            int diff = length1 - length2;

            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        }

        if (length2 > length1) {
            int diff = length2 - length1;

            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public int getLength(ListNode head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }
}