class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length, m = img[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int sum = 0, count = 0;
                for(int k = -1; k <= 1; k++) {
                    for(int l = -1; l <= 1; l++) {
                        int nx = i + k;
                        int ny = j + l;
                        if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        sum += img[nx][ny];
                        count++;
                    }
                }
                ans[i][j] = sum/count;
            }
        }
        return ans;
    }
}