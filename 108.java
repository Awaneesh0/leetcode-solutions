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
    public TreeNode sortedArrayToBST(int[] nums) {
        // Start the recursion passing the full array bounds
        return buildTree(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildTree(int[] nums, int left, int right) {
        // Base case: no elements left to form a tree
        if (left > right) {
            return null;
        }
        
        // Find the middle element to act as the root of the current subtree
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        // Recursively build the left and right subtrees
        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        
        return root;
    }
}