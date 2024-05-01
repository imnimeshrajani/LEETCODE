class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1, mid = end / 2, idx = 0, ans[] = new int[k];
        while(idx < k) {
            if(Math.abs(arr[start] - arr[mid]) == Math.abs(arr[end] - arr[mid])) {
                ans[idx++] = (arr[start] > arr[end]) ? arr[start++] : arr[end--];
            } else {
                ans[idx++] = (Math.abs(arr[start] - arr[mid]) > Math.abs(arr[end] - arr[mid])) ? arr[start++] : arr[end--];
            }
        }
        return ans;
    }
}