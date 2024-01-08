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
    public List<String> binaryTreePaths(TreeNode root) {
        var result = new ArrayList<String>();
        var sb = new StringBuilder();
        helper(root, sb, result);
        return result;
        
    }

    private void helper(TreeNode root, StringBuilder sb, List<String> paths){
        if(root == null) return;
        int len = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null) paths.add(sb.toString());
        else{
            sb.append("->");
            helper(root.left, sb, paths);
            helper(root.right, sb, paths);
        }
        sb.setLength(len);
    }
}