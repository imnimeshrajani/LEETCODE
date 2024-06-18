class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        if (difficulty.length != profit.length) return 0;
        int max = 0, ans = 0;
        for(int i : difficulty) max = Math.max(max, i);
        int[] arr = new int[max + 1];
        for(int i = 0; i < difficulty.length; i++) 
            arr[difficulty[i]] = Math.max(arr[difficulty[i]], profit[i]);
        for(int i = 1; i <= max; i++) 
            arr[i] = Math.max(arr[i], arr[i - 1]);
        for(int i : worker) 
            ans += (i > max) ? arr[max] : arr[i];
        
        return ans;
    }
}