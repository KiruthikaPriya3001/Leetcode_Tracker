// Last updated: 9/21/2026, 2:31:02 PM
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
        TreeNode root = construct(0,nums.length-1,nums);
        return root;
    }
    public TreeNode construct(int left,int right,int[]nums){
        if(left>right){
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = construct(left,mid-1,nums);
        curr.right = construct(mid+1,right,nums);
        return curr;
    }
}