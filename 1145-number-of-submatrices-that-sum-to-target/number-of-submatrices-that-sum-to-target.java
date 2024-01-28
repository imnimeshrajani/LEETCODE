class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length + 1, ans = 0;
        int[][] temp = new int[n][m];
        for(int i = 0; i < n; i++) 
            for(int j = 1; j < m; j++) 
                temp[i][j] = temp [i][j-1] + matrix[i][j-1];

        for(int i = 0; i < m; i++) {
            for(int j = i+1; j < m; j++) {
                int sum = 0;
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0,1);
                for(int k = 0; k < n; k++) {
                    sum += temp[k][j] - temp[k][i];
                    if(map.containsKey(sum - target)) ans += map.get(sum - target);
                    map.put(sum, map.getOrDefault(sum, 0)+1);
                }
            }
        }
        return ans;
    }
}