class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0, m1 = 0, m2 = 0;
        for (int count = 0; count <= (n + m) / 2; count++) {
            m2 = m1;
            if (i != n && j != m) m1 = (nums1[i] > nums2[j]) ? nums2[j++] : nums1[i++];
            else if (i < n) m1 = nums1[i++];
            else m1 = nums2[j++];
        }
        return (double) (n + m) % 2 == 1 ? m1 : ((double) m1 + (double) m2) / 2.0;
    }
}