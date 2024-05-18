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
    public int distributeCoins(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode root) {
        if(root == null) return 0;
        int left = helper(root.left), right = helper(root.right);
        int coins = left + right;
        if(root.val == 0) coins--;
        else coins += --root.val;
        ans += Math.abs(coins);
        return coins;
    }
}