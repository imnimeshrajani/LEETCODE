class Solution {
    // public boolean isNStraightHand(int[] hand, int groupSize) {
    //     if(hand.length % groupSize != 0) return false;
    //     TreeMap<Integer, Integer> map = new TreeMap<>();
    //     for(int i : hand) {
    //         map.put(i, map.getOrDefault(i, 0) + 1);
    //     }
    //     for(int val : map.keySet()) {
    //         int start = map.get(val);
    //         if(start > 0) {
    //             for(int i = val; i < val + groupSize; i++) {
    //                 if(!map.containsKey(i) || map.get(i) < start) return false;
    //                 map.put(i, map.get(i) - start);
    //             }
    //         }
    //     }
    //     return true;
    // }

    public boolean findsucessors(int[] hand, int groupSize, int i, int n) {
        int f = hand[i] + 1;
        hand[i] = -1;
        int count = 1;
        i += 1;
        while (i < n && count < groupSize) {
            if (hand[i] == f) {
                f = hand[i] + 1;
                hand[i] = -1;
                count++;
            }
            i++;
        }
        return count == groupSize;
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0)
            return false;
        Arrays.sort(hand);
        int i = 0;
        for (; i < n; i++) {
            if (hand[i] >= 0) {
                if (!findsucessors(hand, groupSize, i, n))
                    return false;
            }
        }
        return true;
    }
}