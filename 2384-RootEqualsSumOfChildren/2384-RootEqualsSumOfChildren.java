// Last updated: 7/14/2026, 2:09:05 PM
class Solution {
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}