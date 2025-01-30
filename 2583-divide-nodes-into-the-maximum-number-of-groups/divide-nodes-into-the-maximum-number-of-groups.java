import java.util.*;

class Solution {
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            int a = e[0], b = e[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        int[] color = new int[n + 1];
        Arrays.fill(color, -1);
        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                color[i] = 0;
                List<Integer> component = new ArrayList<>();
                component.add(i);
                boolean isBipartite = true;

                while (!q.isEmpty()) {
                    int current = q.poll();
                    for (int neighbor : adj.get(current)) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = color[current] ^ 1;
                            q.add(neighbor);
                            component.add(neighbor);
                        } else if (color[neighbor] == color[current]) {
                            isBipartite = false;
                        }
                    }
                }

                if (!isBipartite) {
                    return -1;
                }

                Set<Integer> compSet = new HashSet<>(component);
                int maxDiameter = 0;
                for (int node : component) {
                    int[] res = bfs(node, adj, compSet);
                    maxDiameter = Math.max(maxDiameter, res[1]);
                }
                total += maxDiameter + 1;
            }
        }
        return total;
    }

    private int[] bfs(int start, List<List<Integer>> adj, Set<Integer> component) {
        int[] distance = new int[adj.size()];
        Arrays.fill(distance, -1);
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        distance[start] = 0;
        int maxDist = 0;
        int farthestNode = start;

        while (!q.isEmpty()) {
            int current = q.poll();
            for (int neighbor : adj.get(current)) {
                if (component.contains(neighbor) && distance[neighbor] == -1) {
                    distance[neighbor] = distance[current] + 1;
                    q.add(neighbor);
                    if (distance[neighbor] > maxDist) {
                        maxDist = distance[neighbor];
                        farthestNode = neighbor;
                    }
                }
            }
        }
        return new int[]{farthestNode, maxDist};
    }
}