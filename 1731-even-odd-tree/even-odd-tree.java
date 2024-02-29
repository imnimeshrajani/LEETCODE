class Solution {
    ArrayList<Integer> lastLevelValue = new ArrayList<>();
    public boolean isEvenOddTree(TreeNode root) {
        return isEvenOddTree(root, 0);
    }

    public boolean isEvenOddTree(TreeNode root, int level) {
        if (root == null) return true;
        if (!check(root, level)) return false;
        level++;
        return isEvenOddTree(root.left, level) && isEvenOddTree(root.right, level);
    }

    private boolean check(TreeNode root, int level) {
        // Since odd levels must have even numbers (and viceversa) we can check with XOR
        if (((level ^ root.val) & 1) == 0) return false;

        if (lastLevelValue.size() <= level) {
            // First found in this level
            lastLevelValue.add(root.val);
            return true;
        }

        if ((level & 1) == 1) {
            // it's odd level
            if (lastLevelValue.get(level) <= root.val) return false;
        } else {
            // it's even level
            if (lastLevelValue.get(level) >= root.val) return false;
        }
        lastLevelValue.set(level, root.val);
        return true;
    }
}