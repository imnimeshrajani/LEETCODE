class Solution {
    public void gameOfLife(int[][] board) {
        int[][] ans = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            int m = board.length;
            for (int j = 0; j < board[0].length; j++) {
                int sum = 0;
                int n = board[0].length;
                if (i - 1 >= 0) {
                    if (j - 1 >= 0) sum += board[i - 1][j - 1];
                    if (j + 1 < n) sum += board[i - 1][j + 1];
                    sum += board[i - 1][j];
                }
                if (i + 1 < m) {
                    if (j - 1 >= 0) sum += board[i + 1][j - 1];
                    if (j + 1 < n) sum += board[i + 1][j + 1];
                    sum += board[i + 1][j];

                }
                if (j - 1 >= 0) sum += board[i][j - 1];
                if (j + 1 < n) sum += board[i][j + 1];

                if (board[i][j] == 1) {
                    System.out.println("When 1 Sum around: " + i + " is: " + sum);
                    if (sum < 2) ans[i][j] = 0;
                    else if (sum == 2 || sum == 3) ans[i][j] = 1;
                    else ans[i][j] = 0;
                } else {
                    System.out.println("When 0 Sum around: " + i + " is: " + sum);
                    if (sum == 3) ans[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ans[i][j];
            }
        }
    }
}