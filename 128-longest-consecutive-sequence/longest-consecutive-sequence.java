class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i : nums) 
            set.add(i);
        
        int ans = 0;
        for(int i : set) {
            int prev = i - 1, count = 0;
            if(!set.contains(prev)) {
                while(set.contains(prev + 1)) {
                    count++;
                    prev++;
                }
                ans = Math.max(ans, count);
            }
            
        }
        return ans;


    }
}