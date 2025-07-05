class Solution {
    public int findLucky(int[] arr) {
        int max = -1, maxValue = 0;
        int[] freq = new int[501];
        for(int val: arr) {
            freq[val]++;
            maxValue = Math.max(maxValue, val);
        }
        for(int i = 1; i <= maxValue; i++) {
            if(freq[i] == i) max = Math.max(max, i);
        }
        return max;
    }
}