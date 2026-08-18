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
class Solution {
    public int minDepth(TreeNode root) {
        // Base case: empty tree
        if (root == null) {
            return 0;
        }
        
        // If it is a leaf node, depth is 1
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        // If left subtree is empty, we must go right
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        
        // If right subtree is empty, we must go left
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        
        // If both subtrees exist, take the minimum of both paths
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}