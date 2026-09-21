// Last updated: 9/21/2026, 2:24:45 PM
class Solution {
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}