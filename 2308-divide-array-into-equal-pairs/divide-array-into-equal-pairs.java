class Solution {
    public boolean divideArray(int[] nums) {
        int xor1 = 0, xor2 = 0;
        for(int val : nums) {
            xor1 ^= val + 1;
            xor2 ^= val;
        }
        return xor1 == 0 && xor2 == 0;
    }
}