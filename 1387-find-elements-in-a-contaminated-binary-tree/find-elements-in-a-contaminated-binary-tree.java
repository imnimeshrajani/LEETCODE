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
class FindElements {
    TreeNode recoveredTree;
    Set<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        recoveredTree = root;
        root.val = 0;
        recoveryHelper(recoveredTree);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }

    private void recoveryHelper(TreeNode root) {
        set.add(root.val);
        if(root.left != null) {
            root.left.val = 2 * root.val + 1;
            recoveryHelper(root.left);
        }
        if(root.right != null) {
            root.right.val = 2 * root.val + 2;
            recoveryHelper(root.right);
        }
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */