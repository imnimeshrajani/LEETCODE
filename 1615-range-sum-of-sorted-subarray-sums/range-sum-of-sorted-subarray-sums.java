class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size = 0;
        for(int i : nums) size += i;
        int[] freq = new int[size + 1];
        for(int i = 0; i < n; i++) {
            int sum = nums[i];
            freq[sum]++;
            for(int j = i + 1; j < n; j++) {
                sum += nums[j];
                freq[sum]++;
            }
        }
        int i = 0, ans = 0;
        while(left > 1) {
            if(freq[i] != 0) {
                freq[i]--;
                left--;
                right--;
            } else i++;
        }
        while(i < freq.length && right > 0) {
            if(freq[i] != 0) {
                ans = (ans + i) % 1000000007;
                freq[i]--;
                right--;
            } else i++;
        }
        return ans;
    }
}