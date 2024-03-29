class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i< nums.size(); i++) {
            map.putIfAbsent(nums.get(i), new ArrayList<>());
            map.get(nums.get(i)).add(i);
        }
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            int left = 0, right = 0;
            while (right < list.size()) {
                while(list.get(right) - list.get(left) - (right - left) > k) left++;
                ans = Math.max(ans, right++ - left + 1);
            }
        }
        return ans;
    }
}