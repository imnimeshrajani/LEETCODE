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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        traversal(root, 0);
        // if(root  == null) return ans;
        // Stack<TreeNode> evenStack = new Stack(), oddStack = new Stack();
        // evenStack.push(root);
        // while(!evenStack.isEmpty() || !oddStack.isEmpty()) {
        //     List<Integer>  subList = new ArrayList<>();
        //     while(!evenStack.isEmpty()) {
        //         TreeNode temp = evenStack.pop();
        //         subList.add(temp.val);
        //         if(temp.left != null) oddStack.push(temp.left);
        //         if(temp.right != null) oddStack.push(temp.right);
        //     }
        //     ans.add(subList);
        //     subList = new ArrayList<>();
        //     while(!oddStack.isEmpty()) {
        //         TreeNode temp = oddStack.pop();
        //         subList.add(temp.val);
        //         if(temp.right != null) evenStack.push(temp.right);
        //         if(temp.left != null) evenStack.push(temp.left);
        //     }
        //     if(!subList.isEmpty()) ans.add(subList);
        // }
        return ans;
    }
    void traversal(TreeNode root, int level) {
        if(root == null) return;
        if(level == ans.size()) ans.add(new ArrayList<>());
        if(level % 2 == 0) ans.get(level).add(root.val);
        else ans.get(level).add(0, root.val);
        traversal(root.left, level + 1);
        traversal(root.right, level + 1);
    }
}