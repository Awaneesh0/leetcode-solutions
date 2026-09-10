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
class Solution_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            // Save the next node so we don't lose the rest of the list
            ListNode nextTemp = current.next;
            
            // Reverse the current node's pointer
            current.next = prev;
            
            // Move our two pointers one step forward
            prev = current;
            current = nextTemp;
        }
        
        // prev is the new head of the reversed list
        return prev;
    }
}