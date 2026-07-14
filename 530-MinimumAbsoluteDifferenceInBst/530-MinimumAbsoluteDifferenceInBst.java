// Last updated: 7/14/2026, 2:10:31 PM
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
    TreeNode prev = null;             
    int min = Integer.MAX_VALUE;     
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        inOrder(root);                
        return min;                  
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (prev != null) {
            min = Math.min(min, Math.abs(root.val - prev.val));  
        }
        prev = root;  
        inOrder(root.right);
    }
}