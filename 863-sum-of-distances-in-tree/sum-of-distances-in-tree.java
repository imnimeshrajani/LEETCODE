// class Solution {
//     int[] res, count;
//     ArrayList<HashSet<Integer>> tree;
//     public int[] sumOfDistancesInTree(int N, int[][] edges) {
//         tree = new ArrayList<HashSet<Integer>>();
//         res = new int[N];
//         count = new int[N];
//         for (int i = 0; i < N ; ++i)
//             tree.add(new HashSet<Integer>());
//         for (int[] e : edges) {
//             tree.get(e[0]).add(e[1]);
//             tree.get(e[1]).add(e[0]);
//         }
//         dfs(0, -1);
//         dfs2(0, -1);
//         return res;
//     }

//     public void dfs(int root, int pre) {
//         for (int i : tree.get(root)) {
//             if (i == pre) continue;
//             dfs(i, root);
//             count[root] += count[i];
//             res[root] += res[i] + count[i];
//         }
//         count[root]++;
//     }


//     public void dfs2(int root, int pre) {
//         for (int i : tree.get(root)) {
//             if (i == pre) continue;
//             res[i] = res[root] - count[i] + count.length - count[i];
//             dfs2(i, root);
//         }
//     }
// }


class Solution {
    int[][] graph;
    int[] count;
    int[] res;
    int N;
    
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        this.N = N;
        this.res = new int[N];
        this.graph = new int[N][];
        this.count = new int[N];
        
        for (int[] e : edges) {
            ++count[e[0]];
            ++count[e[1]];
        }
        for (int i = 0; i < N; i++) {
            graph[i] = new int[count[i]];
        }
        for (int[] e : edges) {
            graph[e[0]][--count[e[0]]] = e[1];
            graph[e[1]][--count[e[1]]] = e[0];
        }
        dfs1(0, -1);
        dfs2(0, -1);
        return res;
    }
    public void dfs1(int cur, int parent) {
        count[cur] = 1;
        for (int child : graph[cur]) {
            if (child != parent) {
                dfs1(child, cur);
                count[cur] += count[child];
                res[cur] += res[child] + count[child];
            }
        }
    }
    public void dfs2(int cur, int parent) {
        for (int child : graph[cur]) {
            if (child != parent) {
                res[child] = res[cur] + N - 2 * count[child];
                dfs2(child, cur);
            }
        }
    }
}