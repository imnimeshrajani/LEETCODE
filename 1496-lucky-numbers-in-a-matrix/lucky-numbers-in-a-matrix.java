class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int[] row : matrix) {
            int min = row[0], minIdx = 0;
            for(int i = 1; i < row.length; i++) {
                if(row[i] < min) {
                    min = row[i];
                    minIdx = i;
                }
            }
            int value = row[minIdx], i = 0;
            for(; i < matrix.length; i++) {
                if(matrix[i][minIdx] > value) break;
            }
            if(i == matrix.length) ans.add(value);
        }
        return ans;
    }
}