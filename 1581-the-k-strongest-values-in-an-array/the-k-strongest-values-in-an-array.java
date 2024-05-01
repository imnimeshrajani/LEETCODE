class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1, mid = arr[end / 2], idx = 0, ans[] = new int[k];
        while(idx < k)
            ans[idx++] = (Math.abs(arr[start] - mid) == Math.abs(arr[end] - mid)) ? (arr[start] > arr[end]) ? arr[start++] : arr[end--] : (Math.abs(arr[start] - mid) > Math.abs(arr[end] - mid)) ? arr[start++] : arr[end--];
            
        return ans;
    }
}