class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public void helper(char[][] board, List<List<String>> allBoards,int col) {
        if(col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for(int row = 0; row < board.length; row++) {
            if(isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;
        for(int i = 0; i < n; i++) if(board[row][i] == 'Q') return false;
        for(int i = 0; i < n; i++) if(board[i][col] == 'Q') return false;
        for(int c = col, r = row; c >= 0 && r >= 0; c--, r--) if(board[r][c] == 'Q') return false;
        for(int c = col, r = row; c < n && r < n; c++, r++) if(board[r][c] == 'Q') return false;
        for(int c = col, r = row; c < n && r >= 0; c++, r--) if(board[r][c] == 'Q') return false;
        for(int c = col, r = row; c >= 0 && r < n; c--, r++) if(board[r][c] == 'Q') return false;
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoard) {
        List<String> temp = new ArrayList<>();
        for(var i : board) {
            StringBuilder str = new StringBuilder();
            for(var c : i) str.append((c == 'Q')?c : '.');
            temp.add(str.toString());
        }
        allBoard.add(temp);
        System.out.println(allBoard);
    }
}