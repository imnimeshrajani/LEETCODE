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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder start = new StringBuilder(), destination = new StringBuilder();
        helper(root, startValue, start);
        helper(root, destValue, destination);
        int i = 0, min = Math.min(start.length(), destination.length());
        while(i < min && start.charAt(start.length() - i - 1) == destination.charAt(destination.length() - i - 1)) i++;
        return "U".repeat(start.length() - i) + destination.reverse().toString().substring(i);
    }

    boolean helper(TreeNode node, int value, StringBuilder str) {
        if(node.val == value) return true;
        else if(node.left != null && helper(node.left, value, str)) str.append("L");
        else if(node.right != null && helper(node.right, value, str)) str.append("R");
        return str.length() > 0;
    }
}