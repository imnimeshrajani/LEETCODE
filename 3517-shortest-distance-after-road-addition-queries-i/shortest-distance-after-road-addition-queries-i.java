class Solution {
    private void updateDistances(List<List<Integer>> graph, int curr, int[] dist) {
        int newDist = dist[curr] + 1;
        
        for (int neighbor : graph.get(curr)) {
            if (dist[neighbor] <= newDist) continue;
            
            dist[neighbor] = newDist;
            updateDistances(graph, neighbor, dist);
        }
    }
    
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] dist = new int[n];
        for (int i = 0; i < n; ++i) {
            dist[i] = n - 1 - i;
        }
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i + 1 < n; ++i) {
            graph.get(i + 1).add(i);
        }
        
        int[] answer = new int[queries.length];
        int queryIdx = 0;
        
        for (int[] query : queries) {
            int source = query[0];
            int target = query[1];
            
            graph.get(target).add(source);
            dist[source] = Math.min(dist[source], dist[target] + 1);
            updateDistances(graph, source, dist);
            
            answer[queryIdx++] = dist[0];
        }
        
        return answer;
    }
}