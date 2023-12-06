class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length, ans = 0, index = 0;
        if(n % 2 == 0 && m % 2 == 0) return ans;
        if(n % 2 != 0 && m % 2 != 0){
            while(n!=index) ans ^= nums1[index++];
            index = 0;
            while(m!=index) ans ^= nums2[index++];
            return ans;
        }
        if(n % 2 != 0) {
            while(m!=index) ans ^= nums2[index++];
            return ans;
        } else {
            while(n!=index) ans ^= nums1[index++];
            return ans;
        }

    }
}