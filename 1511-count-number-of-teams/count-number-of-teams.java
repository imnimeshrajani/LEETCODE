// class Solution {
//     public int numTeams(int[] rating) {
//         return helper(rating, 0, true, -1, 0, new Integer[rating.length][rating.length][4]) + helper(rating, 0, false, -1, 0, new Integer[rating.length][rating.length][4]);
//     }
//     int helper(int[] arr, int count, boolean flag, int prev, int idx, Integer[][][] dp) {
//         if(count == 3) return 1;
//         if(idx == arr.length) return 0;
//         if(dp[idx][prev + 1][count] != null) return dp[idx][prev + 1][count];
//         int notTaken = helper(arr, count, flag, prev, idx + 1, dp), taken = 0;
//         if(flag) {
//             if(prev == -1 || arr[idx] > arr[prev]) 
//                 taken = helper(arr, count + 1, flag, idx, idx + 1, dp);
//         } else {
//             if(prev == -1 || arr[idx] < arr[prev]) {
//                 taken = helper(arr, count + 1, flag, idx, idx + 1, dp);
//             }
//         }
//         return dp[idx][prev + 1][count] = taken + notTaken;
//     }
// }

class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        if (n < 3) return 0;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : rating) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        int[] leftTree = new int[max - min + 2];
        int[] rightTree = new int[max - min + 2];
        
        for (int num : rating) {
            update(rightTree, num - min, 1);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            update(rightTree, rating[i] - min, -1);
            
            int lessLeft = query(leftTree, rating[i] - min - 1);
            int greaterLeft = i - lessLeft;
            
            int lessRight = query(rightTree, rating[i] - min - 1);
            int greaterRight = (n - i - 1) - lessRight;
            
            count += lessLeft * greaterRight + greaterLeft * lessRight;
            
            update(leftTree, rating[i] - min, 1);
        }
        
        return count;
    }

    private void update(int[] tree, int index, int value) {
        index++;
        while (index < tree.length) {
            tree[index] += value;
            index += index & (-index);
        }
    }

    private int query(int[] tree, int index) {
        int sum = 0;
        index++;
        while (index > 0) {
            sum += tree[index];
            index -= index & (-index);
        }
        return sum;
    }
}