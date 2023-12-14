class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int[] count = new int[21];
        int[] max = new int[21];
        for (int num : nums) {
            max[10 + num] += 1;
        }

        ArrayList<List<Integer>> result = new ArrayList<>();
        dfs(max, count, 0, result);

        return result;
    }

    private void dfs(int[] max, int[] count, int depth, ArrayList<List<Integer>> result) {
        if (depth >= max.length) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < max.length; i++)
                for (int j = 0; j < count[i]; j++) temp.add(i - 10);
            result.add(temp);
            return;
        }

        for (int i = 0; i <= max[depth]; i++) {
            count[depth] = i;
            dfs(max, count, depth + 1, result);
        }
    }
}