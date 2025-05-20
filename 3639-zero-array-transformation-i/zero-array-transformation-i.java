class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int arr[] = new int[nums.length + 1], sum = 0;
        for(int[] q : queries) {
            arr[q[0]]--;
            if(q[1] + 1 < nums.length) arr[q[1] + 1]++;
        }

        for(int i = 0; i < nums.length; i++) {
            sum += arr[i];
            if(nums[i] > -sum) return false;
        }
        return true;
    }
}