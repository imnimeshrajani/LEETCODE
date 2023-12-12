class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows * cols][2];
        int k = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                ans[k][0] = i;
                ans[k++][1] = j;
            }   
        }
        Arrays.sort(ans,(o1,o2)->
           Math.abs(o1[0]-rCenter)+Math.abs(o1[1]-cCenter) - (Math.abs(o2[0]-rCenter) + Math.abs(o2[1]-cCenter))
        );
        return ans;
    }
}