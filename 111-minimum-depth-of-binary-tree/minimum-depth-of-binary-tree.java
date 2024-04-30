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
    int ans = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        helper(root, 1);
        return ans;
    }
    void helper(TreeNode root, int count) {
        if(root.left == null && root.right == null) {
            ans = Math.min(ans, count);
            return;
        }
        if(root.left != null) helper(root.left, count + 1);
        if(root.right != null) helper(root.right, count + 1);
    }
}