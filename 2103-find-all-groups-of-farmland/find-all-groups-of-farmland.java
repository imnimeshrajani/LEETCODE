class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < land.length; i++) 
            for(int j = 0; j < land[i].length; j++) 
                if(land[i][j] == 1) 
                    list.add(helper(land,i,j));
                
        int[][] ans = new int[list.size()][4];
        for(int i = 0; i < list.size(); i++) 
            ans[i] = list.get(i);

        return ans;
    }
    int[] helper(int[][] land, int i, int j) {
        int[] arr = new int[4];
        arr[0] = i;
        arr[1] = j;
        
        int row = i, col = j;
        
        while (row < land.length && land[row][j] == 1) row++;
        while (col < land[0].length && land[i][col] == 1) col++;
        arr[2] = row - 1;
        arr[3] = col - 1;
    
        for (int k = i; k < row; k++) 
            for (int l = j; l < col; l++) 
                land[k][l] = 0;
        
        return arr;
    }
}