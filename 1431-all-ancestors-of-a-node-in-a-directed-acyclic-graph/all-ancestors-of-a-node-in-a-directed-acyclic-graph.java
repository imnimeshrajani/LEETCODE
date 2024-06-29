class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) ans.add(new ArrayList<>());
        ArrayList<Integer>[] arr = new ArrayList[n];
        for(int i = 0; i < n; i++)
            arr[i] = new ArrayList<>();
        for(int[] edge : edges)
            arr[edge[0]].add(edge[1]);
        for(int i = 0; i < n; i++) 
            helper(arr, i, i, ans, new boolean[n]);
        for(List<Integer> list : ans)
            Collections.sort(list);

        return ans;
    }
    void helper(ArrayList<Integer>[] arr, int prev, int curr, List<List<Integer>> ans, boolean[] visited) {
        visited[curr] = true;
        for(int i : arr[curr]) {
            if(!visited[i]) {
                ans.get(i).add(prev);
                helper(arr, prev, i, ans, visited);
            }
        }
    }
}