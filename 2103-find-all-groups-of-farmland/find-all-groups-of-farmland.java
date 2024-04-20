class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public int[][] findFarmland(int[][] land) {
        for(int i = 0; i < land.length; i++) {
            check(land, i);
        }
        int[][] ans = new int[list.size()][4];
        for(int i = 0; i < list.size(); i++) 
            for(int j = 0; j < 4; j++) 
                ans[i][j] = list.get(i).get(j);

        return ans;
    }
    void check(int[][] land, int i) {
        for(int j = 0; j < land[i].length; j++) {
            if(land[i][j] == 1) {
                List<Integer> subList = new ArrayList<>();
                subList.add(i);
                subList.add(j);
                list.add(subList);
                helper(land,i,j);
            }
        }
    }

    int helper(int[][] land, int i, int j) {
        if(land[i][j] == 0) return 0;
        land[i][j] = 0;
        int right = 0, bottom = 0;
        if(i < land.length - 1) bottom = helper(land, i + 1, j);
        if(j < land[i].length - 1) right = helper(land, i, j + 1);
        
        if(right == 0 && bottom == 0) {
            List<Integer> subList = list.get(list.size() - 1);
            subList.add(i);
            subList.add(j);
        }
        return 1;
    }
}