class Solution {
    public int maxSum(int[][] nums) {
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=0;j<nums[0].length-2;j++){
                int sum=nums[i][j]+nums[i][j+1]+nums[i][j+2]+nums[i+1][j+1]+nums[i+2][j]+nums[i+2][j+1]+nums[i+2][j+2];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}