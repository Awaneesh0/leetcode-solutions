import javax.swing.tree.TreeNode;

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
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case 1: Both nodes are null, meaning we've reached the end identically
        if (p == null && q == null) {
            return true;
        }
        
        // Base case 2: One is null while the other isn't, OR their values differ
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        
        // Recursive step: Both current nodes are equal, so check the subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}