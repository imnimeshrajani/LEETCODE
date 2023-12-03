class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 0; i < points.length - 1; i++) {
            int dif1 = Math.abs(points[i][0] - points[i+1][0]);
            int dif2 = Math.abs(points[i][1] - points[i+1][1]);
            ans += Math.max(dif1, dif2);
        }
        return ans;
    }
}