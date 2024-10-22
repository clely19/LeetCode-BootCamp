class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;
        int length = 0;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        curr = head;
        for (int i = 0; i <= length; i++) {
            if (length - i == n) {
                if (prev != null) {
                    prev.next = curr.next; 
                } else {
                    head = curr.next; 
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
            
        }
        return head;
    }
}
