// class Solution {
//     class Pair {
//         double ratio;
//         int worker;
//         Pair (double ratio, int worker) {
//             this.ratio = ratio;
//             this.worker = worker;
//         }
//     }
//     public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         List<Pair> list  = new ArrayList<>();
//         int qualitySum = 0;
//         double ans = 0.0, maxRate = 0.0;
//         for(int i = 0;  i < quality.length; i++) 
//             list.add(new Pair((double)wage[i]/quality[i], i));
//         list.sort(Comparator.comparingDouble(value -> value.ratio));
//         for(int i = 0; i < k; i++) {
//             qualitySum += quality[list.get(i).worker];
//             maxRate = Math.max(maxRate, list.get(i).ratio);
//             pq.add(quality[list.get(i).worker]);
//         }
//         ans = maxRate * qualitySum;
//         for(int i = k; i < quality.length; i++) {
//             maxRate = Math.max(maxRate, list.get(i).ratio);
//             qualitySum -= pq.poll();
//             qualitySum += quality[list.get(i).worker];
//             pq.add(quality[list.get(i).worker]);
//             ans = Math.min(ans, maxRate * qualitySum);
//         }
//         return ans;
//     }
// }

class Worker implements Comparable<Worker> {
    final int q, w;
    public Worker(int q, int w) {
        this.q = q;
        this.w = w;
    }
    @Override
    public int compareTo(Worker other) {
        return Integer.compare(w * other.q, q * other.w);
    }
}
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] a = new Worker[n];
        for (int i = 0; i < n; ++i) {
            a[i] = new Worker(quality[i], wage[i]);
        }
        Arrays.sort(a);

        int s = 0;
        double res = 1e15;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (Worker worker: a) {
            q.add(-worker.q);
            s += worker.q;
            if (q.size() > k) s += q.poll();
            if (q.size() == k) res = Math.min(res, (double) s * worker.w / worker.q);
        }
        return res;
    }
}