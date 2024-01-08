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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return findSum(root, low, high, 0); 
    }
    public int findSum(TreeNode root, int low, int high, int sum) {
        if(root == null) return 0;
        sum = findSum(root.left,low, high, sum) + findSum(root.right, low, high, sum);
        if(root.val <=  high && root.val >= low) sum += root.val;
        return sum;
    }
}