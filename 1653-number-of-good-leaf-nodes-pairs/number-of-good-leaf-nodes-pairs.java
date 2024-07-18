/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int result = 0;
    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return result;
    }

    private int[] dfs(TreeNode node, int distance) {
        if (node == null) {
            return new int[distance + 1];
        }
        if (node.left == null && node.right == null) {
            int[] leafDistance = new int[distance + 1];
            leafDistance[1] = 1;
            return leafDistance;
        }

        int[] left = dfs(node.left, distance);
        int[] right = dfs(node.right, distance);

        for (int i = 1; i <= distance; i++) 
            for (int j = 1; j <= distance - i; j++) 
                result += left[i] * right[j];
            
        int[] leafDistance = new int[distance + 1];
        for (int i = 1; i < distance; i++) 
            leafDistance[i + 1] = left[i] + right[i];
        
        return leafDistance;
    }
}