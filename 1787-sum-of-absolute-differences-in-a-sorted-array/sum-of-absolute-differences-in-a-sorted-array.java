class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] +=nums[i-1];
        }
        int[] ans = new int[nums.length];
        int pos = nums.length;
        int count = 2;
        ans[0] = nums[nums.length-1] - (nums[0]*pos--);
        for(int i = 1; i < nums.length; i++){
            int currValue = nums[i] - nums[i-1];
            ans[i] = ((nums[nums.length-1] - (currValue*pos--)) + (currValue*count++)) - nums[i] - nums[i-1];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}