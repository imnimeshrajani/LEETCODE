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
    public int countPairs(TreeNode root, int distance) {
        List<TreeNode> leaves = new ArrayList<>();
        Map<TreeNode, List<TreeNode>> map = new HashMap<>();
        findLeaves(root, new ArrayList<>(), leaves, map);
        int ans = 0;
        for(int i = 0; i < leaves.size() - 1; i++) {
            for(int j = i + 1; j < leaves.size(); j++) {
                List<TreeNode> leaf1 = map.get(leaves.get(i)), leaf2 = map.get(leaves.get(j));
                for(int k = 0; k < Math.min(leaf1.size(), leaf2.size()); k++) {
                    if(leaf1.get(k) != leaf2.get(k)) {
                        if(((leaf1.size() - k) + (leaf2.size() - k)) <= distance) ans++;
                        break;
                    }
                }
            }
        }
        return ans;

    }
    void findLeaves(TreeNode node, List<TreeNode> path, List<TreeNode> leaves, Map<TreeNode, List<TreeNode>> map) {
        if(node == null) return;
        List<TreeNode> list = new ArrayList<>(path);
        list.add(node);
        if(node.left == null && node.right == null) {
            map.put(node, list);
            leaves.add(node);
            return;
        }
        findLeaves(node.left, list, leaves, map);
        findLeaves(node.right, list, leaves, map);
    }
}