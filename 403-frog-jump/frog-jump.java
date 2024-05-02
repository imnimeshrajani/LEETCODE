// class Solution {
//     public boolean canCross(int[] stones) {
//         int n = stones.length;
//         int stonesFarthest = (n * (n + 1)) / 2;
//         if (stones[1] != 1 || stones[n - 1] - stones[0] > stonesFarthest) return false;

//         Map<Integer, Set<Integer>> map = new HashMap<>();
//         for(int i : stones) map.put(i, new HashSet<Integer>());
//         map.get(stones[0]).add(1);
//         for(int i : stones) {
//             Set<Integer> set = map.get(i);
//             for(Integer val : set) {
//                 if(map.containsKey(i + val)) {
//                     Set<Integer> temp = map.get(i + val);
//                     if(val > 1) temp.add(val - 1);
//                     temp.add(val);
//                     temp.add(val + 1);
//                 }
//             }
//         }
//         return !map.get(stones[n - 1]).isEmpty();
//     }
// }


class Solution {
    boolean dp[][];
    public boolean canCross(int[] stones) {
        int n = stones.length, stonesFarthest = (n * (n + 1)) / 2;
        if (stones[1] != 1 || stones[n - 1] - stones[0] > stonesFarthest) 
            return false;
        
        dp = new boolean[n][n];
        return helper(stones, 0, 1);
    }
    
    boolean helper(int[] stones, int lastStone, int currStone) {
        if (currStone == stones.length - 1) {
            return true;
        }
        if(dp[lastStone][currStone]) return false;
        int lastJump = stones[currStone] - stones[lastStone];
        int nextStone = currStone + 1;
        while (nextStone < stones.length && stones[nextStone] <= stones[currStone] + lastJump + 1) {
            int nextJump = stones[nextStone] - stones[currStone];
            if (nextJump >= lastJump - 1 && nextJump <= lastJump + 1) {
                if (helper(stones, currStone, nextStone)) {
                    return true;
                }
            }
            nextStone++;
        }
        dp[lastStone][currStone] = true;
        return false;
    }
}