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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int target : to_delete) set.add(target);
        helper(root, list, set);
        if(!set.contains(root.val)) list.add(root);
        return list;
    }
    TreeNode helper(TreeNode root, List<TreeNode> list, Set<Integer> set) {
        if(root == null) return null;
        root.left = helper(root.left, list, set);
        root.right = helper(root.right, list, set);
        if(set.contains(root.val)) {
            if(root.left != null) list.add(root.left);
            if(root.right != null) list.add(root.right);
            return null;
        }
        return root;
    }
}