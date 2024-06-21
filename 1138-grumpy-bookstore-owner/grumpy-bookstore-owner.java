class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0, n = grumpy.length, sum = 0, max = 0, start = 0, end = 0, diff = minutes;
        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 0) {
                ans += customers[i];
                customers[i] = 0;
            }
        }
        while(end < n) {
            if(minutes > 0) {
                sum += customers[end++];
                minutes--;
            } else {
                sum -= customers[start++];
                minutes++;
            }
            max = Math.max(max, sum);
        }
        return ans + max;
    }
}