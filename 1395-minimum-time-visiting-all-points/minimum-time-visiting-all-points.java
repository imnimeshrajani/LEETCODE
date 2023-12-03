class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 0; i < points.length - 1; i++) {
            int diff1 = Math.abs(points[i][0] - points[i+1][0]);
            int diff2 = Math.abs(points[i][1] - points[i+1][1]);
            if(diff1 == diff2) ans += diff1;
            else if(diff1 < diff2) ans += diff2;
            else ans += diff1;
        }
        return ans;
    }
}