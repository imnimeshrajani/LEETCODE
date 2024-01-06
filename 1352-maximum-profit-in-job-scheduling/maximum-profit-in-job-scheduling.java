class Solution {
    public int jobScheduling(int[] sTime, int[] eTime, int[] profit) {
        int n = sTime.length;
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++){
            arr[i][0] = sTime[i];
            arr[i][1] = eTime[i];
            arr[i][2] = profit[i];
        }
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = arr[0][2];
        for(int i = 1; i < n; i++){
            int currProfit = arr[i][2], prev = binarySearch(arr, i);
            if(prev != -1) currProfit += dp[prev];
            dp[i] = Math.max(currProfit, dp[i - 1]);
        }
        return dp[n - 1];
    }

     public static int binarySearch(int[][] arr, int i){
        int start = 0, end = i - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid][1] <= arr[i][0]){
                if(arr[mid + 1][1] <= arr[i][0]) start = mid + 1;
                else return mid;
            } else end = mid - 1;
        }
        return -1;
    }
}