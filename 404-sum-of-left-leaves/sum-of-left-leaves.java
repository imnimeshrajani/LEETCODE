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
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root, false);
        return ans;
    }
    void helper(TreeNode root, boolean left) {
        if(root == null) return;
        if(root.left == null && root.right == null) if(left) ans += root.val;
        helper(root.left,true);
        helper(root.right,false);
    }
}