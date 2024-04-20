class Solution {
    public int[] singleNumber(int[] num) {
        int xor = 0, bit = 0, ans[] = new int[2];
        for (int i : num) xor ^= i;
        for(int i = 0; i < 32; i++)
            if((xor & (1<<i)) != 0) 
                bit = 1 << i;
        for(int i : num)
            if((i & bit) == 0) ans[0] ^= i;
            else ans[1] ^= i;
        return ans;
    }
}