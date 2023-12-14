class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) sum += cardPoints[i];
        int max = sum;
        for(int i = cardPoints.length - 1; i >= 0 && k-1>=0; i--) {
            sum += cardPoints[i] - cardPoints[--k];
            max = Math.max(max, sum);
        }
        return max;
    }
}