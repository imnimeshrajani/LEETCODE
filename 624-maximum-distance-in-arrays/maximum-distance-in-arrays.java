class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0), max = arrays.get(0).get(arrays.get(0).size() - 1), ans = 0;
        boolean skip = true;
        for(List<Integer> list : arrays) {
            if(!skip) {
            ans = Math.max(Math.max(ans, Math.abs(list.get(list.size() - 1) - min)), Math.abs(max - list.get(0)));
            min = Math.min(min, list.get(0));
            max = Math.max(max, list.get(list.size() - 1));
            } else skip = false;
        }
        return ans;
    }
}