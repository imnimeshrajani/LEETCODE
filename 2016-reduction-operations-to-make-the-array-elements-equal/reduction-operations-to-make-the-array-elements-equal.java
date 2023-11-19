class Solution {
    public int reductionOperations(int[] nums) {
        int[] freq = new int[50001];
        for(int i : nums) freq[i]++;
        int ans = 0, count = 0;
        for(int i = freq.length-1; i >= 0; i--) {
            if(freq[i]>0){
                count += freq[i];
                ans += count - freq[i]; 
            }
        }
        return ans;
    }
}