// Last updated: 7/14/2026, 2:12:07 PM
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
    List<Integer>list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        list.clear();
        traversal (root);
        return list;
    }
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);
    }
    public boolean isValidBST(TreeNode root){
        inorderTraversal(root);
        for(int i = 1;i<list.size();i++){
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}