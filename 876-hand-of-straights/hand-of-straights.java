class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int val : map.keySet()) {
            int start = map.get(val);
            if(start > 0) {
                for(int i = val; i < val + groupSize; i++) {
                    if(!map.containsKey(i) || map.get(i) < start) return false;
                    map.put(i, map.get(i) - start);
                }
            }
        }
        return true;
    }
}