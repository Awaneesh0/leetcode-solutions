/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        // Base case: empty tree
        if (root == null) {
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        // Loop continues as long as there are nodes to process
        while (!stack.isEmpty()) {
            // Step 1: Pop the top node and process it
            TreeNode current = stack.pop();
            result.add(current.val);
            
            // Step 2: Push right child FIRST
            if (current.right != null) {
                stack.push(current.right);
            }
            
            // Step 3: Push left child SECOND (so it is popped first)
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        
        return result;
    }
}