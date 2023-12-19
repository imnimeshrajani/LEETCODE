class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length, m = img[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int sum = img[i][j], count = 1;
                if(i-1>=0) {
                    count++;
                    sum += img[i-1][j];
                }
                if(j-1>=0) {
                    count++;
                    sum += img[i][j-1];
                }
                if(j+1<m) {
                    count++;
                    sum += img[i][j+1];
                }
                if(i-1>=0 && j-1>=0) {
                    count++;
                    sum += img[i-1][j-1];
                }
                if(i-1>=0 && j+1<m) {
                    count++;
                    sum += img[i-1][j+1];
                }
                if(i+1 < n) {
                    count++;
                    sum += img[i+1][j];
                }
                if(i+1<n && j+1 < m) {
                    count++;
                    sum += img[i+1][j+1];
                }
                if(i+1 < n && j-1 >= 0) {
                    count++;
                    sum += img[i+1][j-1];
                }
                ans[i][j] = sum/count;
            }
        }
        return ans;
    }
}