/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution_203 {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that sits before the actual head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        // Start our pointer at the dummy node
        ListNode current = dummy;
        
        // Loop as long as there is a next node to evaluate
        while (current.next != null) {
            // If the next node needs to be removed, skip over it
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                // Otherwise, move our pointer forward
                current = current.next;
            }
        }
        
        // Return the clean list, which starts exactly after the dummy node
        return dummy.next;
    }
}