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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            return new TreeNode(val, root, null);
        }
        helper(root, val, depth);
        return root;
    }

    void helper(TreeNode root, int val, int level) {
        if(level == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        } else if(level > 2) {
            if(root.left != null) helper(root.left, val, level-1);
            if(root.right != null) helper(root.right, val, level-1);
        }
    }
}