class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        int[] newRow = new int[matrix[0].length];
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }

        }
        for(int i = 0; i<row.size(); i++){
            matrix[row.get(i)] = newRow;
            int pos = col.get(i);
            for(int j = 0; j<matrix.length;j++){
                matrix[j][pos] = 0;
            }
        }
    }
}