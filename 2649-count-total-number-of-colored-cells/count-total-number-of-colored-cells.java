class Solution {
    public long coloredCells(int n) {
        long ans = 1, tiles = 0; 
        for(int i = 2; i <= n; i++) {
            tiles += 4;
            ans += tiles;
        }
        return ans;
    }
}