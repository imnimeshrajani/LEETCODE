class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length) return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : bloomDay) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        while(min <= max) {
            int mid = min + (max - min) / 2, flowersCount = helper(bloomDay, mid, k);
            if(flowersCount < m) min = mid + 1;
            else max = mid - 1;
        }
        return min;
    }
    
    int helper(int[] arr, int day, int k) {
        int bouquets = 0, collectedFlowers = 0;
        for(int i : arr) {
            collectedFlowers = (i <= day) ? ++collectedFlowers : 0;
            if(collectedFlowers == k) {
                bouquets++;
                collectedFlowers = 0;
            }
        }
        return bouquets;
    }
}