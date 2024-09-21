class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        dfs(list, n, 0);
        return list;       
    }
    
    void dfs(List<Integer> list, int n, int num) {
        
        for(int i = 0; i <=9; i++) {
            int cur = 10*num + i;
            if(cur == 0) continue;
            if (cur > n) return;
            list.add(cur);
            dfs(list, n, cur);
        }
    }
}