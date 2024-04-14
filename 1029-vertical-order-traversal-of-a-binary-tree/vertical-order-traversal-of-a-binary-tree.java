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

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        int start = 0, end = 0;
        Map<Integer, List<Integer>> map = new HashMap();
        List<List<Integer>> res = new ArrayList();
        if (root == null)
            return res;
        Queue<TreeNode> qTree = new LinkedList();
        Queue<Integer> qInt = new LinkedList();
        qTree.add(root);
        qInt.add(0);
        while (!qTree.isEmpty()) {
            int size = qTree.size();
            Map<Integer, List<Integer>> tmp = new HashMap();
            for (int i = 0; i < size; i++) {
                TreeNode cur = qTree.poll();
                int idx = qInt.poll();
                tmp.putIfAbsent(idx, new ArrayList<Integer>());
                tmp.get(idx).add(cur.val);
                if (idx < start)
                    start = idx;
                if (idx > end)
                    end = idx;
                if (cur.left != null) {
                    qTree.add(cur.left);
                    qInt.add(idx - 1);
                }
                if (cur.right != null) {
                    qTree.add(cur.right);
                    qInt.add(idx + 1);
                }
            }
            for (int key : tmp.keySet()) {
                map.putIfAbsent(key, new ArrayList<Integer>());
                List<Integer> list = tmp.get(key);
                Collections.sort(list);
                map.get(key).addAll(list);
            }

        }
        for (int i = start; i <= end; i++) 
            res.add(map.get(i));

        return res;
    }
}