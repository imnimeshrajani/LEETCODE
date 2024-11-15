class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length, left = 0, right = n - 1;

        while (left < right && arr[left] <= arr[left + 1]) left++;

        if (left == right) return 0;

        while (right > 0 && arr[right] >= arr[right - 1]) right--;

        int ans = Math.min(n - left - 1, right), i = 0;
        while(i <= left && right < n) {
            if(arr[right] >= arr[i]) ans = Math.min(ans, right - i++ - 1);
            else right++;
        }
        return ans;
    }
}