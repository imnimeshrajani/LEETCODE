class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] < nums2[j] && i+1 < nums1.length) i++;
            else if(nums1[i] > nums2[j] && j+1 < nums2.length) j++;
            else return -1;
        }
        return -1;
    }
}