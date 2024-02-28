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
    int level = 0, ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root,level);
        return (root.left == null && root.right == null) ? root.val : ans;
    }
    void helper(TreeNode root, int pos) {
        if(root == null) return;
        helper(root.left, pos+1);
        if(level < pos) {
        ans = root.val;
        level = pos;
        }
        helper(root.right, pos+1);
    }
}