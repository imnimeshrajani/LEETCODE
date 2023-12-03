class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int ans = 0;
        for(int i = 0; i < p.length - 1; i++) {
            int dif1 = Math.abs(p[i][0] - p[i+1][0]);
            int dif2 = Math.abs(p[i][1] - p[i+1][1]);
            ans += Math.max(dif1, dif2);
        }
        return ans;
    }
}