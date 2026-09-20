import java.util.ArrayList;
import java.util.List;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, new StringBuilder(), paths);
        }
        return paths;
    }
    
    private void dfs(TreeNode node, StringBuilder currentPath, List<String> paths) {
        // Save the current length of the StringBuilder so we can backtrack later
        int lengthBeforeAppend = currentPath.length();
        
        // Append the current node's value
        currentPath.append(node.val);
        
        // If it's a leaf node, add the completed path to our list
        if (node.left == null && node.right == null) {
            paths.add(currentPath.toString());
        } else {
            // If it's not a leaf, append the arrow and continue DFS
            currentPath.append("->");
            if (node.left != null) {
                dfs(node.left, currentPath, paths);
            }
            if (node.right != null) {
                dfs(node.right, currentPath, paths);
            }
        }
        
        // Backtrack: strip off the current node's value (and arrow) before returning
        // so the parent call has a clean path for its right branch
        currentPath.setLength(lengthBeforeAppend);
    }
}