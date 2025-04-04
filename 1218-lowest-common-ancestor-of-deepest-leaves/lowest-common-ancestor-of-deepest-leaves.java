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
    TreeNode ansNode;
    int deepestDepth = -1;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        helper(root, 0);
        return ansNode;
    }

    private int helper(TreeNode node, int depth) {
        if(node == null) {
            deepestDepth = Math.max(deepestDepth, depth);
            return depth;
        }
        int left = helper(node.left, depth + 1);
        int right = helper(node.right, depth + 1);
        if(left == right && left == deepestDepth) ansNode = node;
        return Math.max(left, right);
    }
}