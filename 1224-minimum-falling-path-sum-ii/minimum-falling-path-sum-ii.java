class Solution {
    public int minFallingPathSum(int[][] grid) {
        for(int i = 1; i < grid.length; i++) 
            for(int j = 0; j < grid.length; j++) 
                    grid[i][j] += helper(grid[i-1],j);
            
        return helper(grid[grid.length - 1], Integer.MAX_VALUE);
    }
    int helper(int[] arr,int j){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i!=j) min = Math.min(min,arr[i]);
        }
        return min;
    }
}