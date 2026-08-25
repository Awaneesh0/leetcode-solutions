/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Handle empty list or single node list safely
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Loop continues as long as fast pointer can safely move two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2
            
            // If they meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }
        
        // If the fast pointer reaches the end, there is no cycle
        return false;
    }
}