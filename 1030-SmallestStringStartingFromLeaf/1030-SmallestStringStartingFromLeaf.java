// Last updated: 8/12/2026, 12:23:38 PM
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
    String ans = "~";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }
    void dfs(TreeNode node, StringBuilder path) {
        if (node == null) {
            return;
        }
        path.append((char) ('a' + node.val));
        if (node.left == null && node.right == null) {
            String current = path.reverse().toString();
            if (current.compareTo(ans) < 0) {
                ans = current;
            }
            path.reverse();
        } else {
            dfs(node.left, path);
            dfs(node.right, path);
        }
        path.deleteCharAt(path.length() - 1);
    }
}