class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] isBanned = new boolean[10001];
        for (int ban : banned) isBanned[ban] = true;
        
        int sum = 0, ans = 0;
        for(int i = 1; i <= n; i++) {
            if(isBanned[i]) continue;
            if(sum + i > maxSum) break; 
            sum += i;
            ans++;
        }
        return ans;
    }
}