class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int size = rows * cols, ans[][] = new int[size][2];
        if(size == 1) return ans;
        int dist = 0, row = rStart, col = cStart, dirs[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}, idx = 0, count = 1;
        ans[0] = new int[] {row, col};
        while(count < size) {
            if(idx == 0 || idx == 2) dist++;
            for(int i = 1; i <= dist; i++) {
                row += dirs[idx][0];
                col += dirs[idx][1];
                if(row >= 0 && row < rows && col >= 0 && col < cols) 
                    ans[count++] = new int[] {row, col};
            }
            idx = (idx + 1) % 4;
        }
        return ans;
    }
}