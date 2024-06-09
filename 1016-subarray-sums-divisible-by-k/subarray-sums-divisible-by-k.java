class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int ans = 0, sum = 0;
        // Map<Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        // for(int i  : nums) {
        //     sum += i;
        //     int rem = sum % k;
        //     if(rem < 0) rem += k;
        //     ans += map.getOrDefault(rem, 0);
        //     map.put(rem, map.getOrDefault(rem, 0) + 1);
        // }
        // return ans;

        int count=0,sum=0,rem;
        int md[]=new int[k];
        for(int i : nums) {
            sum += i;
            rem = sum % k;
            if(rem < 0)
            rem += k;
            md[rem]++;
        }
        for(int i : md)
            if(i > 1)
                count += (i * (i - 1)) /2;

        count+=md[0];
        return count;
    }
}