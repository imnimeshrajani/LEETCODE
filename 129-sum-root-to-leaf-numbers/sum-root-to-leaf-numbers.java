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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        // Recursion Approach
        // numCreator(root, 0);
        
        Stack<TreeNode> nodeStack = new Stack();
        TreeNode curr = root, prev = null;
        int num = 0;
        while(curr != null || !nodeStack.isEmpty()) {
            while(curr != null) {
                num = (num * 10) + curr.val;
                nodeStack.push(curr);
                curr = curr.left;
            }
            curr = nodeStack.peek();
            if(curr.right != null && curr.right != prev) {
                curr = curr.right;
                continue;
            }
            if(curr.left == null && curr.right == null) 
                ans += num;
            
            prev = nodeStack.pop();
            num /= 10;
            curr = null;
        }
        return ans;
    }

    void numCreator(TreeNode root, int num) {
        if(root.left == null && root.right == null) {
            ans += num + root.val;
            return;
        }
        if(root.left != null) numCreator(root.left, (num + root.val) * 10);
        if(root.right != null) numCreator(root.right, (num + root.val) * 10);
    }
}