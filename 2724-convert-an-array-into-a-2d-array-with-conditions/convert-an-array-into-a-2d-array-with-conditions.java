class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList();
        for(int i : nums) map.put(i, map.getOrDefault(i,0)+1);
        for(int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList();
            for(int k : map.keySet()) {
                if(map.get(k) > 0) {
                    list.add(k);
                    map.put(k, map.get(k)-1);
                }
            }
            if(!list.isEmpty())ans.add(list);
        }
        return ans;
    }
}