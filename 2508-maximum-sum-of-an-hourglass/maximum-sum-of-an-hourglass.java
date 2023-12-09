class Solution {
    public int maxSum(int[][] nums) {
        int max = 0;
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = 0; j < nums[0].length-2; j++) {
                int sum = 0;
                for(int z = j; z < j+3; z++) sum += nums[i][z];
                sum += nums[i+1][j+1];
                for(int z = j; z < j+3; z++) sum += nums[i+2][z];
                max = Math.max(sum, max);

            }
        }
        return max;
    }
}