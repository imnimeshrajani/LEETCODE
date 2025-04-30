class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int val : nums) {
            int count = 0;
            while(val != 0) {
                count++;
                val /= 10;
            }
            if(count % 2 == 0) ans++;
        }
        return ans;
    }
}