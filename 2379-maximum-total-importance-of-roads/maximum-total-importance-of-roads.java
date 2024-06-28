class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] paths = new int[n], freq = new int[n];
        for(int[] road : roads) {
            paths[road[0]]++;
            paths[road[1]]++;
        }
        for(int i : paths) freq[i]++;
        long ans = 0, value = 1;
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < freq[i]; j++)
                ans += i * value++;

        return ans;
    }
}