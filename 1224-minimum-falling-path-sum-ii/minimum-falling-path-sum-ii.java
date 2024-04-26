class Solution {
    public int minFallingPathSum(int[][] grid) {
        if(grid.length == 1) return grid[0][0];
        int firstMin = 0, secMin = 1;
        for(int i = 0; i < grid.length; i++) {
            if(grid[0][i] < grid[0][firstMin]) {
                secMin = firstMin;
                firstMin = i;
            } else if(i != firstMin && grid[0][i] < grid[0][secMin]) 
                secMin  = i;
        }
        for(int i = 1; i < grid.length; i++) {
            int min1 = 0, min2 = 1;
            for(int j = 0; j < grid.length; j++) {
                grid[i][j] += (firstMin == j) ? grid[i-1][secMin] : grid[i-1][firstMin];
                
                if(grid[i][j] < grid[i][min1]) {
                    min2 = min1;
                    min1 = j;
                } else if(j != min1 && grid[i][j] < grid[i][min2]) 
                    min2  = j;

            }
            firstMin = min1;
            secMin = min2;
        }
        return grid[grid.length - 1][firstMin];
    }






    // public int minFallingPathSum(int[][] grid) {
    //     for(int i = 1; i < grid.length; i++) 
    //         for(int j = 0; j < grid.length; j++) 
    //                 grid[i][j] += helper(grid[i-1],j);
            
    //     return helper(grid[grid.length - 1], Integer.MAX_VALUE);
    // }
    // int helper(int[] arr,int j){
    //     int min = Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(i!=j) min = Math.min(min,arr[i]);
    //     }
    //     return min;
    // }
}