class Solution {
    public boolean placeWordInCrossword(char[][] board, String word) {
        char[] arr1 = new StringBuilder(word).reverse().toString().toCharArray();
        char[] arr2 = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '#') {
                    if(verticalCheck(board, arr1, i, j) || horizontallyCheck(board, arr1, i, j) || verticalCheck(board, arr2, i, j) || horizontallyCheck(board, arr2, i, j)) return true;
                }
            }
        }
        return false;
    }

    boolean verticalCheck(char[][] board, char[] word, int row, int col) {
        if(row - 1 >= 0 && board[row - 1][col] != '#' || row + word.length > board.length)
            return false;
        if(row + word.length < board.length && board[row + word.length][col] != '#')
            return false;
        else 
            for(int i = row; i < row + word.length; i++) 
                if(board[i][col] == word[i - row] || board[i][col] == ' ') continue;
                else return false;
            
        return true;
    }

    boolean horizontallyCheck(char[][] board, char[] word, int row, int col) {
        if((col - 1 >= 0 && board[row][col - 1] != '#') || col + word.length > board[0].length) 
            return false;
        if(col + word.length <= board[0].length) {
            if(col + word.length < board[0].length && board[row][col + word.length] != '#')     
                return false;
            else 
                for(int i = col; i < col + word.length; i++) 
                    if(board[row][i] == word[i - col] || board[row][i] == ' ') continue;
                    else return false;
        }
        return true;
    }
}