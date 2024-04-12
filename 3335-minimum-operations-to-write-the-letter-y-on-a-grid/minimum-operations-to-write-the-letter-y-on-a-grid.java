class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        int y0 = 0, y1 = 0, y2 = 0, w0 = 0, w1 = 0, w2 = 0, ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i < grid.length / 2 && (i == j || j == grid[0].length - i - 1)) {
                    if (grid[i][j] == 0)
                        y0++;
                    else if (grid[i][j] == 1)
                        y1++;
                    else
                        y2++;
                } else if (i >= grid.length / 2 && j == grid[0].length / 2) {
                    if (grid[i][j] == 0)
                        y0++;
                    else if (grid[i][j] == 1)
                        y1++;
                    else
                        y2++;
                } else {
                    if (grid[i][j] == 0)
                        w0++;
                    else if (grid[i][j] == 1)
                        w1++;
                    else
                        w2++;
                }
            }
        }

        ans = Math.min(ans,w1 + w2 + y1 + y0);
        ans = Math.min(ans,w1 + w2 + y0 + y2); 
        ans = Math.min(ans,w0 + w2 + y1 + y2);
        ans = Math.min(ans,w0 + w2 + y0 + y1);
        ans = Math.min(ans,w0 + w1 + y1 + y2);
        ans = Math.min(ans,w0 + w1 + y0 + y2);   
        return ans;
    }
}