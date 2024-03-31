class Solution {
    public long minimumMoney(int[][] transactions) {
        long res = 0, v = 0;
        for (int[] arr : transactions) {
            v = Math.max(v, Math.min(arr[0], arr[1]));
            res += Math.max(0, arr[0] - arr[1]);
        }
        return res + v;
    }
}