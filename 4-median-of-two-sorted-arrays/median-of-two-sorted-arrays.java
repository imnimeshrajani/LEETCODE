class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n1 = nums1.length, n2  = nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);

        int total = n1 +n2;
        int left = (n1+n2+1)/2;

        int low = 0;
        int high = n1;

        while(low<=high){
            int mid1 = low+(high-low)/2;
            int mid2 = left-mid1;
            

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1  = Integer.MAX_VALUE, r2  = Integer.MAX_VALUE;

            if(mid1<n1) r1 = nums1[mid1];
            if(mid2<n2) r2 = nums2[mid2];
            if(mid1-1>=0) l1= nums1[mid1-1];
            if(mid2-1>=0) l2 = nums2[mid2-1];
            if(l1<=r2 && l2<=r1)
                return (total%2 ==1) ? Math.max(l1,l2) : ((double)(Math.max(l1,l2)+ Math.min(r1,r2)))/2.0;
            else if(l1> r2) high = mid1-1;
            else low = mid1+ 1;
        }

        return 0;

        // int n = nums1.length, m = nums2.length;
        // int i = 0, j = 0, m1 = 0, m2 = 0;
        // for (int count = 0; count <= (n + m) / 2; count++) {
        //     m2 = m1;
        //     if (i != n && j != m) {
        //         if (nums1[i] > nums2[j]) m1 = nums2[j++];
        //         else m1 = nums1[i++];
        //     } else if (i < n) m1 = nums1[i++];
        //     else m1 = nums2[j++];
        // }
        // return (double) (n + m) % 2 == 1 ? m1 : ((double) m1 + (double) m2) / 2.0;
    }
}