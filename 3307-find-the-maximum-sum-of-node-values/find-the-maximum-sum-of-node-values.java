class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        // int n = nums.length, xorArray[] = new int[n];;
        // if(n == 1) return nums[0];

        // for(int i = 0; i < n; i++)
        //     xorArray[i] = (nums[i] ^ k);

        // long option = xorArray[0], ans = nums[0];
        // for(int i = 1; i < n; i++) {
        //     long tempOption = Math.max(option + nums[i], ans + xorArray[i]);
        //     long tempAns = Math.max(ans + nums[i], option + xorArray[i]);
        //     option = tempOption;
        //     ans = tempAns;
        // }
        // return ans;


        long sum = 0, minExtra = 1000000;
        int count = 0;

        for( int val : nums) {
            if ((val ^ k) > val ) {
                sum += val ^ k;
                count++;
            } else {
                sum += val;
            }
            minExtra = Math.min(minExtra, Math.abs((val ^ k)- val));
        }

        return (count % 2 == 0 ) ? sum : sum - minExtra;

    }
}