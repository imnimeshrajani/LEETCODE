class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 0, right = 1_000_000_000, ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(isValid(mid, nums, k)) {
                ans = mid;
                right = mid - 1;
            } else 
                left = mid + 1;

           
        }
        return ans;

    }

    private boolean isValid(int mid, int[] arr, int k) {
        for(int i = 0, taken = 0; i < arr.length; i++) {
            if(arr[i] <= mid) {
                taken++;
                i++;
            }
            if(taken == k) return true;
        }
        return false;
    }
}