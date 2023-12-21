class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean colCheck[][] = new boolean[9][10]; boolean boxCheck[][] = new boolean[9][10];
        for(int i=0; i<9; i++) { boolean rowCheck[] = new boolean[10];
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') continue; 
                int val = board[i][j] - 48;
                if(rowCheck[val]) return false; 
                rowCheck[val] = true;
                if(colCheck[j][val]) return false; 
                colCheck[j][val] = true;
                if(boxCheck[(i/3) * 3 + (j/3)][val]) return false; boxCheck[(i/3) * 3 + (j/3)][val] = true; }
        } return true;
    }
}