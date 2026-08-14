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
class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        // An empty tree is symmetric
        if (root == null) {
            return true;
        }
        
        // Check if the left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both are null, they are symmetric
        if (t1 == null && t2 == null) {
            return true;
        }
        
        // If one is null and the other isn't, or if values don't match, they aren't symmetric
        if (t1 == null || t2 == null || t1.val != t2.val) {
            return false;
        }
        
        // Check the outer branches and inner branches simultaneously
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}