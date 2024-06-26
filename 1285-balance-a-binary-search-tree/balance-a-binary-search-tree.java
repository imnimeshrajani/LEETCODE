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
    List<Integer> values = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return helper(0, values.size() - 1);
    }

    void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        values.add(root.val);
        inorder(root.right);
    }

    TreeNode helper(int start, int end) {
        if(start > end) return null;
        else if(start == end) return new TreeNode(values.get(start));
        else {
            int mid = start + (end - start) / 2;
            TreeNode root = new TreeNode(values.get(mid), helper(start, mid - 1), helper(mid + 1, end));
            return root;
        }
        
    }
}