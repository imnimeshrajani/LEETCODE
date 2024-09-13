class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xorArr = new int[arr.length], ans = new int[queries.length];
        xorArr[0] = arr[0];
        for(int i = 1; i < xorArr.length; i++) 
            xorArr[i] = xorArr[i - 1] ^ arr[i];
        
        for(int i = 0; i < ans.length; i++) {
            int start = queries[i][0], end = queries[i][1];
            ans[i] = (start == 0) ? xorArr[end] : xorArr[end] ^ xorArr[start - 1];
        }
        return ans;
    }
}