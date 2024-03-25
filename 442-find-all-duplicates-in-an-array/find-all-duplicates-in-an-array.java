class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>(nums.length);
        ans.add(-1);
        for(int i : nums) ans.add(-1);
        for(int i : nums) ans.set(i, ans.get(i)+1);
        for(int i = 0; i < ans.size(); i++) 
            if(ans.get(i) == 1) ans.set(i, i); 
        for(int i = 0; i < ans.size(); i++) 
            if(ans.get(i) < 1) ans.remove(i--);
        return ans;
    }
}