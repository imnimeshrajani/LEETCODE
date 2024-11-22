class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String , Integer> map = new HashMap<>();
        for(int[] row : matrix) {
            StringBuilder str = new StringBuilder();
            if(row[0] == 1) for(int val : row) str.append(val ^ 1);
            else for(int val : row) str.append(val);
            map.merge(str.toString(), 1, Integer::sum);
        }
        return Collections.max(map.values());
    }
}