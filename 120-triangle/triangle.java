class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return 0;
        int m = triangle.size()-1, n = triangle.get(m).size();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) ans[i] = triangle.get(m).get(i);
    
        for(int i = n - 2; i >= 0; i--){
            List<Integer> cur = triangle.get(i);
            for(int j = 0; j < cur.size(); j++){
                ans[j] = Math.min(ans[j], ans[j + 1]) + cur.get(j);
            }
        }
        return ans[0];
    }
}