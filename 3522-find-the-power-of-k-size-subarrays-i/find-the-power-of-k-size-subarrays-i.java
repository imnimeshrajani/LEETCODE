class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1) return nums;
        int n = nums.length, l = 0, r = 1;
        List<Integer> ans = new ArrayList<>();
        while(r < n) {
            boolean isCons = (nums[r] - 1 == nums[r - 1]);
            System.out.println(isCons);
            if(!isCons) {
                while(l < r && (l + k - 1) < n) {
                    ans.add(-1);
                    l++;
                }
                l = r;
            } else if(r - l == k - 1) {
                ans.add(nums[r]);
                l++;
            }
            r++;
        }
        int[] ansArr = new int[ans.size()];
        for(int i = 0; i < ansArr.length; i++) 
            ansArr[i] = ans.get(i);
        
        return ansArr;
    }
}