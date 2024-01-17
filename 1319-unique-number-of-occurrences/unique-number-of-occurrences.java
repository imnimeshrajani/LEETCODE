class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i, 0)+1);
        for(var val : map.entrySet()) {
            int v = val.getValue();
            val.setValue(-1);
            if(map.containsValue(v)) return false;
        }
        return true;
    }
}