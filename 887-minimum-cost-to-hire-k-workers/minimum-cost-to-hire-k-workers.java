class Solution {
    class Pair {
        double ratio;
        int worker;
        Pair (double ratio, int worker) {
            this.ratio = ratio;
            this.worker = worker;
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Pair> list  = new ArrayList<>();
        int qualitySum = 0;
        double ans = 0.0, maxRate = 0.0;
        for(int i = 0;  i < quality.length; i++) 
            list.add(new Pair((double)wage[i]/quality[i], i));
        list.sort(Comparator.comparingDouble(value -> value.ratio));
        for(int i = 0; i < k; i++) {
            qualitySum += quality[list.get(i).worker];
            maxRate = Math.max(maxRate, list.get(i).ratio);
            pq.add(quality[list.get(i).worker]);
        }
        ans = maxRate * qualitySum;
        for(int i = k; i < quality.length; i++) {
            maxRate = Math.max(maxRate, list.get(i).ratio);
            qualitySum -= pq.poll();
            qualitySum += quality[list.get(i).worker];
            pq.add(quality[list.get(i).worker]);
            ans = Math.min(ans, maxRate * qualitySum);
        }
        return ans;
    }
}