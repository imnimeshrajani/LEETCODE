class Solution {
    public int tupleSameProduct(int[] nums) {
        if(nums.length < 4) return 0;
        int ans = 0;
        Map<Integer, Integer> map = new  HashMap<>();
        for(int i = 0; i <nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int product = nums[i]*nums[j];
                ans+=(map.getOrDefault(product,0)*8);
                map.merge(product,1,Integer::sum);
            }
        }
        return ans;

    }
}