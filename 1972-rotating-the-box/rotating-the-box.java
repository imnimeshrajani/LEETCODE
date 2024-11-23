class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length, m = box[0].length;
        
        for (int i = 0; i < n; i++) {
            int empty = m - 1;
            for (int j = m - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    empty = j - 1;
                } else if (box[i][j] == '#') {
                    char temp = box[i][j];
                    box[i][j] = '.';
                    box[i][empty] = temp;
                    empty--;
                }
            }
        }
        
        char[][] rotated = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][n - 1 - i] = box[i][j];
            }
        }
        
        return rotated;
    }
}