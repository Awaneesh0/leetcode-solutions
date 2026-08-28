/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either list is empty, there can be no intersection
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode pA = headA;
        ListNode pB = headB;
        
        // Loop will terminate either at the intersection node, 
        // or when both pointers reach null (no intersection)
        while (pA != pB) {
            // If pA reaches the end of list A, redirect to the head of list B
            if (pA == null) {
                pA = headB;
            } else {
                pA = pA.next;
            }
            
            // If pB reaches the end of list B, redirect to the head of list A
            if (pB == null) {
                pB = headA;
            } else {
                pB = pB.next;
            }
        }
        
        // pA is now either the intersection node, or null
        return pA;
    }
}