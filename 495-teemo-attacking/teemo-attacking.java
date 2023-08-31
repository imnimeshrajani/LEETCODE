class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (i < timeSeries.length - 1 && timeSeries[i + 1] < timeSeries[i] + duration) {
                sum -= (timeSeries[i]+duration) - timeSeries[i+1];
            }
                sum += duration;
        }
        return sum;
    }
}