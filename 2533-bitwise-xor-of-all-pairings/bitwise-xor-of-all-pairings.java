class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length, ans = 0;
        if(n % 2 == 0 && m % 2 == 0) return ans;
        if(n % 2 == 0) return xor(nums1);
        if(m % 2 == 0) return xor(nums2);
        return xor(nums1) ^ xor(nums2);
    }
    public int xor(int[] a) {
        int value = 0;
        for(int i = 0; i < a.length; i++) value ^= a[i];
        return value;
    }
}