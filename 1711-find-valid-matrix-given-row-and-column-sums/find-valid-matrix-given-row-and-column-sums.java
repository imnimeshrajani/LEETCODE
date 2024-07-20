class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        PriorityQueue<int[]> row = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        PriorityQueue<int[]> col = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for(int i = 0; i < rowSum.length; i++) {
            row.add(new int[] {rowSum[i], i});
        }
        for(int i = 0; i < colSum.length; i++) {
            col.add(new int[] {colSum[i], i});
        }

        int[][] ans = new int[rowSum.length][colSum.length];
        while(!row.isEmpty() && !col.isEmpty()) {
            int[] r = row.poll(), c = col.poll();
            int min = Math.min(r[0], c[0]);
            ans[r[1]][c[1]] = min;
            r[0] -= min;
            c[0] -= min;
            if(r[0] > 0) row.add(r);
            if(c[0] > 0) col.add(c);
        }
        return ans;
    }
}
