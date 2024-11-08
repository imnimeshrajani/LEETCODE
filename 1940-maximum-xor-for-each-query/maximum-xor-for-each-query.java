class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        for(int i = 1; i < nums.length; i++) 
            nums[i] ^= nums[i - 1];
        
        int ans[] = new int[nums.length], position = ans.length - 1, xor = 2;
        for(int i = 1; i < maximumBit; i++) 
            xor *= 2;
            
        xor--;
        
        for(int i = 0; i < nums.length; i++) 
            ans[position--] = nums[i] ^ xor;
        
        return ans;

    }
}