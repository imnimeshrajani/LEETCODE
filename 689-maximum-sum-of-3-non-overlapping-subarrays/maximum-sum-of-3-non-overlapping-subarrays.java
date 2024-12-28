class Solution {    
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
		int[] res = new int[3];
        int[] psum = new int[nums.length+1];
        for(int i=1; i<psum.length; i++){
            psum[i] += psum[i-1]+nums[i-1];
        }
        
        int s1 = 0, s2 = 0, s3 = 0;
        int i1 = -1, i2 = -1, i3 = -1;
        for(int i=0; i<=nums.length - 3*k; i++){
            
            if(s1<psum[i+k] - psum[i]){
                s1 = psum[i+k] - psum[i];
                i1 = i;
            }

            if(s1+ psum[i+2*k] - psum[i+k] > s2){
                s2 = s1 + psum[i+2*k] - psum[i+k];
                i2 = i1;
                i3 = i+k;
            }

            if(s2 + psum[i+3*k] - psum[i+2*k] > s3){
                s3 = s2 + psum[i+3*k] - psum[i+2*k];
                res[0] = i2;
                res[1] = i3;
                res[2] = i+2*k;
            }
        }
        return res;
    }
}