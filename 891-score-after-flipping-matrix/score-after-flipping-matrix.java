class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length, m = grid[0].length, ans = 0;
        for(int i = 0; i < n; i++) {
            if(grid[i][0] == 0) {
                for(int j = 0; j < m; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        for(int j = 0; j < m; j++) {
            
                int count = 0;
                for(int i = 0; i < n; i++) {        
                    if(grid[i][j] == 0) count++;
                }
                if(count > (n/2)){
                    for(int i = 0; i < n; i++) {        
                        grid[i][j] ^= 1;
                    }
                }
            
        }
        for(int i = 0; i < n; i++) {
            int dec = 0, base = 1;
            for (int j = m - 1; j >= 0; j--) {
                dec += grid[i][j] * base;
                base *= 2;
            }
            ans += dec;
        }
        // for(int i = 0; i < n; i++) {
        //         for(int j = 0; j < m; j++) {
        //             System.out.print(grid[i][j] + " ");
        //         }
        //     System.out.println();
        // }
        return ans;
    }
}