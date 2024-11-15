class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length, l = 0, r = n - 1;

        while (l < r && arr[l] <= arr[l + 1]) l++;

        if (l == r) return 0;

        while (r > 0 && arr[r] >= arr[r - 1]) r--;

        int ans = Math.min(n - l - 1, r), i = 0;
        while(i <= l && r < n) {
            if(arr[r] >= arr[i]) ans = Math.min(ans, r - i++ - 1);
            else r++;
        }
        return ans;
    }
}