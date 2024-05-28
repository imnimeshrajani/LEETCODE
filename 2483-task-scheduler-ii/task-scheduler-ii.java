class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        Map<Integer, Long> map = new HashMap<>();
        long ans = 0, count = 0;
        for(int i : tasks) {
            Long val = map.get(i);
            if(val != null && !(ans - val - 1 >= space)) 
                ans = val + space + 1;
            map.put(i, ans++);
        }
        return ans;
    }
}