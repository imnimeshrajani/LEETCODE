// class Solution {
//     public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
//         int grid[][] = new int[m][n], ans = 0;
//         for(int[] wall : walls) 
//             grid[wall[0]][wall[1]] = 1;
        
//         for(int[] guard : guards) 
//             grid[guard[0]][guard[1]] = 2;

//         for(int[] guard : guards) {
//             for(int i = guard[1] + 1; i < n; i++) {
//                 if(grid[guard[0]][i] == 1 || grid[guard[0]][i] == 2) break;
//                 grid[guard[0]][i] = 3;
//             }
//             for(int i = guard[1] - 1; i >= 0; i--) {
//                 if(grid[guard[0]][i] == 1 || grid[guard[0]][i] == 2) break;
//                 grid[guard[0]][i] = 3;
//             }
//             for(int i = guard[0] + 1; i < m; i++) {
//                 if(grid[i][guard[1]] == 1 || grid[i][guard[1]] == 2) break;
//                 grid[i][guard[1]] = 3;
//             }
//             for(int i = guard[0] - 1; i >= 0; i--) {
//                 if(grid[i][guard[1]] == 1 || grid[i][guard[1]] == 2) break;
//                 grid[i][guard[1]] = 3;
//             }
//         }
        
//         for(int[] row : grid) {
//             for(int col : row) {
//                 if(col == 0) ans++;
//             }
//         }
//         return ans;
//     }
// }





class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        int r, c;
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 1;
        }
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 1;
        }
        int count = 0;
        for (int[] guard : guards) {
            r = guard[0] - 1;
            c = guard[1];
            while (r >= 0 && grid[r][c] != 1) {
                if (grid[r][c] != -1) {
                    count++;
                    grid[r][c] = -1;
                }
                r--;
            }
            r = guard[0] + 1;
            while (r < m && grid[r][c] != 1) {
                if (grid[r][c] != -1) {
                    count++;
                    grid[r][c] = -1;
                }
                r++;
            }
            r = guard[0];
            c = guard[1] - 1;
            while (c >= 0 && grid[r][c] != 1) {
                if (grid[r][c] != -1) {
                    count++;
                    grid[r][c] = -1;
                }
                c--;
            }
            c = guard[1] + 1;
            while (c < n && grid[r][c] != 1) {
                if (grid[r][c] != -1) {
                    count++;
                    grid[r][c] = -1;
                }
                c++;
            }
        }
        return m * n - guards.length - walls.length - count;
    }
}