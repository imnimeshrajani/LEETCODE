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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        helper(root1, list1);
        helper(root2, list2);
        return merge(list1, list2);
    }
    void helper(TreeNode root, List<Integer> list) {
        if(root == null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
    List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while(i<list1.size() && j<list2.size()){
            if(list1.get(i) < list2.get(j))
                list.add(list1.get(i++));
            else
                list.add(list2.get(j++));
        }

        while(i<list1.size()) 
            list.add(list1.get(i++));

        while(j<list2.size()) 
            list.add(list2.get(j++));

        return list;
    }
}