// class Solution {
//     public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
//         int size = rows * cols, ans[][] = new int[size][2];
//         if(size == 1) return ans;
//         int dist = 0, row = rStart, col = cStart, dirs[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}, idx = 0, count = 1;
//         ans[0] = new int[] {row, col};
//         while(count < size) {
//             if(idx == 0 || idx == 2) dist++;
//             for(int i = 1; i <= dist; i++) {
//                 row += dirs[idx][0];
//                 col += dirs[idx][1];
//                 if(row >= 0 && row < rows && col >= 0 && col < cols) 
//                     ans[count++] = new int[] {row, col};
//             }
//             idx = (idx + 1) % 4;
//         }
//         return ans;
//     }
// }

class Solution {
int minX, minY, maxX, maxY, index;

    int[][] result;

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        int n = cols * rows;
        result = new int[n][];

        minX = cStart;
        maxX = cStart + 1;
        minY = rStart;
        maxY = rStart;
        index = 0;
        result[index++] = new int[]{rStart, cStart};

        while (true) {
            if (minY >= 0) right(Math.max(0, minX + 1), Math.min(cols - 1, maxX));
            maxY++;
            if (index >= n) break;

            if (maxX < cols) down(Math.max(0, minY + 1), Math.min(rows - 1, maxY));
            minX--;
            if (index >= n) break;

            if (maxY < rows) left(Math.min(cols - 1, maxX - 1), Math.max(0, minX));
            minY--;
            if (index >= n) break;

            if (minX >= 0) up(Math.min(rows - 1, maxY - 1), Math.max(0, minY));
            maxX++;
            if (index >= n) break;
        }
        return result;
    }

    public void right(int start, int end) {
        for (int i = start; i <= end; i++) 
            result[index++] = new int[]{minY, i};
    }

    public void left(int start, int end) {
        for (int i = start; i >= end; i--) 
           result[index++] = new int[]{maxY, i};
    }

    public void down(int start, int end) {
        for (int i = start; i <= end; i++) 
            result[index++] = new int[]{i, maxX};
    }

    public void up(int start, int end) {
        for (int i = start; i >= end; i--) 
           result[index++] = new int[]{i, minX};
    }
}