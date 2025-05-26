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
    public boolean isCompleteTree(TreeNode root) {
        boolean gotNull = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() != 0) {
            for (int i = 0; i < q.size(); i++) {
                TreeNode node = q.poll();
                
                if (node == null) {
                    gotNull = true;
                } else {
                    System.out.println(node.val);
                    if (gotNull)
                        return false;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
        return true;
    }
}