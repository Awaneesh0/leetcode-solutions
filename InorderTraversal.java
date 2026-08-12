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

import javax.swing.tree.TreeNode;

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        // Loop continues as long as there are nodes to process
        while (current != null || !stack.isEmpty()) {
            
            // Step 1: Go as far left as possible, pushing nodes onto the stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Step 2: Pop the top node, process it, and move to its right child
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        
        return result;
    }
}