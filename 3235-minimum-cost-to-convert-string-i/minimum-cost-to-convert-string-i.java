class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int graph[][] = new int[26][26];
        long ans = 0;
        for(int i = 0; i < 26; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE);
            graph[i][i] = 0;
        }
        for(int i = 0; i < cost.length; i++)
            graph[original[i] - 'a'][changed[i] - 'a'] = Math.min(graph[original[i] - 'a'][changed[i] - 'a'], cost[i]);
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < 26; j++) {
                if(graph[j][i] != Integer.MAX_VALUE) {
                    for(int k = 0; k < 26; k++) {
                        if(graph[i][k] != Integer.MAX_VALUE) graph[j][k] = Math.min(graph[j][k], graph[i][k] + graph[j][i]);
                    }
                }
            }
        }
        char[] src = source.toCharArray(), tar = target.toCharArray();
        for(int i = 0; i < src.length; i++) {
            if(graph[src[i] - 'a'][tar[i] - 'a'] == Integer.MAX_VALUE) return -1;
            ans += graph[src[i] - 'a'][tar[i] - 'a'];
        }
        return ans;
    }
}