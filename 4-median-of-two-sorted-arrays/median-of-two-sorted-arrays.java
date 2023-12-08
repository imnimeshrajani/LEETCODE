class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int size = n1.length + n2.length;
        // int pos1 = 0, pos2 = 0;
        // boolean flag = false;
        // if(size % 2 == 1) pos1 = size/2;
        // else {
        //     pos1 = size / 2;
        //     pos2 = size - 1;
        //     flag = true;
        // }
        // int s1 = 0, s2 = 0, e1 = n1.length - 1, e2 = n2.length - 1;
        // int mid1 = s1 + (s1 - e1)/2, mid2 = s2 + (s2 - e2)/2;
        // while(flag ? mid1 == pos1 && mid2  == pos2 : mid1 + mid2 != pos1){
        //     if(n1[mid1] < n2[mid2]){
        //         s1 = mid1;
        //         mid1 = s1 + (s1 - e1) / 2;
        //     } else if(n1[mid1] > n2[mid2]){
        //         s2 = mid2;
        //         mid2 = s2 + (s2 - e2) / 2;
        //     }
        // }

        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0, m1 = 0, m2 = 0;
        for (int count = 0; count <= (n + m) / 2; count++) {
            m2 = m1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) m1 = nums2[j++];
                else m1 = nums1[i++];
            } else if (i < n) m1 = nums1[i++];
            else m1 = nums2[j++];
        }
        return (double) (n + m) % 2 == 1 ? m1 : ((double) m1 + (double) m2) / 2.0;
    }
}