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
    public int sumNumbers(TreeNode root) {
        numCreator(root, 0);
        return ans;
    }
    void numCreator(TreeNode root, int num) {
        if(root.left == null && root.right == null) {
            ans += num + root.val;
            return;
        }
        if(root.left != null) numCreator(root.left, (num + root.val) * 10);
        if(root.right != null) numCreator(root.right, (num + root.val) * 10);
    }
}