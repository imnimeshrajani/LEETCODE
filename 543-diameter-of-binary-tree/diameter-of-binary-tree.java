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
    public int diameterOfBinaryTree(TreeNode root) {
        return (root == null) ? 0 : Math.max(helper(root.left) + helper(root.right) + 2, Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
    int helper(TreeNode root){
        return (root == null) ? -1 : Math.max(helper(root.left),helper(root.right))+1;
    }
}