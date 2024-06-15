class Solution {
    class Pair {
        int capital, profit;
        Pair(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Pair[] arr = new Pair[capital.length];
        for(int i = 0; i < arr.length; i++) 
            arr[i] = new Pair(capital[i], profits[i]);
          
        Arrays.sort(arr, (a, b) -> a.capital - b.capital);
        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0, idx = 0; i < k; i++) {
            while(idx < arr.length &&  arr[idx].capital <= w) que.add(arr[idx++].profit);
            if(que.isEmpty()) return w;
            w += que.poll();
        }
        return w;
    }
}