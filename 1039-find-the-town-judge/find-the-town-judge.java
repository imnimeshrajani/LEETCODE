class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] freq = new int[n+1];
        for(int i = 0; i < trust.length; i++) {
            freq[trust[i][1]]++;
        }
        int ans = 0;
        for (int i = 1; i < n+1; i++) {
            if(freq[i] == n-1) ans = i;
        } 
        for(int i  = 0; i < trust.length; i++) {
            if(trust[i][0] == ans) return -1;
        }
        return ans == 0 ? -1 : ans;
    }
}