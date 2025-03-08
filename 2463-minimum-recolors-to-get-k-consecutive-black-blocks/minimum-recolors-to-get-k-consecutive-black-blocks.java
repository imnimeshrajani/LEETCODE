class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] arr = blocks.toCharArray();
        int W = 0, B = 0, ans = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            if(arr[i] == 'W') W++;
            else B++;
        }
        if(B == k) return 0;
        ans = W;
        int start = 0, end = k;
        while(end < arr.length) {
            if(arr[end++] =='W') W++;
            else B++;

            if(arr[start++] == 'W') W--;
            else B--;

            ans = Math.min(ans, W);
        }
        return ans;

    }
}