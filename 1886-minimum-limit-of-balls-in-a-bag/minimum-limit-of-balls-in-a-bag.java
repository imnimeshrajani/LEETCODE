class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int min = 0, max = 1000000000;
        while(min + 1 < max) {
            int mid = min + (max - min) / 2, count = 0;
            for(int val : nums) count += --val/mid;
            if(count <= maxOperations) max = mid;
            else min = mid;
        }
        return max;
    }
}