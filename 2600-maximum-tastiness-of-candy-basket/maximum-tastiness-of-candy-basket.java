class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int start = 0, end = price[price.length - 1], ans = 0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isValid(price, mid, k)){
                ans = mid;
                start = mid + 1;
            } else 
                end = mid - 1;
        }
        return ans;
    }
    boolean isValid(int[] price, int target, int k) {
        int prev = price[0], count = 1;
        for(int i = 1; i < price.length; i++) {
            if(price[i] - prev >= target) {
                prev = price[i];
                count++;
            }
        }
        return count >= k;
    }
}