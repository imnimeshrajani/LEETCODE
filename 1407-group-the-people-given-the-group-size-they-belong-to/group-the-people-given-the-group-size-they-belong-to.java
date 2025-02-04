class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            map.computeIfAbsent(groupSize, k -> new ArrayList<>()).add(i);
            if(map.get(groupSize).size() == groupSize) {
                ans.add(List.copyOf(map.get(groupSize)));
                map.get(groupSize).clear();
            }
        }
        return ans;
    }
}